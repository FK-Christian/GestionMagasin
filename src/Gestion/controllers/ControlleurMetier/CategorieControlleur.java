/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.CategorieMetier;
import Gestion.controllers.ClassMetiers.GcategorieMetier;
import crud.Categories;
import crud.Grandecategorie;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class CategorieControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Categories categorie;
    private Grandecategorie Gcategorie;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public CategorieControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }
    
    private void traitement(){
        switch(this.Action){
            case 17:{
                try {
                    categorie = Gestion.utils.ConverTypeObjet.metierTocrudCategorie((CategorieMetier)requette.get("1"),false);
                    if(Categories.listCategoriesByQuery("designation='"+categorie.getDesignation()+"' and GrandeCategorie_idGrandeCategorie = "+categorie.getGrandeCategorie_idGrandeCategorie(),"designation asc").length==0){
                        if(categorie.save()){
                            this.retour.put("code","0");
                            JSONObject json = new JSONObject();
                            categorie.refresh();
                            json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierCategorie(categorie));
                            this.retour.put("message",json);
                        }else{
                            this.retour.put("code","1");
                            this.retour.put("message","Echec de sauvegarde de la categorie");
                        }
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde de la categorie");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 18:{
                try {
                    categorie = Gestion.utils.ConverTypeObjet.metierTocrudCategorie((CategorieMetier)requette.get("1"),true);
                    if(categorie.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        categorie.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierCategorie(categorie));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour de la categorie");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 19:{
                try {
                    categorie= Gestion.utils.ConverTypeObjet.metierTocrudCategorie((CategorieMetier)requette.get("1"),true);
                    if(categorie.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression de la categorie");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 27:{
                try {
                    categorie = new Categories();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Categories[] categories = categorie.listCategoriesByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<categories.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierCategorie(categories[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des categories");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 38:{
                try {
                    Gcategorie = Gestion.utils.ConverTypeObjet.metierTocrudGCategorie((GcategorieMetier)requette.get("1"),false);
                    if(Gcategorie.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        Gcategorie.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierGcategorie(Gcategorie));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde de la categorie");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 39:{
                try {
                    Gcategorie = Gestion.utils.ConverTypeObjet.metierTocrudGCategorie((GcategorieMetier)requette.get("1"),true);
                    if(Gcategorie.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        Gcategorie.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierGcategorie(Gcategorie));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour de la categorie");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure !!!"); 
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 40:{
                try {
                    Gcategorie= Gestion.utils.ConverTypeObjet.metierTocrudGCategorie((GcategorieMetier)requette.get("1"),true);
                    if(Gcategorie.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression de la categorie");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de la categorie");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 43:{
                try {
                    Gcategorie = new Grandecategorie();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Grandecategorie[] categories = Gcategorie.listGrandecategorieByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<categories.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierGcategorie(categories[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des categories");
                    Gestion.utils.Utils.addMessage("Categorie:traitement:"+ex.toString(), true);
                }   
            }
            break;
        }
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
