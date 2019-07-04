/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.FournisseurMetier;
import crud.Fournisseur;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class FournisseurControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Fournisseur fournisseur;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public FournisseurControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }

    private void traitement(){
        switch(this.Action){
            case 0:{
                try {
                    fournisseur = Gestion.utils.ConverTypeObjet.metierTocrudFournisseur((FournisseurMetier)requette.get("1"),false);
                    if(fournisseur.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        fournisseur.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierFournisseur(fournisseur));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde du fournisseur");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde du fournisseur");
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 1:{
                try {
                    fournisseur = Gestion.utils.ConverTypeObjet.metierTocrudFournisseur((FournisseurMetier)requette.get("1"),true);
                    if(fournisseur.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        fournisseur.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierFournisseur(fournisseur));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour du fournisseur");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour du fournisseur");
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 2:{
                try {
                    fournisseur = Gestion.utils.ConverTypeObjet.metierTocrudFournisseur((FournisseurMetier)requette.get("1"),true);
                    if(fournisseur.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression du fournisseur");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression du fournisseur");
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 23:{
                try {
                    fournisseur = new Fournisseur();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Fournisseur[] fournisseurs = fournisseur.listFournisseurByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<fournisseurs.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierFournisseur(fournisseurs[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des fournisseurs");
                    Gestion.utils.Utils.addMessage("Fournisseur:traitement:"+ex.toString(), true);
                }   
            }
        } 
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
