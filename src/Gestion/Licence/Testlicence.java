/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.Licence;

/**
 *
 * @author christian
 */
public class Testlicence {
    private static String texte = "6127eaef5e326701762c45875224192a";
    public static boolean testValide(String chemin){
        Traitements t = new Traitements();
        Licence li;
        MyRSA rsa = new MyRSA();
        t.Deserieliser(chemin);
        li = t.getLicence();
        rsa.setPrivateKey(li.getPrivatekey());
        li.setLicenceText(rsa.decryptInString(li.getLicenceTexttab()));
        return cryptMultipe(li.getLicenceText()).equals(texte);
    }
    
    private static String cryptMultipe(String m){
        m = Gestion.utils.Utils.CrypterUneChaine(m,"MD5");
        m = Gestion.utils.Utils.CrypterUneChaine(m,"SHA-1");
        m = Gestion.utils.Utils.CrypterUneChaine(m,"SHA-256");
        m = Gestion.utils.Utils.CrypterUneChaine(m,"md5");
        return m;
    }
    
    public static void main(String[] args) {
//        Licence l = new Licence();
//        Licence li;
        MyRSA rsa = new MyRSA();
//        MyRSA rsa1 = new MyRSA();
        Traitements t = new Traitements();
//        
        rsa.generateKeyPair();
//        l.setPrivatekey(rsa.getPrivateKey());
//        l.setLicenceTexttab(rsa.crypt("LA LICENCE"));
//        System.out.println(""+new BigInteger(l.getLicenceTexttab()));
//        System.out.println("");
//        t.Serialiser(l);
//        
//        t.Deserieliser("Documents/Licence/licence.fkc");
//        li = t.getLicence();
//        System.out.println(""+new BigInteger(li.getLicenceTexttab()));
//        System.out.println("");
//        rsa1.setPrivateKey(li.getPrivatekey());
//        li.setLicenceText(rsa1.decryptInString(li.getLicenceTexttab()));
//        System.out.println(li.getLicenceText());
        
            String licenceTexte = "Bonjour Fodoup Kamdem Christian";
            Licence l = new Licence();
            l.setLicenceTexttab(rsa.crypt(licenceTexte));
            l.setPrivatekey(rsa.getPrivateKey());
            t.Serialiser(l);
            System.out.println(cryptMultipe(licenceTexte));
    }
}
