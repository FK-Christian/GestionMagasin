/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.json.simple.JSONObject;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author FKC-Standard
 */
public class DataUtils {
    public static JSONObject getstat(String annee,String type) throws Exception{
        JSONObject data = new JSONObject();
        PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
        String requette = "select SUM(E."+type+") as venteT,"
            + "CONCAT(U.nom,' ',U.prenom) as users,"
            + "MONTH(E.date_de_vente) as mois "
            + "from Vente E,Utilisateur U "
            + "WHERE YEAR(E.date_de_vente) = :annee and E.utilisateuridUser = U.idUser "
            + "GROUP BY mois,users "
            + "ORDER BY mois asc";
        Query q = session.createSQLQuery(requette);
        q.setParameter("annee",annee);
        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List liste = q.list();
        HashMap temp;
        for (int i = 0; i < liste.size(); i++) {
            temp = (HashMap) liste.get(i);
            data.put(temp.get("mois")+"--"+temp.get("users"),temp.get("venteT"));
        }
        return data;
    }
    
    public static String getProduitDescription(String code){
        String m = "";
        try{
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String requette = "SELECT CONCAT('Categorie ',G.nom,' et sous-categorie ',S.designation) as description "
                    + "FROM Produit P, Grandecategorie G, Categories S, Produit_categories C "
                    + "WHERE P.code='"+code+"' and P.idProduit=C.produitidProduit and C.categoriesidCategories=S.idCategories "
                    + "and G.idGrandeCategorie=S.grandecategorie_idGrandeCategorie";
            Query q = session.createSQLQuery(requette);
            q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            HashMap temp = (HashMap) (q.list().get(0));
            m = temp.get("description").toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return m;
    }
    private static boolean importDATA2(String requette) throws SQLException{
        boolean flag = false;
        Connection_TO_MYSQL con = new Connection_TO_MYSQL();
        con.Statut();
        Statement st = con.getConnection().createStatement();
        st.executeUpdate(requette);
        con.close_state();
        return flag;
    }
    
    /**
     * 
     * @param data
     * @return success
     * data = JSON[JSon[table,JSON[insert,update]]]
     * @return 
     */
    public static boolean importDATA(JSONObject data,boolean all){
        boolean flag = false;
        if(!data.isEmpty()) {
            try{
                if(all){
                    String[] data1 = new String[12];
                    data1[9] = "client";       data1[6] = "grandecategorie";
                    data1[4] = "produit";       data1[2] = "produit_categories";
                    data1[8] = "fournisseur";       data1[7] = "charges";
                    data1[11] = "address";       data1[1] = "fournisseur_produit";
                    data1[5] = "categories";       data1[10] = "utilisateur";
                    data1[3] = "vente";         data1[0] = "produit_vente";
                    String req = "";
                    for (int i = 0; i < data1.length; i++) {
                        req = "DELETE FROM "+data1[i];
                        importDATA2(req);  
                    }
                }
                PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
                Set cle = data.keySet();String table;SQLQuery q;String requette = "";
                for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
                    Object next = iterator.next();
                    table = ((JSONObject)data.get(next)).get("table").toString();
                    JSONObject temp = (JSONObject) ((JSONObject)data.get(next)).get("valeurs");
                    Set cle1 = temp.keySet();
                    for (Iterator iterator1 = cle1.iterator(); iterator1.hasNext();) {
                        Object next1 = iterator1.next();
                        requette = "INSERT INTO "+table+""+((JSONObject)temp.get(next1)).get("titre")+" "
                            + "VALUES "+((JSONObject)temp.get(next1)).get("insert")+" "
                            + "ON DUPLICATE KEY UPDATE "+((JSONObject)temp.get(next1)).get("update")+" ";
                        System.out.println(requette);
                        importDATA2(requette);
                    }
                }
                flag = true;
            }catch(Exception e){
                flag = false;
                e.printStackTrace();
            }
        }
        return flag;
    }
    
