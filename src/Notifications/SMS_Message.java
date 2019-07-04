package Notifications;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public class SMS_Message extends AbsNotifications{
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket socketClient;
    private int port;
    private String serverAddr;
    private Executor executeur;
    private Serveur serveur;
    private static boolean serveurIsRunning;
    private ServerSocket socketServeur = null;

    public void setPort(int port) {
        this.port = port;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }
    
    public JSONObject EncapsulerSMS(){
        JSONObject data = new JSONObject();
        data.put("message",super.getMessage());
        data.put("to",super.getDestinataires());
        return data;
    }
    
    public SMS_Message desencapsulerSMS(JSONObject data){
        SMS_Message sms = new SMS_Message();
        sms.setDestinataires((JSONObject) data.get("to"));
        sms.setMessage((String) data.get("message"));
        return sms;
    }
    
    public boolean createConnection(){
        boolean flag = false;
	try {
            this.socketClient = new Socket(InetAddress.getByName(serverAddr), port);
            output = new ObjectOutputStream(socketClient.getOutputStream());
            output.flush();
            input = new ObjectInputStream(socketClient.getInputStream());
            flag = true;
	} catch(IOException e) {
            System.err.println(e.getMessage());
	}
        return flag;
    }

    @Override
    public void finalize() throws Throwable {
            super.finalize();
    }
    
    public void closeConnexion(){
	try {
	    input.close();
	    output.close();
	    socketClient.close();
	} catch(IOException e) {
            e.printStackTrace();
	}
    }
    
    @Override
    public boolean sentMessage(JSONObject message){
        boolean test = false;
        try {
            createConnection();
            output.writeObject(message);
            output.flush();
            System.out.println("Data sent:   "+message);
            test = true;
            closeConnexion();
            finalize();
        } catch (Exception ex) {
            ex.printStackTrace();
        } catch (Throwable ex) {
            Logger.getLogger(SMS_Message.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }
    
    public JSONObject receveMessage(){
        JSONObject data = new JSONObject();
        
        return data;
    }
    
    public void runServeur(){
        executeur = Executors.newSingleThreadExecutor();
        serveur = new Serveur();
        executeur.execute(serveur);
    }
    
    public void stopServeur(){
        serveurIsRunning = false;
    }

    public int getport() {
        return this.port;
    }
    
    private class Serveur implements Runnable{
        
        @Override
        public void run() {
            try {	
                socketServeur = new ServerSocket(port);
                System.out.println("Attente de connection .......");
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            // Attente des connexions des clients
            try {
                Socket socketClient;
                serveurIsRunning = true;
                while(serveurIsRunning) {
                    socketClient = socketServeur.accept();
                    System.out.println("un client c'est connecté");
                    ThredCommunication thredCommunication = new ThredCommunication(socketClient);
                    Thread t = new Thread(thredCommunication);
                    t.run();
                }
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            // Fermeture de la socket
            try {
                socketServeur.close();
                System.out.println("close");
            } catch(IOException e) {
                System.err.println("Erreur lors de la fermeture de la socket : " + e);
                System.exit(-1);
            }
        }
    }
    
    private class ThredCommunication implements Runnable{
        private ObjectInputStream input;
        private ObjectOutputStream output;
        private boolean interrupted;

        public ThredCommunication(Socket socketClient) {
            this.interrupted = false;
            try {
                input = new ObjectInputStream(socketClient.getInputStream());
                output = new ObjectOutputStream(socketClient.getOutputStream());
                output.flush();
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
        
        @Override
        public void run() {
            System.out.println("dans le run");
            JSONObject data = new JSONObject();
            while(!interrupted){
                try {
                    data = (JSONObject) input.readObject();
                    System.out.println("Data receive:   "+data);
                    String texte = Gestion.vues.InterfacesGraphiques.Notifications.vue.getText();
                    if(!texte.isEmpty()) texte += "\n";
                    texte += "****************************"+Calendar.getInstance().getTime()+"******************************************************************\n";
                    Gestion.vues.InterfacesGraphiques.Notifications.vue.setText(texte+""+data+"\n\n");
                    interrupted = true;
                } catch (IOException ex) {
                    interrupted = true;
                    Logger.getLogger(ThredCommunication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    interrupted = true;
                    Logger.getLogger(ThredCommunication.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        
    }
    
}
