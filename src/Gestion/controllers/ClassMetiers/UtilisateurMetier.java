/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ClassMetiers;

import java.io.Serializable;

/**
 *
 * @author christian
 */
public class UtilisateurMetier implements Serializable{
    private int idutilisateur;
    private String nom;
    private String prenom;
    private String login;
    private String motdepass;
    private String description;
    private int idtypeutilisateur;
    private int idaddresse;
    private String typeuser;

    public String getTypeuser() {
        return typeuser;
    }

    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }

    public int getIdaddresse() {
        return idaddresse;
    }

    public void setIdaddresse(int idaddresse) {
        this.idaddresse = idaddresse;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotdepass() {
        return motdepass;
    }

    public void setMotdepass(String motdepass) {
        this.motdepass = motdepass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdtypeutilisateur() {
        return idtypeutilisateur;
    }

    public void setIdtypeutilisateur(int idtypeutilisateur) {
        this.idtypeutilisateur = idtypeutilisateur;
    }
    
}
