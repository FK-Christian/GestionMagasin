package Gestion.utils;

import Gestion.vues.InterfacesGraphiques.AutresStatistiques;
import Gestion.vues.InterfacesGraphiques.PagePrincipale;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import crud.GesMagPersistentManager;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.json.simple.JSONObject;
import org.orm.cfg.JDBCConnectionSetting;

public class Utils {
    
    private static final String lien = provider("Documents/parametres/param.properties").get("lien_test").toString();
    
    public static boolean modificationBD(JSONObject data,boolean applicationNondemarer){
        boolean flag = false;
        if(applicationNondemarer){
            try{
                JDBCConnectionSetting con = new JDBCConnectionSetting();
                JDBCConnectionSetting con1 = new JDBCConnectionSetting();
                con.setDialect(data.get("dialect").toString());
                con.setConnectionURL(data.get("URL").toString());
                con.setDriverClass(data.get("driver_class").toString());
                con.setUserName(data.get("UserName").toString());
                con.setPassword(data.get("Password").toString());
                GesMagPersistentManager.setJDBCConnectionSetting(con);
                if(Statut(data)){
                    flag = true;
                    GesMagPersistentManager.saveJDBCConnectionSetting();
                    File f1 = new File("ormmapping/GesMag.cfg.xml");
                    File f2 = new File("ormmapping");
                    f1.delete();
                    f2.delete();
                }
            }catch(Exception e){
                addMessage(e.toString(), true);
                flag = false;
            }
        }else{
            if(Statut(data)){
                flag = true;
            } 
        }
        return flag;
   } 
    
    private static boolean Statut(JSONObject data){
       boolean etat = false;
       Connection state = null;
       try{
           Class.forName(data.get("driver_class").toString());
           state = DriverManager.getConnection(data.get("URL").toString(),data.get("UserName").toString(),data.get("Password").toString());
           etat = true;
           state.close();
        }catch(ClassNotFoundException | SQLException e) {
            addMessage(e.toString(),true);
	} 
       return etat;
   }
    
    private static Connection getCon(){
       JSONObject data = provider("Documents/parametres/paramBD.properties");
       try{
           Class.forName(data.get("driver_class").toString());
           return DriverManager.getConnection(data.get("URL").toString(),data.get("UserName").toString(),data.get("Password").toString());
        }catch(ClassNotFoundException | SQLException e) {
            addMessage(e.toString(),true);
	} 
       return null;
   }
    
    public static String getDateActueloder(){
        Calendar cal = Calendar.getInstance();
        String J = ""+cal.get(Calendar.DAY_OF_MONTH);
        String M = ""+(cal.get(Calendar.MONTH)+1);
        String Y = ""+cal.get(Calendar.YEAR);
        return Y+"/"+M+"/"+J;
    }
    
    public static String getDateActuel(){
        Calendar cal = Calendar.getInstance();
        String J = ""+cal.get(Calendar.DAY_OF_MONTH);
        String M = ""+(cal.get(Calendar.MONTH)+1);
        String Y = ""+cal.get(Calendar.YEAR);
        return Y+"-"+M+"-"+J;
    }
    
    public static String getCurrentTime(){
        Calendar cal = Calendar.getInstance();
        String J = ""+cal.get(Calendar.DAY_OF_MONTH);
        String M = ""+(cal.get(Calendar.MONTH)+1);
        String Y = ""+cal.get(Calendar.YEAR);
        String H = ""+cal.get(Calendar.HOUR_OF_DAY);
        String Min = ""+cal.get(Calendar.MINUTE);
        String Sec = ""+cal.get(Calendar.SECOND);
        return Y+"_"+M+"_"+J+"_"+H+"_"+Min+"_"+Sec;
    }
    
    public static String getMoisActuel(){
       Calendar cal = Calendar.getInstance();
       return ""+(cal.get(Calendar.MONTH)+1);
    }
    
