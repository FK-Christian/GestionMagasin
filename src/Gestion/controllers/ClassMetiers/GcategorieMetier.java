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
public class GcategorieMetier implements Serializable{
    private int idGcategorie;
    private String nom;
    private String description;
    private int[] idDescategories;
    private org.orm.util.ORMSet lescategories;

    public int[] getIdDescategories() {
        return idDescategories;
    }

    public int getIdGcategorie() {
        return idGcategorie;
    }

    public void setIdGcategorie(int idGcategorie) {
        this.idGcategorie = idGcategorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setIdDescategories(int[] idDescategories) {
        this.idDescategories = idDescategories;
    }

    public ORMSet getLescategories() {
        return lescategories;
    }

    public void setLescategories(ORMSet lescategories) {
        this.lescategories = lescategories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
