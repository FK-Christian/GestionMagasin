package Gestion.vues.Messages;

import Gestion.controllers.ClassMetiers.AddressMetier;
import Gestion.controllers.ClassMetiers.CategorieMetier;
import Gestion.controllers.ClassMetiers.ChargesMetier;
import Gestion.controllers.ClassMetiers.ClientMetier;
import Gestion.controllers.ClassMetiers.FournisseurMetier;
import Gestion.controllers.ClassMetiers.GcategorieMetier;
import Gestion.controllers.ClassMetiers.ProduitMetier;
import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import Gestion.controllers.ClassMetiers.VenteMetier;
import Gestion.passerelle.Passerelle;
import Gestion.vues.InterfacesGraphiques.PageDeLogin;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class LesDonnees {
    public static JSONObject lesusers;
    public static JSONObject lesproduits;
    public static JSONObject lescategories;
    public static JSONObject lesGcategories;
    public static JSONObject lescharges;
    public static JSONObject lesdettes;
    public static JSONObject lesfournisseurs;
    public static JSONObject lesclients;
    public static JSONObject lesaddresses;
    public static JSONObject lesventes;
    public static JSONObject lestypeusers;
    
    private static JSONObject message = new JSONObject();
    private static JSONObject requette = new JSONObject();
    private static JSONObject retour = new JSONObject();
    private static JSONObject imageStatistiques = new JSONObject();
    private static int position = 0;
    private static Passerelle passerelle;
    private static Set cles;
    public static boolean QteZero;
    private static String conditionQTE = "";
    
    public static String getnextImage(){
        positionsuivate();
        return imageStatistiques.get(position).toString();
    }
    
    public static void chargerLesImages(){
        fabriquerLesStatistiques();
        File fichier = new File("Documents/Images/Statistiques");
        File[] fichiers = fichier.listFiles();
        for (int i = 0; i < fichiers.length; i++) {
            File fichier1 = fichiers[i];
            imageStatistiques.put(i,fichier1.getAbsolutePath());
        }
    }
    
    private static void fabriquerLesStatistiques(){
        
    }
    
    private static void setConditionQte(){
        if(QteZero) conditionQTE = "quantite>=0";
        else conditionQTE = "quantite>0";
    }
   
    public static String getpreviewImage(){
        positionprecedente();
        return imageStatistiques.get(position).toString();
    }
   
    private static void positionsuivate(){
        position++;
        if(position==imageStatistiques.size()) position = 0;
    }
    
    private static void positionprecedente(){
        position--;
        if(position==-1 && imageStatistiques.size()!=0) position = imageStatistiques.size()-1;
    }
    
    public static void initData(int type){
        switch(type){
            case 0:
                setLesusers();
                setLescharges();
                setLesdettes();
            break;
            case 1:
                setLesproduits();
            break;
            case 2:
                setLesGcategories();
            break;
            case 3:
                setLesfournisseurs();
            break;
            case 4:
                setLesclients();              
            break;
            case 5:
                setLesaddresses();
            break;
            case 6:
                setLesventes();
            break;
            case 7:
                setLesusers();
                setLesdettes();
                setLescharges();
                setLesGcategories();
                setLesfournisseurs();
                setLesclients(); 
                setLesaddresses();
                setLesproduits();
                setLesventes();
                chargerLesImages();
            break;
            case 8:{
               lestypeusers = new JSONObject();
               lestypeusers.put("ROOT","1");
               lestypeusers.put("Gestionnaire","2");
               lestypeusers.put("Vendeur","3");
            }
            break;
            default:
                Gestion.utils.Utils.addMessage("initData: Choix invalide", true);
            break;
        }
    }

    private static void setLesusers() {
        lesusers= new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",24);
        message.put("condition","1=1 and typeusersidTypeUsers != 1");
        message.put("order","nom asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((UtilisateurMetier)((JSONObject)retour.get("message")).get(next)).getLogin();
                lesusers.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            UtilisateurMetier u = new UtilisateurMetier();
            lesusers.put("Pas de Produits",u);
        }
    }

    private static void setLesproduits() {
        setConditionQte();
        lesproduits = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",12);
        message.put("condition",conditionQTE);
        message.put("order","designation asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((ProduitMetier)((JSONObject)retour.get("message")).get(next)).getCode();
                       m += " --- "+((ProduitMetier)((JSONObject)retour.get("message")).get(next)).getDesignation();
                lesproduits.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            ProduitMetier p = new ProduitMetier();
            p.setQuantite(0);
            lesproduits.put("Pas de Produits",p);
        }
    }
    
    public static void setLesSous_categories() {
        lescategories = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",27);
        message.put("condition","1=1");
        message.put("order","designation asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((CategorieMetier)((JSONObject)retour.get("message")).get(next)).getDesignation();
                lescategories.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            CategorieMetier c = new CategorieMetier();
            lescategories.put("Pas de categorie",c);
        } 
    }

    public static void setLescategories(int idGcat) {
        lescategories = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",27);
        message.put("condition","GrandeCategorie_idGrandeCategorie = "+idGcat);
        message.put("order","designation asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((CategorieMetier)((JSONObject)retour.get("message")).get(next)).getDesignation();
                lescategories.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            CategorieMetier c = new CategorieMetier();
            lescategories.put("Pas de categorie",c);
        } 
    }
    
    private static void setLesGcategories() {
        lesGcategories = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",43);
        message.put("condition","1=1");
        message.put("order","nom asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((GcategorieMetier)((JSONObject)retour.get("message")).get(next)).getNom();
                lesGcategories.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            GcategorieMetier c = new GcategorieMetier();
            lesGcategories.put("Pas de categorie",c);
        } 
    }

    private static void setLesfournisseurs() {
        lesfournisseurs = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",23);
        message.put("condition","1=1");
        message.put("order","nom asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((FournisseurMetier)((JSONObject)retour.get("message")).get(next)).getNom();
                lesfournisseurs.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            FournisseurMetier f = new FournisseurMetier();
            lesfournisseurs.put("Pas de Fournisseur",f);
        }
    }

    private static void setLesclients() {
        lesclients = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",28);
        message.put("condition","1=1");
        message.put("order","nom asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((ClientMetier)((JSONObject)retour.get("message")).get(next)).getNom();
                m += " "+((ClientMetier)((JSONObject)retour.get("message")).get(next)).getPrenom();
                lesclients.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            lesclients.put("Pas de Client",new ClientMetier());
        }
    }

    private static void setLesaddresses() {
        lesaddresses = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",26);
        message.put("condition","1=1");
        message.put("order","numtel asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ""+((AddressMetier)((JSONObject)retour.get("message")).get(next)).getIdAddress();
                lesaddresses.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            FournisseurMetier f = new FournisseurMetier();
            lesaddresses.put("Pas de Fournisseur",f);
        }
    }

    private static void setLesventes() {
        lesventes = new JSONObject();
        JSONObject p1 = new JSONObject();
        String condition = "";
        if(PageDeLogin.currentUser.getTypeuser().equals("Vendeur")) condition = "utilisateuridUser = "+PageDeLogin.currentUser.getIdutilisateur()+" and ";
        p1.put("condition",condition+" etat=1");
        p1.put("order","etat asc");
        message.put("lesproduits",p1);
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",13);
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ""+((VenteMetier)((JSONObject)retour.get("message")).get(next)).getIdVente();
                lesventes.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            VenteMetier v = new VenteMetier();
            lesventes.put("Pas de Vente",v);
        }
    }
    
    public static JSONObject getStat(String m) {
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",31);
        JSONObject p1 = new JSONObject();
        Calendar cal = Calendar.getInstance();
        String Y = ""+cal.get(Calendar.YEAR);
        p1.put("date",Y);
        p1.put("type",m);
        message.put("lesproduits",p1);
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            return ((JSONObject)retour.get("message"));
        }else{
            return new JSONObject();
        }
    }
    
    public static JSONObject getobjet(String condition,String order,int action){
        JSONObject data = new JSONObject();
        if(action==13){
            JSONObject p1 = new JSONObject();
            p1.put("condition",condition);
            p1.put("order",order);
            message.put("lesproduits",p1);
        }else{
            message.put("condition",condition);
            message.put("order",order);           
        }
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",action);
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            data.put("code","0");
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                data.put("message",((JSONObject)retour.get("message")).get(next));
            }
        }else{
            data.put("message",new Object());
            data.put("code","1");
        }
        return data;
    }
    
    public static JSONObject getManyObjet(int action, String condition, String order){
        if(action==13){
            JSONObject p1 = new JSONObject();
            p1.put("condition",condition);
            p1.put("order",order);
            message.put("lesproduits",p1);
        }else{
            message.put("condition",condition);
            message.put("order",order);           
        }
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",action);
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        JSONObject data = passerelle.ForwardQuery();  
        return data;
    }

    private static void setLescharges() {
        lescharges = new JSONObject();
        requette.put("user",PageDeLogin.currentUser);
        requette.put("action",41);
        message.put("condition","1=1");
        message.put("order","designation asc");
        requette.put("message", message);
        passerelle = new Passerelle(requette);
        retour = passerelle.ForwardQuery();
        if(retour.get("code").equals("0")){
            cles = ((JSONObject)retour.get("message")).keySet();
            for (Iterator iterator = cles.iterator(); iterator.hasNext();) {
                Object next = iterator.next();
                String m = ((ChargesMetier)((JSONObject)retour.get("message")).get(next)).getDesignation();
                lescharges.put(m,((JSONObject)retour.get("message")).get(next));
            }
        }else{
            ChargesMetier p = new ChargesMetier();
            lescharges.put("Pas de charges",p);
        }
    }

    private static void setLesdettes() {
        lesdettes = new JSONObject();
        try {
            lesdettes = Gestion.utils.DataUtils.getDETTES("1=1");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void getLesDettes(String cond){
       lesdettes = new JSONObject();
        try {
            lesdettes = Gestion.utils.DataUtils.getDETTES(cond);
        } catch (Exception ex) {
        }
    }
    
}
