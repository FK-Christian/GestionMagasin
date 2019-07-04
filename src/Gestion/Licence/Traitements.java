/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.Licence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author christian
 */
public class Traitements {
    private ObjectInputStream ois;
    private Licence licence;
    private ObjectOutputStream oos;
    private FileOutputStream fichierout;
    
    public Licence getLicence(){
        return this.licence;
    }
    
    public Traitements(){
        this.licence = new Licence();
    }
    
    public void Deserieliser(String path){
        ois = null;
        try {
//            FileInputStream fichier = new FileInputStream("Documents/Licence/licence.fkc");
            FileInputStream fichier = new FileInputStream(path);
            ois = new ObjectInputStream(fichier);
            licence = (Licence) ois.readObject();        
        } catch (final java.io.IOException e) {
            Gestion.utils.Utils.addMessage(e.toString(), true);
        } catch (ClassNotFoundException ex) {
            Gestion.utils.Utils.addMessage(ex.toString(), true);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (final IOException ex) {
                Gestion.utils.Utils.addMessage(ex.toString(), true);
            }
        }
    }
    
    public void Serialiser(Licence l){
        licence = l;
        oos = null;
        try {
            fichierout = new FileOutputStream("Documents/Licence/licence.fkc");
            oos = new ObjectOutputStream(fichierout);
            oos.writeObject(licence);
            oos.flush();
        } catch (final java.io.IOException e) {
            Gestion.utils.Utils.addMessage(e.toString(), true);
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
            } catch (final IOException ex) {
                Gestion.utils.Utils.addMessage(ex.toString(), true);
            }
        }
    }
}