    public static boolean exportDATA(){
        boolean flag = false;
        try{
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String[] data = new String[10];
            data[0] = "client";       data[5] = "grandecategorie";
            data[1] = "produit";       data[6] = "produit_categories";
            data[2] = "fournisseur";       data[7] = "charges";
            data[3] = "address";       data[8] = "fournisseur_produit";
            data[4] = "categories";       data[9] = "utilisateur";
            String requette = "";
            File f = new File("Documents/Datas/");
            if(!f.exists()) f.mkdir();
            File[] fi = f.listFiles();
            for (int i = 0; i < fi.length; i++) {
                File fi1 = fi[i];
                fi1.delete();
            }
            String m = f.getAbsolutePath();
            String as = new String ("\\");
            String das = new String("\\\\");
            m = m.replace(as, das);
            for (int i = 0; i < data.length; i++) {
                requette = "SELECT * INTO OUTFILE '"+m+"\\\\"+data[i]+".txt' FIELDS TERMINATED BY '--FKC--' " // ICIIIIIIIIIIIIIIIIIIIIIIIIIII
                        + "OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '--FIN--' \n"
                        + "FROM "+data[i];
                System.out.println(requette);
                Query q = session.createSQLQuery(requette);
                q.setReadOnly(true);
                q.scroll();
            }
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
    
    public static boolean exportAllDATA(){
        boolean flag = false;
        try{
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String[] data = new String[12];
            data[0] = "client";       data[5] = "grandecategorie";
            data[1] = "produit";       data[6] = "produit_categories";
            data[2] = "fournisseur";       data[7] = "charges";
            data[3] = "address";       data[8] = "fournisseur_produit";
            data[4] = "categories";       data[9] = "utilisateur";
            data[10] = "vente";         data[11] = "produit_vente";
            String requette = "";
            File f = new File("Documents/DatasAll/");
            if(!f.exists()) f.mkdir();
            File[] fi = f.listFiles();
            for (int i = 0; i < fi.length; i++) {
                File fi1 = fi[i];
                fi1.delete();
            }
            String m = f.getAbsolutePath();
            String as = new String ("\\");
            String das = new String("\\\\");
            m = m.replace(as, das);
            for (int i = 0; i < data.length; i++) {
                requette = "SELECT * INTO OUTFILE '"+m+"\\\\"+data[i]+".txt' FIELDS TERMINATED BY '--FKC--' " //ICIIIIIIIIIIIIIIIIIIIII
                        + "OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '--FIN--' \n"
                        + "FROM "+data[i];
                System.out.println(requette);
                Query q = session.createSQLQuery(requette);
                q.setReadOnly(true);
                q.scroll();
            }
            flag = true;
        }catch(Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
    
    public static JSONObject getDETTES(String condition) throws Exception{
        JSONObject data = new JSONObject();
        PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
        String requette1 = "select concat(C.nom,' ',C.prenom) as client,"
            + "CONCAT(U.nom,' ',U.prenom) as user,"
            + "V.idVente as idvente,"
            + "V.date_de_vente as date_de_vente,"
            + "V.description as description,"
            + "V.montant_de_dette as dette "
            + "from Vente V,Utilisateur U ,Client C "
            + "WHERE V.etat=1 and V.type_enregistrement = 'pret' and V.utilisateuridUser = U.idUser and V.clientidClient = C.idClient and "+condition;
        String requette2 = "select concat(C.nom,' ',C.prenom) as client,"
            + "SUM(V.montant_de_dette) as dettes,"
            + "V.clientidClient as idclient "
            + "from Vente V,Client C "
            + "WHERE V.etat=1 and V.type_enregistrement = 'pret' and V.clientidClient = C.idClient "
            + "GROUP BY idclient";
        Query q1 = session.createSQLQuery(requette1);
        q1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List liste1 = q1.list();
        Query q2 = session.createSQLQuery(requette2);
        q2.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List liste2 = q2.list();
        for (int i = 0; i < liste1.size(); i++) {
            HashMap temp1 = (HashMap) liste1.get(i);
            for (int j = 0; j < liste2.size(); j++) {
                HashMap temp2 = (HashMap) liste2.get(j);
                if(temp1.get("client").equals(temp2.get("client"))){
                    temp1.put("dettes",temp2.get("dettes"));
                }
            }
            data.put(temp1.get("idvente"),temp1);
        }
        return data;
    }

    public static String getCode() {
        String code = "";
        try {
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String requette = "select P.code as lastCode from Produit P where P.idProduit = (select Max(E.idProduit) "
                    + "from Produit E )";
            Query q = session.createSQLQuery(requette);
            q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List liste = q.list();
            if(liste.isEmpty()) code = "AA001";
            else{
                char[] get = ((HashMap) liste.get(0)).get("lastCode").toString().toCharArray();
                if(get[2]==get[3] && get[3]==get[4] && get[4]=='9'){
                    if(get[1]!='Z') get[1] += 1;
                    else {
                        if(get[0]=='Z') {
                            get[1] = get[0] = 'A';
                        }
                        else {
                            get[0] += 1;
                            get[1] = 'A';
                        }
                    }
                    get[2] = get[3] = '0'; get[4] = '1';
                }else{
                    int n = (Integer.parseInt(""+get[2]+""+get[3]+""+get[4])+1);
                    switch((""+n).length()){
                        case 1: 
                            get[2] = get[3] = '0';
                            get[4] = (""+n).charAt(0);
                        break;
                        case 2:
                            get[2] = '0';
                            get[3] = (""+n).charAt(0);
                            get[4] = (""+n).charAt(1);
                        break;
                        case 3:
                            get[2] = (""+n).charAt(0);
                            get[3] = (""+n).charAt(1);
                            get[4] = (""+n).charAt(2);
                        break;
                    }
                }
                code = get[0]+""+get[1]+""+get[2]+""+get[3]+""+get[4];
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return code;
    }
    
    /**
     * 
     * @param type
     * @param date
     * 0 client
     * 1 fornisseur
     * 2 users
     * 3 client dette
     * 4 resultat net/brut
     * 5 etat stock
     * 6 vente du mois/annee :date
     * 7 ventes
     * @return
     * @throws Exception 
     */
    
    public static JSONObject getEltToPrint(int type,String date){
        JSONObject data = new JSONObject();
        String requette = "";
        Query q; List liste; HashMap temp; int total;
        try{
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            switch(type){
                case 0:
                    requette = "select C.numtel as tel,"
                        + "CONCAT(U.nom,' ',U.prenom) as client,"
                        + "C.email as email,"
                        + "U.idClient as cle "
                        + "from Client U,address C "
                        + "WHERE C.idAddress=U.addressidAddress and CONCAT(U.nom,' ',U.prenom) <> '' "
                        + "order by CONCAT(U.nom,' ',U.prenom) asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[3];
                        dat[0] = temp.get("client").toString();
                        dat[1] = temp.get("tel").toString();
                        dat[2] = temp.get("email").toString();
                        data.put(temp.get("cle"),dat);
                    }
                    data.put(-1,"");
                break;
                case 1:
                    requette = "select C.numtel as tel,"
                        + "U.nom as four,"
                        + "C.email as email,"
                        + "U.idFournisseur as cle "
                        + "from Fournisseur U,address C "
                        + "WHERE C.idAddress=U.addressidAddress "
                        + "order by U.nom asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[3];
                        dat[0] = temp.get("four").toString();
                        dat[1] = temp.get("tel").toString();
                        dat[2] = temp.get("email").toString();
                        data.put(temp.get("cle"),dat);
                    }
                    data.put(-1,"");
                break;
                case 2:
                    requette = "select C.numtel as tel,"
                        + "CONCAT(U.nom,' ',U.prenom) as users,"
                        + "C.email as email,"
                        + "T.typeuser as type,"
                        + "U.idUser as cle "
                        + "from Utilisateur U,address C, Typeusers T "
                        + "WHERE C.idAddress=U.addressidAddress and U.typeusersidTypeUsers=T.idTypeUsers and T.typeuser<>'ROOT' "
                        + "order by CONCAT(U.nom,' ',U.prenom) asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[4];
                        dat[0] = temp.get("users").toString();
                        dat[1] = temp.get("type").toString();
                        dat[2] = temp.get("tel").toString();
                        dat[3] = temp.get("email").toString();
                        data.put(temp.get("cle"),dat);
                    }
                    data.put(-1,"");
                break;
                case 3:
                    requette = "select C.numtel as tel,"
                        + "CONCAT(U.nom,' ',U.prenom) as client,"
                        + "C.email as email,"
                        + "U.idClient as cle,"
                        + "SUM(V.montant_de_dette) as dettes "    
                        + "from Client U,address C, Vente V "
                        + "WHERE V.etat=1 and V.type_enregistrement = 'pret' and V.clientidClient = U.idClient and C.idAddress=U.addressidAddress "
                        + "GROUP BY cle "
                        + "order by CONCAT(U.nom,' ',U.prenom) asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    total = 0;
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[4];
                        dat[0] = temp.get("client").toString();
                        dat[1] = temp.get("tel").toString();
                        dat[2] = temp.get("email").toString();
                        dat[3] = temp.get("dettes").toString();
                        total += Integer.parseInt(temp.get("dettes").toString());
                        data.put(temp.get("cle"),dat);
                    }
                    data.put(-1,"TOTAL DES DETTES = "+total);
                break;
                case 4:
                    requette = "select "
                        + "CONCAT(P.code,' -- ',P.designation) as produit,"
                        + "CONCAT(P.idProduit,'-',V.idVente) as cle,"
                        + "C.nombre_article as qte,"
                        + "P.prix_unitaire_de_vente as pv,"
                        + "V.date_de_vente as dv,"
                        + "V.prix_de_vente as pt,"
                        + "P.prix_d_achat as pa,"
                        + "V.benefices as be "    
                        + "from Produit P,Produit_vente C, Vente V "
                        + "WHERE V.etat=1 and V.idVente = C.venteidVente and P.idProduit=C.produitidProduit and MONTH(V.date_de_vente) = "+date+" "
                        + "order by CONCAT(P.code,' -- ',P.designation) asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    int total1 = 0;
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[7];
                        dat[0] = temp.get("produit").toString();
                        dat[1] = temp.get("dv").toString();
                        dat[2] = temp.get("qte").toString();
                        dat[3] = temp.get("pa").toString();
                        dat[4] = temp.get("pv").toString();
                        dat[5] = ""+(Integer.parseInt(temp.get("pt").toString())/Integer.parseInt(temp.get("qte").toString()));
                        dat[6] = temp.get("pt").toString();
                        total1 += Integer.parseInt(temp.get("be").toString());
                        data.put(temp.get("cle"),dat);
                    }
                    JSONObject data1 = new JSONObject();
                    data1.put("beneficebrut","RESULTAT BRUT DE L'EXPLOITATION = "+total1);
                    String[] titre = {"Charge","Charge Mensuelle ","date d'enregistrement","Montant"};
                    data1.put("titrecharges",titre);
                    requette = "select C.designation as charge,"
                            + "C.date as date,"
                            + "C.montant as montant,"
                            + "C.idCharges as cle,"
                            + "C.type as mois "
                            + "FROM Charges C "
                            + "WHERE C.prisEnCompte=1 and MONTH(C.date) = "+date+" "
                            + "order by C.date asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    total = 0;
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[4];
                        dat[0] = temp.get("charge").toString();
                        dat[1] = temp.get("mois").toString();
                        dat[2] = temp.get("date").toString();
                        dat[3] = temp.get("montant").toString();
                        total += Integer.parseInt(temp.get("montant").toString());
                        data1.put(temp.get("cle"), dat);
                    }
                    data1.put("Tcharges","TOTAL DES CHARGES = "+total);
                    data1.put("beneficenet","RESULTAT NET DE L'EXPLOITATION = "+(total1-total));
                    data.put("charges",data1);
                    data.put(-1,"-1");
                break;
                case 5:
                    requette = "select P.code as code,"
                        + "P.designation as nom,"
                        + "P.quantite as qte,"
                        + "G.nom as cat,"
                        + "P.idProduit as cle "
                        + "from Produit P,grandecategorie G,produit_categories C,categories S "
                        + "where P.idProduit=C.produitidProduit and C.categoriesidCategories=S.idCategories and "
                            + "S.GrandeCategorie_idGrandeCategorie = G.idGrandeCategorie "
                        + "order by P.code asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[4];
                        dat[0] = temp.get("code").toString();
                        dat[1] = temp.get("nom").toString();
                        dat[2] = temp.get("cat").toString();
                        dat[3] = temp.get("qte").toString();
                        data.put(temp.get("cle"),dat);
                    }
                    data.put(-1,"");
                break;
                case 6:
                    String[] r = date.split("--");
                    if(r[0].equals("mois")) date = "MONTH(V.date_de_vente) = "+r[1];
                    else date = "YEAR(V.date_de_vente) = "+r[1];
                    requette = "select "
                        + "CONCAT(C.nom,' ',S.designation) as cle," 
                        + "SUM(P.nombre_article) as nbre,"
                        + "S.designation as scat,"
                        + "C.nom as cat "    
                        + "from Categories S,Produit_vente P, Grandecategorie C, Vente V, Produit A, Produit_categories B "
                        + "WHERE V.etat=1 and V.idVente=P.venteidVente and "
                        + "A.idProduit=P.produitidProduit and S.idCategories=B.categoriesidCategories and "
                        + "B.produitidProduit=A.idProduit and C.idGrandeCategorie=S.GrandeCategorie_idGrandeCategorie "
                        + "and "+date+" "
                        + "GROUP BY (S.idCategories) "
                        + "order by C.nom asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    System.out.println(liste);
                    List<HashMap> liste1 = new ArrayList<HashMap>();
                    HashMap un = new HashMap();
                    un.put("cat","");
                    un.put("nbre","");
                    un.put("scat","");
                    liste1.add(un);
                    boolean flag = false;
                    for (int i = 0; i < liste.size(); i++) {
                        HashMap get = (HashMap)liste.get(i);
                        flag = false;
                        for (int j = 0; j < liste1.size(); j++) {
                            HashMap get1 = liste1.get(j);
                            if(get1.containsKey("cat") && get1.get("cat").equals(get.get("cat"))){
                                get1.put("scat",get1.get("scat")+"\n"+get.get("scat"));
                                get1.put("nbre",get1.get("nbre")+"\n"+get.get("nbre"));
                                flag = true;
                            }
                        }
                        if(!flag){
                            liste1.add(get);
                        }
                    }
                    for (int i = 0; i < liste1.size(); i++) {
                        temp = (HashMap) liste1.get(i);
                        String[] dat = new String[3];
                        dat[0] = temp.get("cat").toString();
                        dat[1] = temp.get("scat").toString();
                        dat[2] = temp.get("nbre").toString();
                        data.put(i,dat);
                    }
                    data.put(-1,"");
                break;
                case 7:
                    requette = "select "
                        + "CONCAT(C.nom,' ',C.prenom) as client,"
                        + "CONCAT(U.nom,' ',U.prenom) as vendeur,"
                        + "V.montant_de_dette as dette,"
                        + "V.prix_de_vente as total,"
                        + "V.date_de_vente as date,"
                        + "V.idVente as numFac,"
                        + "V.description as description "
                        + "from Vente V, Client C, Utilisateur U "
                        + "WHERE C.idClient=V.clientidClient and V.utilisateuridUser=U.idUser "
                        + "order by V.date_de_vente asc";
                    q = session.createSQLQuery(requette);
                    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    liste = q.list();
                    for (int i = 0; i < liste.size(); i++) {
                        temp = (HashMap) liste.get(i);
                        String[] dat = new String[1];
                        String temp1 = "";
                        temp1 += "NUMERO DE LA FACTURE ---------> "+Gestion.utils.Utils.mettreSous6Positions(temp.get("numFac").toString())+"\n"
                               + "Vendeur ----------------------> "+temp.get("vendeur").toString()+"\n"
                               + "Client -------------------------> "+temp.get("client").toString()+"\n"
                               + "Montant de Vente ---------> "+temp.get("total").toString()+"\n"
                               + "Date de vente --------------> "+temp.get("date").toString()+"\n"
                               + "Dette --------------------------> "+temp.get("dette").toString()+"\n"
                               + "************* HISTORIQUES *****************\n"
                               + temp.get("description").toString().replace("\n","\n--> ");
                        dat[0] = temp1;
                        data.put(i,dat);
                    }
                    data.put(-1,"");
                break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

    static ArrayList<String[]> getChamps() {
        ArrayList<String[]> data = new ArrayList<>();
        String[] data1 = new String[12];
        data1[1] = "client";       data1[3] = "grandecategorie";
        data1[7] = "produit";       data1[8] = "produit_categories";
        data1[2] = "fournisseur";       data1[4] = "charges";
        data1[0] = "address";       data1[9] = "fournisseur_produit";
        data1[6] = "categories";       data1[5] = "utilisateur";
        data1[10] = "vente"; 
        data1[11] = "produit_vente";
        try {
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String bd = Gestion.utils.Utils.provider("Documents/parametres/paramBD.properties").get("URL").toString();
            bd = bd.substring(bd.lastIndexOf("/")+1);
            for (int i = 0; i < data1.length; i++) {
                String requette = "SELECT COLUMN_NAME AS name " +
                                  "FROM information_schema.COLUMNS " +
                                  "WHERE TABLE_NAME = '"+data1[i]+"' AND TABLE_SCHEMA = '"+bd+"'";
                Query q = session.createSQLQuery(requette);
                q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                List p = q.list();
                String[] temp1 = new String[p.size()];
                for (int j = 0; j < p.size(); j++) {
                    HashMap d = (HashMap) p.get(j);
                    temp1[j] = d.get("name").toString();
                }
                data.add(temp1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }
    
    public static JSONObject getproduitToChange(boolean ancien,String code){
        JSONObject data = new JSONObject();
        try {
            PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
            String requette = "";
            if(ancien){
                requette = "SELECT\n" +
                    "P.`code` as codeP,\n" +
                    "P.designation as designation,\n" +
                    "P.idProduit as cleP,\n" +
                    "P.prix_d_achat as pua,\n" +
                    "P.prix_unitaire_de_vente as puv,\n" +
                    "P.date_de_peremtion as DateE,\n" +
                    "P.quantite as qte,\n" +
                    "P.seuil_de_vente as seuil,\n" +
                    "L.idClient as cleClient,\n" + 
                    "L.addressidAddress as adC,\n" +
                    "L.nom as Ncl,\n" +
                    "L.prenom as Pcl,\n" +
                    "F.idfournisseur as four,\n" +
                    "C.idCategories as idCat,\n" +
                    "C.designation as scat,\n" +
                    "G.nom as cat,\n" +
                    "CONCAT(L.nom,' ',L.prenom) as Nclient,\n" +
                    "K.prix_unitaire_de_vente_reel as pvr,\n" +
                    "V.date_de_vente as dateV,\n" +
                    "V.idVente as numFac,\n" +
                    "CONCAT(U.nom,' ',U.prenom) as Nvendeur\n" +
                    "FROM\n" +
                    "produit P,\n" +
                    "vente V,\n" +
                    "utilisateur U,\n" +
                    "produit_vente K,\n" +
                    "client L,\n" +
                    "categories C,\n" +
                    "grandecategorie G,\n" +
                    "produit_categories N,\n" +
                    "fournisseur F,\n" +
                    "fournisseur_produit M\n" +
                    "WHERE\n" +
                    "V.idVente = K.venteidVente AND\n" +
                    "k.produitidProduit = P.idProduit AND\n" +
                    "V.clientidClient = L.idClient AND\n" +
                    "V.utilisateuridUser = U.idUser AND\n" +
                    "C.GrandeCategorie_idGrandeCategorie = G.idGrandeCategorie AND\n" +
                    "N.categoriesidCategories = C.idCategories AND\n" +
                    "N.produitidProduit = P.idProduit AND\n" +
                    "M.fournisseuridfournisseur = F.idfournisseur AND\n" +
                    "M.produitidProduit = P.idProduit AND\n" +
                    "P.`code` = :codeProduit";
            }else{
                requette = "SELECT\n" +
                    "P.`code` as codeP,\n" +
                    "P.designation as designation,\n" +
                    "P.idProduit as cleP,\n" +
                    "P.prix_d_achat as pua,\n" +
                    "P.prix_unitaire_de_vente as puv,\n" +
                    "P.date_de_peremtion as DateE,\n" +
                    "P.quantite as qte,\n" +
                    "P.seuil_de_vente as seuil,\n" +
                    "F.idfournisseur as four,\n" +
                    "C.idCategories as idCat,\n" +
                    "C.designation as scat,\n" +
                    "G.nom as cat\n" +
                    "FROM\n" +
                    "produit P,\n" +
                    "categories C,\n" +
                    "grandecategorie G,\n" +
                    "produit_categories N,\n" +
                    "fournisseur F,\n" +
                    "fournisseur_produit M\n" +
                    "WHERE\n" +
                    "C.GrandeCategorie_idGrandeCategorie = G.idGrandeCategorie AND\n" +
                    "N.categoriesidCategories = C.idCategories AND\n" +
                    "N.produitidProduit = P.idProduit AND\n" +
                    "M.fournisseuridfournisseur = F.idfournisseur AND\n" +
                    "M.produitidProduit = P.idProduit AND\n" +
                    "P.`code` = :codeProduit";
            }
            Query q = session.createSQLQuery(requette);
            q.setParameter("codeProduit",code);
            q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List liste = q.list();
            if(!liste.isEmpty()){
                HashMap temp = (HashMap) liste.get(0);
                Set cle = temp.keySet();
                for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
                    Object next = iterator.next();
                    data.put(next,temp.get(next));
                }
            }
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return data;
    }
}
