/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author christian
 */
public class ProduitMetier implements Serializable{
    private int idproduit;
    private int prix_d_achat;
    private int prix_unitaire_de_vente;
    private int quantite;
    private int seiulLimite;
    private String designation;
    private java.util.Date date_de_peremtion;
    private String code;
    private int[] idDescategories;
    private int[] idDesfournisseurs;
    private int[] idDesVentes;

    public String getCode() {
        return code;
    }

    public int getSeiulLimite() {
        return seiulLimite;
    }

    public void setSeiulLimite(int seiulLimite) {
        this.seiulLimite = seiulLimite;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate_de_peremtion() {
        return date_de_peremtion;
    }

    public void setDate_de_peremtion(Date date_de_peremtion) {
        this.date_de_peremtion = date_de_peremtion;
    }

    public int[] getIdDesVentes() {
        return idDesVentes;
    }

    public void setIdDesVentes(int[] idDesVentes) {
        this.idDesVentes = idDesVentes;
    }

    public int[] getIdDescategories() {
        return idDescategories;
    }

    public void setIdDescategories(int[] idDescategories) {
        this.idDescategories = idDescategories;
    }

    public int[] getIdDesfournisseurs() {
        return idDesfournisseurs;
    }

    public void setIdDesfournisseurs(int[] idDesfournisseurs) {
        this.idDesfournisseurs = idDesfournisseurs;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public int getPrix_d_achat() {
        return prix_d_achat;
    }

    public void setPrix_d_achat(int prix_d_achat) {
        this.prix_d_achat = prix_d_achat;
    }

    public int getPrix_unitaire_de_vente() {
        return prix_unitaire_de_vente;
    }

    public void setPrix_unitaire_de_vente(int prix_unitaire_de_vente) {
        this.prix_unitaire_de_vente = prix_unitaire_de_vente;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
