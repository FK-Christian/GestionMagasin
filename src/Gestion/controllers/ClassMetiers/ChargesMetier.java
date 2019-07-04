/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author FKC-Standard
 */

public class ChargesMetier implements Serializable {
    private String designation;
    private int montant;
    private String description;
    private boolean prisEnCompte;
    private String type;
    private int idCharge;
    private java.util.Date date_enregistrement;

    public int getIdCharge() {
        return idCharge;
    }

    public void setIdCharge(int idCharge) {
        this.idCharge = idCharge;
    }

    public java.util.Date getDate_enregistrement() {
        return date_enregistrement;
    }

    public void setDate_enregistrement(java.util.Date date_enregistrement) {
        this.date_enregistrement = date_enregistrement;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPrisEnCompte() {
        return prisEnCompte;
    }

    public void setPrisEnCompte(boolean prisEnCompte) {
        this.prisEnCompte = prisEnCompte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
