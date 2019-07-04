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
public class AddressMetier implements Serializable{
    private int idAddress;
    private String numtel;
    private String siteweb;
    private String email;
    private String boitePostal;
    private String lieu_de_residense;

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getSiteweb() {
        return siteweb;
    }

    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBoitePostal() {
        return boitePostal;
    }

    public void setBoitePostal(String boitePostal) {
        this.boitePostal = boitePostal;
    }

    public String getLieu_de_residense() {
        return lieu_de_residense;
    }

    public void setLieu_de_residense(String lieu_de_residense) {
        this.lieu_de_residense = lieu_de_residense;
    }
    
}