    public static Object getDate(Object data,int type){
        Object date = null;
        switch(type){
            case 0:{ // DATE ACTUELLE (java.sql.Timestamp)
                return new java.sql.Timestamp(new java.util.Date().getTime());    
            }
            case 1:{ // DATE JCALENDAR to DATE METIER (java.util.Date)
                Calendar cal = ((org.freixas.jcalendar.JCalendarCombo)data).getCalendar();
                String J = ""+cal.get(Calendar.DAY_OF_MONTH);
                String M = ""+(cal.get(Calendar.MONTH)+1);
                String Y = ""+cal.get(Calendar.YEAR);
                return new java.util.Date(Y+"/"+M+"/"+J);    
            }
            case 3:{ // DATE JCALENDAR to DATE METIER (java.sql.Timestamp)
                return new java.sql.Timestamp(((java.util.Date)(getDate(data,1))).getTime());
            }
            case 2:{ // DATE METIER to JCALENDAR 
                return ((java.util.Date)data).toLocaleString();
            }
            case 4:{
                Calendar cal = ((org.freixas.jcalendar.JCalendarCombo)data).getCalendar();
                String J = ""+cal.get(Calendar.DAY_OF_MONTH);
                String M = ""+(cal.get(Calendar.MONTH)+1);
                String Y = ""+cal.get(Calendar.YEAR);
                return Y+"-"+M+"-"+J;
            }
            case 5:{
                Calendar cal = ((org.freixas.jcalendar.JCalendarCombo)data).getCalendar();
                String Y = ""+cal.get(Calendar.YEAR);
                return Y;
            }
            case 6:{
                Calendar cal = ((org.freixas.jcalendar.JCalendarCombo)data).getCalendar();
                String M = ""+(cal.get(Calendar.MONTH)+1);
                return M;
            }
        }
        return date;
    }
    
    public static String mettreSous6Positions(String m){
        if(m.length()<6){
            for (int i = m.length(); i < 6; i++) {
                m = "0"+m; 
            }
        }else{
            if(m.length()>6){
                m = m.substring(0,6);
            }
        }
        return m;
    }
     
    public static int ContractTypeAction(int action){
        int contractedAction;
        if(action==0 || action==1 || action==2 || action==23){
            contractedAction = 1;
        }else if(action==3 || action==4 || action==5 || action==30 || action==24){
            contractedAction = 2;
        }else if(action==6 || action==7 || action==8 || action==12){
            contractedAction = 3;
        }else if(action==9 || action==10 || action==11 || action==13 || action==31){
            contractedAction = 4;
        }else if(action==14 || action==15 || action==16 || action==26){
            contractedAction = 5;
        }else if(action==17 || action==18 || action==19 || action==27 || action==38 || action==39 || action==40 || action==43){
            contractedAction = 6;
        }else if(action==20 || action==21 || action==22 || action==28){
            contractedAction = 7;
        }else if(action==32 || action==33 || action==34 || action==41){
            contractedAction = 8;
        }else if(action==35 || action==36 || action==37){
            contractedAction = 9;
        }else{
            contractedAction = 10;
        }
        return contractedAction;
    }
    
    public static String getValeurAction(int action){
        switch(action){
            case 0: return "Ajouter un fornisseur";
            case 1: return "Modifier un fournisseur";
            case 2: return "supprimer un fournisseur";
            case 23: return "lister les fournisseurs";
            case 3: return "Ajouter un utilisateur";
            case 4: return "modifier un utilisateur";
            case 5: return "supprimer un utilisateur";
            case 24: return "lister les utilisateurs";
            case 30: return "Connection d'un utilisateur";
            case 6: return "Ajouter un produit";
            case 7: return "modifier un produit";
            case 8: return "supprimer un produit";
            case 12: return "lister les produits";
            case 9: return "Ajouter une vente";
            case 10: return "Modifier une vente";
            case 11: return "Supprimer une vente";
            case 13: return "lister les ventes";
            case 14: return "Ajouter une Adress";
            case 15: return "Modifier une Adress";
            case 16: return "Supprimer une Adress";
            case 26: return "Lister les Adresses";
            case 17: return "Ajouter une Categorie";
            case 18: return "Modifier une Categorie";
            case 19: return "Supprimer une Categorie";
            case 27: return "Lister les Categories";
            case 20: return "Ajouter un Client";
            case 21: return "Modifier un Client";
            case 22: return "Supprimer un Client";
            case 28: return "Lister les Clients";
            case 31: return "Lister autres statistiques";
            default: return "Action inconnu code: "+action;
        }
    }

    public static int ObjectToInt(Object o) throws Exception {
        return Integer.parseInt(o.toString());
    }
    
