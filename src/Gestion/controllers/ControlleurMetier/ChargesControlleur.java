/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.ChargesMetier;
import crud.Charges;
import org.json.simple.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class ChargesControlleur {
    @SuppressWarnings("FieldMayBeFinal")
    private int Action;
    private JSONObject retour;
    private Charges charge;
    @SuppressWarnings("FieldMayBeFinal")
    private JSONObject requette;
    
    public ChargesControlleur(int action,JSONObject data) {
        this.Action = action;
        this.requette = data;
        this.retour = new JSONObject();
        this.traitement();
    }
    
    private void traitement(){
        switch(this.Action){
            case 32:{
                try {
                    charge = Gestion.utils.ConverTypeObjet.metierTOcrudCharges((ChargesMetier)requette.get("1"),false);
                    if(charge.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        charge.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierCharge(charge));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de sauvegarde de la charge");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de sauvegarde de la charge");
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                }
            }
            break;
            case 33:{
                try {
                    charge = Gestion.utils.ConverTypeObjet.metierTOcrudCharges((ChargesMetier)requette.get("1"),true);
                    if(charge.save()){
                        this.retour.put("code","0");
                        JSONObject json = new JSONObject();
                        charge.refresh();
                        json.put("0",Gestion.utils.ConverTypeObjet.crudTOmetierCharge(charge));
                        this.retour.put("message",json);
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de mise à jour de la charge");
                    }
                } catch (PersistentException ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de mise à jour de la charge");
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                }catch(Exception ex){
                    this.retour.put("code",1);
                    this.retour.put("message","doublure"); 
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                }

            }
            break;
            case 34:{
                try {
                    charge = Gestion.utils.ConverTypeObjet.metierTOcrudCharges((ChargesMetier)requette.get("1"),true);
                    if(charge.delete()){
                        this.retour.put("code","0");
                        this.retour.put("message",new JSONObject());
                    }else{
                        this.retour.put("code","1");
                        this.retour.put("message","Echec de suppression de la charge");              
                    }
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de suppression de la charge");
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                } 
            }
            break;
            case 41:{
                try {
                    charge = new Charges();
                    String condition = requette.get("condition").toString();
                    String order = requette.get("order").toString();
                    @SuppressWarnings("static-access")
                    Charges[] charges = charge.listChargesByQuery(condition, order);
                    JSONObject mes = new JSONObject();
                    for(int i=0;i<charges.length;i++){
                        mes.put(i,Gestion.utils.ConverTypeObjet.crudTOmetierCharge(charges[i]));
                    }
                    this.retour.put("code","0");
                    this.retour.put("message",mes);
                } catch (Exception ex) {
                    this.retour.put("code","1");
                    this.retour.put("message","Echec de liste des charges");
                    Gestion.utils.Utils.addMessage("ChargesControlleur:traitement:"+ex.toString(), true);
                }   
            }
        }
    }

    public JSONObject getRetour() {
        return this.retour;
    }
    
}
