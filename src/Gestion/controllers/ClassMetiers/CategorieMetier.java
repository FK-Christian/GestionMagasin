/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.io.Serializable;
import org.orm.util.ORMSet;

/**
 *
 * @author christian
 */
public class CategorieMetier implements Serializable{
    private int idcategorie;
    private int idGcategories;
    private String designation;
    private String description;
    private int[] idDesproduits;
    private org.orm.util.ORMSet lesProduits;

    public int[] getIdDesproduits() {
        return idDesproduits;
    }

    public int getIdGcategories() {
        return idGcategories;
    }

    public void setIdGcategories(int idGcategories) {
        this.idGcategories = idGcategories;
    }

    public void setIdDesproduits(int[] idDesproduits) {
        this.idDesproduits = idDesproduits;
    }

    public ORMSet getLesProduits() {
        return lesProduits;
    }

    public void setLesProduits(ORMSet lesProduits) {
        this.lesProduits = lesProduits;
    }
    
    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
