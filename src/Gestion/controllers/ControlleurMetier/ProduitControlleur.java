/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.ProduitMetier;
import crud.Produit;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class ProduitControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Produit produit;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public ProduitControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }

    private void traitement(){
        switch(this.Action){
            case 6:{
                try {
                    produit = Gestion.utils.ConverTypeObjet.metierTocrudProduit((ProduitMetier)requette.get("1"),false);
                    if(produit.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        produit.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierProduit(produit));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde du produit");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde du produit");
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 7:{
                try {
                    produit = Gestion.utils.ConverTypeObjet.metierTocrudProduit((ProduitMetier)requette.get("1"),true);
                    if(produit.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        produit.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierProduit(produit));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour du produit");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour du produit");
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 8:{
                try {
                    produit = Gestion.utils.ConverTypeObjet.metierTocrudProduit((ProduitMetier)requette.get("1"),true);
                    produit.categoriesidCategories.clear();
                    produit.fournisseuridfournisseur.clear();
                    produit.save();
                    if(produit.deleteAndDissociate()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression du produit");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression du produit");
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 12:{
                try {
                    produit = new Produit();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    Produit[] produits = Produit.listProduitByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    int nbre = 0;
                    for (Produit produit1 : produits) {
                        mes.put(nbre,Gestion.utils.ConverTypeObjet.crudTOmetierProduit(produit1));
                        nbre++;
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des produits");
                    Gestion.utils.Utils.addMessage("Produit:traitement:"+ex.toString(), true);
                }   
            }
        }   
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