    @SuppressWarnings("null")
    public static String CrypterUneChaine(String clearPass,String type){
        byte[] hash = null;
        try {
//                MessageDigest md = MessageDigest.getInstance("MD5");
                MessageDigest md = MessageDigest.getInstance(type);
                hash = md.digest(clearPass.getBytes());
        } catch (NoSuchAlgorithmException e) {
                System.out.println("Algorithme de cryptage non disponible");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hash.length; ++i) {
                String hex = Integer.toHexString(hash[i]);
                if (hex.length() == 1) {
                        sb.append(0);
                        sb.append(hex.charAt(hex.length() - 1));
                } else {
                        sb.append(hex.substring(hex.length() - 2));
                }
        }
        return sb.toString();
    }
    
    public static JSONObject provider(String FICHIER_PROPERTIES){
        JSONObject param = new JSONObject();
        Properties properties = new Properties();
	InputStream fichierProperties = null;
        try {
            fichierProperties = new FileInputStream(FICHIER_PROPERTIES);
            properties.load(fichierProperties);
            Enumeration<?> e = properties.propertyNames();
            
            while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = properties.getProperty(key);
                        param.put(key, value);
		}
            
            
        } catch (Exception e) {
        } finally {
		if (fichierProperties != null) {
			try {
				fichierProperties.close();
			} catch (IOException e) {
			}
		}
        }
        return param;
    }
    
    @SuppressWarnings("null")
    public static void setparam(String nomFichier,JSONObject data){
        FileWriter fichier = null;
        BufferedWriter tampon = null;
        try {
            fichier = new FileWriter(nomFichier, false);
            tampon = new BufferedWriter(fichier);
            Set cle = data.keySet();
            for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                tampon.write(next.toString()+" = "+data.get(next).toString()+"\n");
            }
            tampon.write("\n");
        } catch (IOException exception) {
            
        } finally {
            try {
                tampon.flush();
                tampon.close();
                fichier.close();
            } catch (IOException e1) {
                
            }
        }
    }

    @SuppressWarnings({"UnusedAssignment", "null"})
    public static void addMessage(String data,boolean flag) {
        String[] mesmois = {"", "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
        File fichierlog;
        String filename = "";
        Calendar calendrier = Calendar.getInstance();
        int mois = (calendrier.get(Calendar.MONTH) + 1);
        String annee = "" + calendrier.get(Calendar.YEAR);
        if(flag) {
            filename += mesmois[mois] + "-" + annee + "-LogGestionMagasin.txt";
            if (isWin32()) {
                fichierlog = new File("Documents\\Logs\\" + filename);
            } else {
                fichierlog = new File("Documents/Logs/" + filename);
            }
        }
        else {
            filename += mesmois[mois] + "-" + annee + "-JournalGestionMagasin.txt";
            if (isWin32()) {
                fichierlog = new File("Documents\\Journal\\" + filename);
            } else {
                fichierlog = new File("Documents/Journal/" + filename);
            }
        }
        data = calendrier.getTime().toString() + " ---- " + data;
        if (!fichierlog.exists()) {
            try {
                fichierlog.createNewFile();
            } catch (IOException ex) {
                
            }
        }
        FileWriter fichier = null;
        BufferedWriter tampon = null;
        try {
            fichier = new FileWriter(fichierlog, true);
            tampon = new BufferedWriter(fichier);
            tampon.write(data + "\n");
            tampon.write("\n");
        } catch (IOException exception) {
            
        } finally {
            try {
                tampon.flush();
                tampon.close();
                fichier.close();
            } catch (IOException e1) {
                
            }
        }
    }
    
    public static String lireJournal(File fichier){
	String ft = "";
	FileReader fr;
	try {
            fr = new FileReader(fichier);
            String str="";
            int i = 0;
            while((i = fr.read ()) != -1){ str += (char)i; ft = str;}
	} catch (FileNotFoundException e) {
            addMessage(e.toString(), true);
	} catch (IOException e) {
            addMessage(e.toString(), true);
	}
        return ft;
    }
    
    public static boolean TestConnectionInternet(){
        boolean connectivity;
        try {
            URL url = new URL("http://www.google.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            connectivity = true;
        } catch (Exception e) {
            connectivity = false;
        }
        return connectivity;
    }
    
    public static boolean testerLesMiseAjours(){
        boolean flag = false;
        URL url;
        try {
            url = new URL(lien);
            System.out.println("Controle ...");
            File test_version = new File("Documents/parametres/testVersion.txt");
            if(test_version.exists()) test_version.delete();
            System.out.println("Controle !!!");
            Telecharger(lien,"Documents/parametres/testVersion.txt");
            System.out.println("Controle 1...");
            String contenu = provider("Documents/parametres/testVersion.txt").get("version").toString();
            System.out.println("Controle 2...");
            String m = provider("Documents/parametres/param.properties").get("version").toString();
            flag = !m.equals(contenu);
            System.out.println(flag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    @SuppressWarnings("null")
    public static void Telecharger(String chemin,String out){
	InputStream input = null;
        FileOutputStream writeFile = null;
        try{
            URL url = new URL(chemin);
            URLConnection connection = url.openConnection();
            input = connection.getInputStream();
            writeFile = new FileOutputStream(out);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = input.read(buffer)) > 0) writeFile.write(buffer, 0, read);
            writeFile.flush();
	}catch (Exception e){
            System.out.println("Error while trying to download the file.");
            e.printStackTrace();
	}finally{
            try{
                writeFile.close();
                input.close();
            }
            catch (IOException e){
               e.printStackTrace();
            }
        }
    }
    
    private static boolean isWin32(){
        return System.getProperty("os.name").startsWith("Windows");
    }

    public static JSONObject importfile() {
        JSONObject retour = new JSONObject();
        String[] data = new String[10];
        data[1] = "client";       data[3] = "grandecategorie";
        data[7] = "produit";       data[8] = "produit_categories";
        data[2] = "fournisseur";       data[4] = "charges";
        data[0] = "address";       data[9] = "fournisseur_produit";
        data[6] = "categories";       data[5] = "utilisateur";
        ArrayList<String[]> champs = Gestion.utils.DataUtils.getChamps();
        String str1 = new String("\"");
        String str2 = new String("'");
        try {
            String ligne,insert,update,titre;
            File f = new File("Documents/Datas/");
            int t = 0;
            for (int i = 0; i < data.length; i++) {
                String data1 = f.getAbsolutePath()+"\\"+data[i]+".txt";
                BufferedReader fichier = new BufferedReader(new FileReader(data1));
                JSONObject contVal = new JSONObject();
                JSONObject contTab = new JSONObject();
                Vector<String> lesLignes = new Vector<String>();
                int k = 0;
                //********************************************************
                try {
                    FileReader file = new FileReader(data1);
                    String unEnregistrement = ""; int pas = 0;
                    while((pas = file.read ()) != -1){ 
                        unEnregistrement += (char)pas;
                        if(unEnregistrement.length()>7 && unEnregistrement.endsWith("--FIN--")){
                            String val = unEnregistrement.replaceAll("--FIN--","");
                            lesLignes.add(val);
                            unEnregistrement = "";
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //********************************************************
                for (int p = 0; p < lesLignes.size(); p++) {
                    ligne = lesLignes.get(p);
//                while ((ligne = fichier.readLine()) != null) {
                    JSONObject valeurs = new JSONObject();
                    String[] eltLigne = ligne.split("--FKC--");  // ICIIIIIIIIIIIIIIIIIIIIIIIIIII
                    insert = "("; update = "";titre="(";
                    if(data[i].equals("address") || data[i].equals("client")){
                        for (int j = 1; j < eltLigne.length; j++) {
                            update += champs.get(i)[j]+"="+eltLigne[j]+", ";
                            titre += champs.get(i)[j]+", ";
                            insert += eltLigne[j]+", ";
                        }
                        insert = insert.substring(0,insert.length()-2);
                        insert += ")";
                    }else{
                        for (int j = 0; j < eltLigne.length; j++) {
//                            if(!champs.get(i)[j].equals("quantite")){
                                update += champs.get(i)[j]+"="+eltLigne[j]+", ";
                                titre += champs.get(i)[j]+", ";
//                            }
                        } 
                        ligne = ligne.replaceAll("--FKC--",",");
                        insert += ligne +")";
                    }
                    update = update.substring(0,update.length()-2);
                    titre = titre.substring(0,titre.length()-2);
                    titre += ")";
                    insert = insert.replaceAll(str1,str2);
                    update = update.replaceAll(str1,str2);
                    valeurs.put("insert",insert);
                    valeurs.put("update",update);
                    valeurs.put("titre", titre);
                    contVal.put(k, valeurs);
                    k++;
                }
                contTab.put("table",data[i]);
                contTab.put("valeurs",contVal);
                retour.put(t,contTab);
                t++;
                fichier.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return retour;
    }
    
    public static JSONObject importAllfile() {
        JSONObject retour = new JSONObject();
        String[] data = new String[12];
        data[1] = "client";       data[3] = "grandecategorie";
        data[7] = "produit";       data[8] = "produit_categories";
        data[2] = "fournisseur";       data[4] = "charges";
        data[0] = "address";       data[9] = "fournisseur_produit";
        data[6] = "categories";       data[5] = "utilisateur";
        data[10] = "vente";         data[11] = "produit_vente";
        ArrayList<String[]> champs = Gestion.utils.DataUtils.getChamps();
        try {
            String ligne,insert,update,titre;
            File f = new File("Documents/DatasAll/");
            int t = 0;
            for (int i = 0; i < data.length; i++) {
                String data1 = f.getAbsolutePath()+"\\"+data[i]+".txt";
                BufferedReader fichier = new BufferedReader(new FileReader(data1));
                JSONObject contVal = new JSONObject();
                JSONObject contTab = new JSONObject();
                Vector<String> lesLignes = new Vector<String>();
                int k = 0;
                //********************************************************
                try {
                    FileReader file = new FileReader(data1);
                    String unEnregistrement = ""; int pas = 0;
                    while((pas = file.read ()) != -1){ 
                        unEnregistrement += (char)pas;
                        if(unEnregistrement.length()>7 && unEnregistrement.endsWith("--FIN--")){
                            String val = unEnregistrement.replaceAll("--FIN--","");
                            lesLignes.add(val);
                            unEnregistrement = "";
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //********************************************************
                for (int p = 0; p < lesLignes.size(); p++) {
                    ligne = lesLignes.get(p);
//                while ((ligne = fichier.readLine()) != null) {
                    JSONObject valeurs = new JSONObject();
                    String[] eltLigne = ligne.split("--FKC--"); // ICIIIIIIIIIIIIIIIIIIIIIIIIIII
                    insert = "("; update = "";titre="(";
                    for (int j = 0; j < eltLigne.length; j++) {
                        update += champs.get(i)[j]+"="+eltLigne[j]+", ";
                        titre += champs.get(i)[j]+", ";
                    }
                    ligne = ligne.replaceAll("--FKC--",",");
                    insert += ligne +")";
                    update = update.substring(0,update.length()-2);
                    titre = titre.substring(0,titre.length()-2);
                    titre += ")";
//                    insert = insert.replaceAll(str1,str2);
//                    update = update.replaceAll(str1,str2);
                    valeurs.put("insert",insert);
                    valeurs.put("update",update);
                    valeurs.put("titre", titre);
                    contVal.put(k, valeurs);
                    k++;
                }
                contTab.put("table",data[i]);
                contTab.put("valeurs",contVal);
                retour.put(t,contTab);
                t++;
                fichier.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return retour;
    }

    public static void SaveOrGetInInternet(boolean b) throws Exception{
        JavaDropbox javaDropbox = new JavaDropbox();
        JSONObject json = Gestion.utils.Utils.provider("Documents/parametres/param.properties");  
        String fichier = json.get("datas").toString();
        if(javaDropbox.authDropbox(json.get("appkey").toString(),json.get("appsecret").toString()) != null){
            if(b){
                javaDropbox.if_exist_delete(fichier+".zip");
                javaDropbox.uploadToDropbox(fichier+".zip");
            }
            else javaDropbox.downloadFromDropbox(fichier+".zip");
        }else{
            PagePrincipale.AfficherMessage("ACTION ANNULEE!!!",2);
        }
    }

    public static void SaveOrGetInInternetAll(boolean b) throws Exception{
        JavaDropbox javaDropbox = new JavaDropbox();
        JSONObject json = Gestion.utils.Utils.provider("Documents/parametres/param.properties");
        String fichier = json.get("datas").toString();
        String fichierAll = json.get("Alldatas").toString();
        if(javaDropbox.authDropbox(json.get("appkey").toString(),json.get("appsecret").toString()) != null){
            if(b){
                javaDropbox.if_exist_delete(fichierAll+".zip");
                javaDropbox.uploadToDropbox(fichierAll+".zip");
                javaDropbox.if_exist_delete(fichier+".zip");
                javaDropbox.uploadToDropbox(fichier+".zip");
            }
            else javaDropbox.downloadFromDropbox(fichierAll+".zip");
        }else{
            PagePrincipale.AfficherMessage("ACTION ANNULEE!!!",2);
        }
    }

    public static boolean copieFichier(String chemin_source, String chemin_destination) {
        boolean resultat = false;
        File source = new File(chemin_source);
        File destination = new File(chemin_destination);
        java.io.FileInputStream sourceFile = null;
        java.io.FileOutputStream destinationFile = null;
        try {
            destination.createNewFile();
            sourceFile = new java.io.FileInputStream(source);
            destinationFile = new java.io.FileOutputStream(destination);
            byte buffer[]=new byte[512*1024];
            int nbLecture;
            while( (nbLecture = sourceFile.read(buffer)) != -1 ) {
                destinationFile.write(buffer, 0, nbLecture);
            }
            resultat = true;
        } catch( java.io.FileNotFoundException f ) {
        } catch( java.io.IOException e ) {
        } finally {
            try {
                sourceFile.close();
            } catch(Exception e) { }
            try {
                destinationFile.close();
            } catch(Exception e) { }
        }
        return( resultat );
    }
    
    public static void impression(String[] titresTableau,String sortie,String titre,JSONObject data){
        String columnNames[] = titresTableau;
        JSONObject fiche = Gestion.utils.Utils.provider("Documents/parametres/param.properties");
        Document document = new Document(PageSize.A4);
        try
        {
            PdfWriter.getInstance(document, new FileOutputStream("Documents/fiches/"+sortie));
            document.open();
            document.add(new Paragraph("\nPROPRIÉTAIRE : "+fiche.get("Nom_magasin")+"\n\t"+fiche.get("Email_magasin")+"  "+fiche.get("Tel_magasin")+"\n" +
                "SLOGANT: "+fiche.get("slogan")+" \n\n\n\t\n\n\n\n"));
            Paragraph p = new Paragraph(titre+"\n\n\n\n\n\n");
            document.add(p);
            String val = data.get(-1).toString();
            JSONObject data1 = new JSONObject();
            if(val.equals("-1")) {
                data1 = (JSONObject) data.get("charges");
                data.remove("charges");
            }
            data.remove(-1);
            PdfPTable table = new PdfPTable(columnNames.length);
            table.setTotalWidth(700F);
            for(int i = 0; i < columnNames.length; i++){
                table.addCell(columnNames[i]);
            }
            Set cle = data.keySet();
            for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String[] temp = (String[]) data.get(next);
                for(int j = 0; j < columnNames.length; j++){
                    table.addCell(temp[j]);
                }  
            }
            document.add(table);
            if(val.equals("-1")){
                document.add(new Paragraph("\t "+data1.get("beneficebrut")+"\n\n"));
                String[] titre1 = (String[]) data1.get("titrecharges");
                String beN = data1.get("beneficenet").toString();
                String Tch = data1.get("Tcharges").toString();
                data1.remove("beneficebrut");
                data1.remove("titrecharges");
                data1.remove("beneficenet");
                data1.remove("Tcharges");
                PdfPTable table1 = new PdfPTable(titre1.length);
                table1.setTotalWidth(700F);
                for(int i = 0; i < titre1.length; i++){
                    table1.addCell(titre1[i]);
                }
                Set cle1 = data1.keySet();
                for (Iterator iterator = cle1.iterator(); iterator.hasNext();) {
                    Object next = iterator.next();
                    String[] temp = (String[]) data1.get(next);
                    for(int j = 0; j < titre1.length; j++){
                        table1.addCell(temp[j]);
                    }  
                }
                document.add(table1);
                document.add(new Paragraph("\t "+Tch+"\n\n"));
                document.add(new Paragraph("\t "+beN+"\n\n"));
                val = "";
            }
            document.add(new Paragraph("\t "+val+"\n\n"));
            document.add(new Paragraph("Tout Droit Reservé !!!\n\n"));
            Calendar c = Calendar.getInstance();
            document.add(new Paragraph((new StringBuilder("                              ")).append(c.getTime()).toString()));
            document.close();
            PagePrincipale.AfficherMessage("OUVREZ LE FICHIER: Documents/fiches/"+sortie,1);
            Desktop.getDesktop().open(new File("Documents/fiches/"+sortie));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void impression(String sortie,int mode,int cle){
        String fichier = "";
        JasperPrint jasperPrint = null;
        HashMap autre = new HashMap();
        JSONObject json = provider("Documents/parametres/param.properties");
        autre.put("titre",json.get("Nom_magasin").toString());
        autre.put("slogan",json.get("slogan").toString());
        switch(mode){
            case 1:
                fichier = "StatClients";
            break;
            case 2:
                fichier = "StatFournisseurs";
            break;
            case 3:
                fichier = "StatUSers";
            break;
            case 4:
                fichier = "StatStock";
            break;
            case 5:
                fichier = "StatVentes";
            break;
            case 6:
                fichier = "StatDette";
            break;
            case 7:
                fichier = "StatBilan";
                if(AutresStatistiques.mois.isSelected()) {
                    autre.put("varAnnee",AutresStatistiques.annVar.getText());
                    autre.put("varMois",AutresStatistiques.moisVar.getSelectedIndex()+1);
                    autre.put("periode","Du Mois de "+AutresStatistiques.moisVar.getSelectedItem().toString()+" "+AutresStatistiques.annVar.getText());
                }
                else {
                    autre.put("varAnnee",AutresStatistiques.annVar.getText());
                    autre.put("varMois","%%");
                    autre.put("periode","De l'Année "+AutresStatistiques.annVar.getText());
                }
            break;
            case 8:
                fichier = "StatComptabilite";
                autre.put("varMois",AutresStatistiques.moisComp.getSelectedIndex()+1);
                autre.put("varAnnee",AutresStatistiques.AnnComp.getText());
                autre.put("periode","Du Mois De "+AutresStatistiques.moisComp.getSelectedItem().toString()+" "+AutresStatistiques.AnnComp.getText());
            break;
            case 9:
               fichier = "facture";
               autre.put("BoiteP",json.get("Bp_magasin").toString());
               autre.put("tel",json.get("Tel_magasin").toString());
               autre.put("email",json.get("Email_magasin").toString());
               autre.put("numFacture",mettreSous6Positions(""+cle));
               autre.put("cle",cle);
            break;
        }
        try {
            System.out.println(autre);
            if(mode==8) {
                JasperCompileManager.compileReportToFile("Documents/TemplatePDF/StatCharges.jrxml");
                JasperCompileManager.compileReportToFile("Documents/TemplatePDF/StatCompte.jrxml");
            }
            JasperCompileManager.compileReportToFile("Documents/TemplatePDF/"+fichier+".jrxml");
            jasperPrint = JasperFillManager.fillReport("Documents/TemplatePDF/"+fichier+".jasper",autre,getCon());
            if(mode==9) {
                deleteLesFactures();
                JasperExportManager.exportReportToPdfFile(jasperPrint,"Documents/Factures/"+sortie);
                PagePrincipale.AfficherMessage("OUVREZ LE FICHIER: Documents/Factures/"+sortie,1);
                Desktop.getDesktop().open(new File("Documents/Factures/"+sortie));
            }
            else {
                JasperExportManager.exportReportToPdfFile(jasperPrint,"Documents/fiches/JASPER_"+sortie);
                PagePrincipale.AfficherMessage("OUVREZ LE FICHIER: Documents/fiches/JASPER_"+sortie,1);
                Desktop.getDesktop().open(new File("Documents/fiches/JASPER_"+sortie));
            }
        } catch (JRException ex) {
            ex.printStackTrace();
            PagePrincipale.AfficherMessage("Erreur de creation du pdf",3);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            PagePrincipale.AfficherMessage("Erreur de fichier pdf",3);
        }
    }
    
    public static void deleteLesFactures(){
        File rep = new File("Documents/Factures/");
        File[] listeFactures = rep.listFiles();
        for (int i = 0; i < listeFactures.length; i++) {
            listeFactures[i].delete();
        }
    }
}
