package Notifications;

import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public interface INotifications {
    public boolean sentMessage(JSONObject toSent);
    public JSONObject receveMessage();
    public JSONObject getDestinataires();
    public String getMessage();
    public void setDestinataires(JSONObject destinataires);
    public void setMessage(String message);
}
