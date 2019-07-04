/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.ClientMetier;
import Gestion.controllers.ClassMetiers.ProduitMetier;
import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import Gestion.controllers.ClassMetiers.VenteMetier;
import Gestion.metier.ActionVente;
import crud.Client;
import crud.Produit_vente;
import crud.Utilisateur;
import crud.Vente;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class VenteControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Vente vente;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    @SuppressWarnings("FieldMayBeFinal")
    private Utilisateur user;
    @SuppressWarnings("FieldMayBeFinal")
    private Client client;
    private ActionVente vendre;
    private JSONObject data;
    
    public VenteControlleur(int action,JSONObject data,UtilisateurMetier user1) {
        this.Action = action;
        this.requette = (JSONObject)data.get("lesproduits");
        this.retour = new JSONObject();
        this.user = Gestion.utils.ConverTypeObjet.metierTocrudUtilisateur(user1, true);
        this.vente = new Vente();
        this.vente.setType_enregistrement("vente");
        this.data = data;
        this.traitement();
    }

    private void traitement(){
        switch(Action){
            case 9:{
            try {
                this.client = Gestion.utils.ConverTypeObjet.metierTocrudClient((ClientMetier)data.get("client"),true);
                vendre = new ActionVente(convertedProduits(requette), client, user,vente);
                this.retour = vendre.faireUneVente();
            } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde des ventes");
                    Gestion.utils.Utils.addMessage("Vente:traitement1:"+ex.toString(), true);
            }
            }
            break;
            case 10:{
                try {
                    vente = Gestion.utils.ConverTypeObjet.metierTocrudVenteModifier((VenteMetier)requette.get("1"));
                    if(vente.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        vente.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierVente(vente));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de modification de la vente");
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de modification de la vente");
                    Gestion.utils.Utils.addMessage("Vente:traitement2:"+ex.toString(), true);
                }
            }
            break;
            case 11:{
                try {
                    int id = Gestion.utils.Utils.ObjectToInt(requette.get("idvente"));
                    int severe = Gestion.utils.Utils.ObjectToInt(requette.get("severe"));
                    vente = Gestion.utils.ConverTypeObjet.metierTocrudVente(id);
                    if(severe==0){
                        Produit_vente[] v = vente.produit_vente.toArray();
                        for (int i = 0; i < v.length; i++) {
                            Produit_vente v1 = v[i];
                            v1.deleteAndDissociate();
                        }
                        if(vente.deleteAndDissociate()){
                            this.retour.put("code","0");
                            this.retour.put("message",new JSONObject());
                        }else{
                            this.retour.put("code","1");
                            this.retour.put("message","Echec de suppression de la vente");              
                        }
                    }else{
                        System.out.println(vente.getEtat());
                        vente.setEtat(0);
                        System.out.println(vente.getEtat());
                        if(vente.save()){
                            this.retour.put("code","0");
                            this.retour.put("message",new JSONObject());
                        }else{
                            this.retour.put("code","1");
                            this.retour.put("message","Echec de suppression de la vente");              
                        } 
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de la vente");
                    Gestion.utils.Utils.addMessage("Vente:traitement3:"+ex.toString(), true);
                }   
            }
            break;
            case 13:{
                try {
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    Vente[] ventes = Vente.listVenteByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<ventes.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierVente(ventes[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des ventes");
                    Gestion.utils.Utils.addMessage("Vente:traitement4:"+ex.toString(), true);
                } 
            }
            break;
            case 31:{
                try {
                    JSONObject mes = Gestion.utils.DataUtils.getstat(this.requette.get("date").toString(),this.requette.get("type").toString());
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des ventes");
                    Gestion.utils.Utils.addMessage("Vente:traitement4:"+ex.toString(), true);
                } 
            }
            break;
        }
    }
    
    private JSONObject convertedProduits(JSONObject produit1){
       JSONObject produit2 = new JSONObject();
       Set cle = produit1.keySet();
        for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            produit2.put(next,Gestion.utils.ConverTypeObjet.metierTocrudProduit((ProduitMetier)(produit1.get(next)),true));
        }
       return produit2;
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
