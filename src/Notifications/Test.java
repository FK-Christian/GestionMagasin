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
public class Test {
    public static void main(String[] args) {
        JSONObject des = new JSONObject();
        des.put(0,"699876016");
        SMS_Message sms = new SMS_Message();
        sms.setPort(254);
        sms.setServerAddr("127.0.0.1");
        sms.runServeur();
        sms.setDestinataires(des);
        sms.setMessage("MERCI LE GENIE FKC");
        sms.sentMessage(sms.EncapsulerSMS());
        sms.sentMessage(sms.EncapsulerSMS());
        sms.sentMessage(sms.EncapsulerSMS());
        sms.sentMessage(sms.EncapsulerSMS());
        sms.sentMessage(sms.EncapsulerSMS());
        sms.stopServeur();
    }
}
