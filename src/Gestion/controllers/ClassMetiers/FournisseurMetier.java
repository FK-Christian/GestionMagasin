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
public class FournisseurMetier implements Serializable{
    private int idfournisseur;
    private String nom;
    private int idAddress;
    private int[] idDesproduits;
    private org.orm.util.ORMSet lesProduits;

    public int[] getIdDesproduits() {
        return idDesproduits;
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
    
    public int getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }
    
}
