/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.io.Serializable;
import java.sql.Timestamp;
import org.orm.util.ORMSet;

/**
 *
 * @author FKC-Standard
 */

public class DetteMetier implements Serializable {
    private int idVente;
    private int etat;
    private int prix_de_vente;
    private int idClient;
    private int idUtilisateur;
    private int tva;
    private java.sql.Timestamp date_de_vente;
    private int benefice;
    private org.orm.util.ORMSet lesProduits;
    private int dette;
    private int idUseurSoldeur;
    private java.sql.Timestamp date_de_solde;

    public int getIdVente() {
        return idVente;
    }

    public void setIdVente(int idVente) {
        this.idVente = idVente;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getPrix_de_vente() {
        return prix_de_vente;
    }

    public void setPrix_de_vente(int prix_de_vente) {
        this.prix_de_vente = prix_de_vente;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public Timestamp getDate_de_vente() {
        return date_de_vente;
    }

    public void setDate_de_vente(Timestamp date_de_vente) {
        this.date_de_vente = date_de_vente;
    }

    public int getBenefice() {
        return benefice;
    }

    public void setBenefice(int benefice) {
        this.benefice = benefice;
    }

    public ORMSet getLesProduits() {
        return lesProduits;
    }

    public void setLesProduits(ORMSet lesProduits) {
        this.lesProduits = lesProduits;
    }

    public int getDette() {
        return dette;
    }

    public void setDette(int dette) {
        this.dette = dette;
    }

    public int getIdUseurSoldeur() {
        return idUseurSoldeur;
    }

    public void setIdUseurSoldeur(int idUseurSoldeur) {
        this.idUseurSoldeur = idUseurSoldeur;
    }

    public Timestamp getDate_de_solde() {
        return date_de_solde;
    }

    public void setDate_de_solde(Timestamp date_de_solde) {
        this.date_de_solde = date_de_solde;
    }

}
