/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import crud.Utilisateur;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class UtilisateurContrlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Utilisateur user;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public UtilisateurContrlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }

    private void traitement(){
        switch(this.Action){
            case 3:{
                try {
                    user = Gestion.utils.ConverTypeObjet.metierTocrudUtilisateur((UtilisateurMetier)requette.get("1"),false);
                    if(user.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        user.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierUtilisateur(user));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde de l'utilisateur");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde de l'utilisateur");
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 4:{
                try {
                    user = Gestion.utils.ConverTypeObjet.metierTocrudUtilisateur((UtilisateurMetier)requette.get("1"),true);
                    if(user.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        user.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierUtilisateur(user));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour de l'utilisateur");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour de l'utilisateur");
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 5:{
                try {
                    user = Gestion.utils.ConverTypeObjet.metierTocrudUtilisateur((UtilisateurMetier)requette.get("1"),true);
                    if(user.deleteAndDissociate()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression de l'utilisateur");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de l'utilisateur");
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 24:{
                try {
                    user = new Utilisateur();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Utilisateur[] users = user.listUtilisateurByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<users.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierUtilisateur(users[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des utilisateurs");
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 30:{
                try {
                    user = new Utilisateur();
                    String login = requette.get("login").toString();
                    String pass = requette.get("pass").toString();
                    String condition = "login='"+login+"' and motdepass='"+pass+"'";
                    @SuppressWarnings("static-access")
                    Utilisateur[] users = user.listUtilisateurByQuery(condition, "nom asc");
                    JSONObject mes = new JSONObject();
                    if(users.length>=1){
                        for(int i=0;i<users.length;i++){
                            mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierUtilisateur(users[i]));
                        }
                        this.retour.put("code","0");
                        this.retour.put("message",mes);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Utilisateur inexistant");
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de connection");
                    Gestion.utils.Utils.addMessage("Utilisateur:traitement:"+ex.toString(), true);
                }   
            }
        }       
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
