/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.metier;

import Gestion.vues.InterfacesGraphiques.PageDeLogin;
import crud.Client;
import crud.Produit;
import crud.Produit_vente;
import crud.Utilisateur;
import crud.Vente;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class ActionVente {
    @SuppressWarnings("FieldMayBeFinal")
    private Vente vente;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject lesproduitEtleursQte;
    @SuppressWarnings("FieldMayBeFinal")
    private Client client;
    private int prixDeVente;
    private int benefices;
    private Utilisateur user;
    
    public ActionVente(JSONObject lesProduits,Client cl,Utilisateur user1,Vente v){
        this.client = cl;
        this.lesproduitEtleursQte = lesProduits;
        this.prixDeVente = 0;
        this.benefices = 0;
        this.user = user1;
        this.vente = v;
    }
    
    public JSONObject faireUneVente() throws Exception{
        JSONObject retour = new JSONObject();
        boolean flag = false;
        try {
            vente.setClientidClient(client);
            vente.setEtat(1);
            vente.setUtilisateuridUser(user);
            vente.setDescription("");
            vente.setDate_de_vente((java.sql.Timestamp)Gestion.utils.Utils.getDate(null,0));
            Set cle = lesproduitEtleursQte.keySet();
            @SuppressWarnings("UnusedAssignment")
            int nbreArticle = 0;
            int prix_unitaire_vente = 0;
            String[] quant;
            String type = "";
            String dette = "";
            String description = "";
            Produit_vente[] listeDesVentes = new Produit_vente[cle.size()];
            int i = 0;
            for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                quant = next.toString().split("--");
                type = quant[3];
                dette = quant[4];
                description = quant[5];
                try {
                    @SuppressWarnings("UnusedAssignment")
                    Produit produit = new Produit();
                    Produit_vente produitVente = new Produit_vente();
                    nbreArticle = Gestion.utils.Utils.ObjectToInt(quant[1]);
                    prix_unitaire_vente = Gestion.utils.Utils.ObjectToInt(quant[2]);
                    produit = (Produit)lesproduitEtleursQte.get(next);
                    produit.setQuantite(produit.getQuantite() - nbreArticle);
                    produit.save();
                    produitVente.setNombre_article(nbreArticle);
                    produitVente.setProduitidProduit(produit);
                    produitVente.setVenteidVente(vente);
                    produitVente.setPrix_unitaire_de_vente_reel(prix_unitaire_vente);
                    prixDeVente += (nbreArticle * prix_unitaire_vente);
                    benefices += (nbreArticle * (prix_unitaire_vente - produit.getPrix_d_achat()));
                    listeDesVentes[i] = produitVente;
                    i++;
                } catch (Exception ex) {
                    Gestion.utils.Utils.addMessage("ActionVente:faireUneVente1:"+ex.toString(),true);
                }
            }
            vente.setMontant_de_dette(0);
            if(type.equals("vente")){
                vente.setType_enregistrement(type);
            }
            else{
                int val = prixDeVente - Integer.parseInt(dette);
                if(val<=0){
                    vente.setType_enregistrement("vente");
                }else{
                    vente.setType_enregistrement(type);
                    vente.setMontant_de_dette(val);
                    String m = "Le "+(java.sql.Timestamp)Gestion.utils.Utils.getDate(null,0)+" "+PageDeLogin.currentUser.getNom()+" "+PageDeLogin.currentUser.getPrenom()+" a reduit"
                            + " la dette de ce Client de "+Integer.parseInt(dette)+" FCFA";
                    vente.setDescription(m);
                }
            }
            vente.setPrix_de_vente(prixDeVente);
            vente.setTva(Gestion.controllers.ClassMetiers.TVA.getTVA(prixDeVente));
            vente.setBenefices(benefices);
            vente.setDescription(description);
            vente.save();
            for (Produit_vente listeDesVente : listeDesVentes) {
                listeDesVente.save();
            }
            flag = true;
        } catch (PersistentException ex) {
            Gestion.utils.Utils.addMessage("ActionVente:faireUneVente2:"+ex.toString(), true);
        }
        JSONObject ob = new JSONObject();
        if(flag){
            retour.put("code","0");
            vente.refresh();
            ob.put("Numfacture",vente.getORMID());
        }else{
            retour.put("code","1");
        }
        retour.put("message",ob);
        return retour;
    }
}
