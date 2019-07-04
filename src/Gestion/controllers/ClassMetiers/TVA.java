/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class TVA {
    @SuppressWarnings("FieldMayBeFinal")
    private static JSONObject lesTranches = new JSONObject();
    @SuppressWarnings("FieldMayBeFinal")
    private static int montantlimite = 0;
    @SuppressWarnings("FieldMayBeFinal")
    private static int tvalimite = 0;
    
    /**
     * tva = montant1--montant2
     * @param prixTotal
     * @return 
     */
    
    private static void recupererTVA(){
        try {
            JSONObject data = Gestion.utils.Utils.provider("Documents/parametres/TVA.properties");
            montantlimite = Gestion.utils.Utils.ObjectToInt(data.get("MontantLimite"));
            tvalimite = Gestion.utils.Utils.ObjectToInt(data.get("TVALimite"));
            data.remove("MontantLimite");
            data.remove("TVALimite");
            lesTranches = data;
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("TVA:recupererTVA:"+ex.toString(), true);
        }
    }
    
    public static int getTVA(int prixTotal){
        recupererTVA();
        int tva = 0;
        if(!lesTranches.isEmpty()){
           Set cle = lesTranches.keySet();
           @SuppressWarnings("LocalVariableHidesMemberVariable")
           String[] montant;
           @SuppressWarnings("UnusedAssignment")
           int montant1 = 0;
           @SuppressWarnings("UnusedAssignment")
           int montant2 = 0;
            for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
               try {
                   Object next = iterator.next();
                   montant = lesTranches.get(next).toString().split("--");
                   montant1 = Gestion.utils.Utils.ObjectToInt(montant[0]);
                   montant2 = Gestion.utils.Utils.ObjectToInt(montant[1]);
                   if(montant1<=prixTotal && prixTotal<=montant2){
                       tva = Gestion.utils.Utils.ObjectToInt(next);
                   }
                   if(prixTotal>montantlimite){
                       tva = tvalimite;
                   }
               } catch (Exception ex) {
                   Gestion.utils.Utils.addMessage("TVA:getTVA"+ex.toString(), true);
               }
            }
        }
        return tva;
    }
}
