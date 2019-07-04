/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notifications;

import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public class AbsNotifications implements INotifications{
    private JSONObject destinataires;
    private String message;
    
    @Override
    public boolean sentMessage(JSONObject toSent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JSONObject getDestinataires() {
        return this.destinataires;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setDestinataires(JSONObject destinataires) {
        this.destinataires = destinataires;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public JSONObject receveMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}