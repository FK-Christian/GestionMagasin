/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.AddressMetier;
import crud.Address;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class AddressControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Address addresse;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public AddressControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }
    
    private void traitement(){
        switch(this.Action){
            case 14:{
                try {
                    addresse = Gestion.utils.ConverTypeObjet.metierTOcrudAddresse((AddressMetier)requette.get("1"),false);
                    System.out.println(addresse.getBoitePostal());
                    System.out.println(((AddressMetier)requette.get("1")).getBoitePostal());
                        String condition = "numtel = '"+addresse.getNumtel()+"' and boitePostal ='"+addresse.getBoitePostal()+"'";
                        String order = "numtel asc";
                        Address[] addresses = Address.listAddressByQuery(condition, order);
                        if(addresses.length==0){
                            if(addresse.save()){
                                this.retour.put("code","0");
                                JSONObject json = new JSONObject();
                                addresse.refresh();
                                json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierAddresse(addresse));
                                this.retour.put("message",json);
                            }else{
                                this.retour.put("code","1");
                                this.retour.put("message","Echec de sauvegarde de l'addresse !!!");
                            }
                        }else{
                            addresse = addresses[0];
                            this.retour.put("code","0");
                            JSONObject json = new JSONObject();
                            addresse.refresh();
                            json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierAddresse(addresse));
                            this.retour.put("message",json);
                        }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde de l'addresse");
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    ex.printStackTrace();
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 15:{
                try {
                    addresse = Gestion.utils.ConverTypeObjet.metierTOcrudAddresse((AddressMetier)requette.get("1"),true);
                    if(addresse.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        addresse.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierAddresse(addresse));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour de l'addresse");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour de l'addresse");
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                }

            }
            break;
            case 16:{
                try {
                    addresse = Gestion.utils.ConverTypeObjet.metierTOcrudAddresse((AddressMetier)requette.get("1"),true);
                    if(addresse.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression de l'addresse");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de l'addresse");
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 26:{
                try {
                    addresse = new Address();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Address[] addresses = addresse.listAddressByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<addresses.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierAddresse(addresses[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des addresses");
                    Gestion.utils.Utils.addMessage("AddressControlleur:traitement:"+ex.toString(), true);
                }   
            }
        }
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
