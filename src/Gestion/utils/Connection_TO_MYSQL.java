/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
/**
 *
 * @author christian
 */
public class Connection_TO_MYSQL {
   private String pass;
   private String url; //bdname
   private String user;
   private boolean etat;
   private static Connection state;
   public void setPass(String m){this.pass = m;}
   public void setUrl(String m){this.url = m;}
   public void setUser(String m){this.user = m;}
   public Connection getConnection(){return this.state;}
   public boolean getEtat(){return this.etat;}
   Connection_TO_MYSQL(){
       initialiser_la_connection();
   } // constructeur
   private void initialiser_la_connection(){
       JSONObject f = Gestion.utils.Utils.provider("Documents/parametres/paramBD.properties");
       setUser(f.get("UserName").toString());
       setPass(f.get("Password").toString());
       setUrl(f.get("URL").toString());  
   }
   public void Statut(){
       etat = false;
       state = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
       } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"MYSQL ERROR PILOTE INTROUVABLE !!!");
       }
       try{
           state = DriverManager.getConnection(url,user,pass);
           etat = true;
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"MYSQL ERROR CONNECTION FAUSSE:\n MOT DE PASSE OU NOM D'UTILISATEUR OU NOM DE BD \n INCORRECT!!!");
	} 
   }
   public void close_state(){
       etat = false;
       try {
           state.close();
           etat = true;
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"MYSQL ERROR: ERREUR DE FERMETURE DE CONNECTION !!!");
       }
   }
}
