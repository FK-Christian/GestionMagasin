/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.Licence;

import java.io.Serializable;
import java.security.interfaces.RSAPrivateKey;

/**
 *
 * @author christian
 */
public class Licence implements Serializable{
    private RSAPrivateKey privatekey;
    private String licenceText;
    private byte[] licenceTexttab;

    public byte[] getLicenceTexttab() {
        return licenceTexttab;
    }

    public void setLicenceTexttab(byte[] licenceTexttab) {
        this.licenceTexttab = licenceTexttab;
    }

    public RSAPrivateKey getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(RSAPrivateKey privatekey) {
        this.privatekey = privatekey;
    }

    public String getLicenceText() {
        return licenceText;
    }

    public void setLicenceText(String licenceText) {
        this.licenceText = licenceText;
    }

}
