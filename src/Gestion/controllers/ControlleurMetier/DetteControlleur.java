/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import Gestion.metier.ActionVente;
import crud.Client;
import crud.Utilisateur;
import crud.Vente;
import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public class DetteControlleur {
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
    public DetteControlleur(int action,JSONObject data,UtilisateurMetier user1){
        
    }
    public JSONObject getRetour() {
        return this.retour;
    }
}
