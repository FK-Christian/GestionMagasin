/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.ClientMetier;
import crud.Client;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class ClientControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Client client;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public ClientControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }

    private void traitement(){
        switch(this.Action){
            case 20:{
                try {
                    client = Gestion.utils.ConverTypeObjet.metierTocrudClient((ClientMetier)requette.get("1"),false);
                    if(client.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        client.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierClient(client));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde du client");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde du client");
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 21:{
                try {
                    client = Gestion.utils.ConverTypeObjet.metierTocrudClient((ClientMetier)requette.get("1"),true);
                    if(client.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        client.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierClient(client));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour du client");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour du client");
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 22:{
                try {
                    client = Gestion.utils.ConverTypeObjet.metierTocrudClient((ClientMetier)requette.get("1"),true);
                    if(client.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression du client");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression du client");
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                }   
            }
            break;
            case 28:{
                try {
                    client = new Client();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Client[] clients = client.listClientByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<clients.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierClient(clients[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des clients");
                    Gestion.utils.Utils.addMessage("Client:traitement:"+ex.toString(), true);
                }   
            }
        } 
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
