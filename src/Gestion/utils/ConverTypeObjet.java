/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.utils;

/**
 *
 * @author christian
 */
import Gestion.controllers.ClassMetiers.*;
import crud.*;
public class ConverTypeObjet {
    
    
    public static VenteMetier crudTOmetierVente(Vente v){
        VenteMetier ve = new VenteMetier();
        ve.setDate_de_vente(v.getDate_de_vente());
        ve.setEtat(v.getEtat());
        ve.setIdClient(v.getClientidClient().getIdClient());
        ve.setIdUtilisateur(v.getUtilisateuridUser().getIdUser());
        ve.setIdVente(v.getIdVente());
        if(v.getDate_de_solde() != null) ve.setDate_de_solde(v.getDate_de_solde());
        ve.setDette(v.getMontant_de_dette());
        if(v.getUsersoldeur() != null) ve.setIdUserSoldeur(v.getUsersoldeur().getIdUser());
        if(v.getDescription() != null) ve.setDescription(v.getDescription());
        ve.setTypeEnregistrement(v.getType_enregistrement());
        ve.setPrix_de_vente(v.getPrix_de_vente());
        //ve.setLesProduits(v.produit_vente);
        ve.setTva(v.getTva());
        ve.setBenefice(v.getBenefices());
        return ve;
    }
    
    public static Vente metierTocrudVenteModifier(VenteMetier ve){
        Vente v = new Vente();
        try {
            v = Vente.loadVenteByORMID(ve.getIdVente());
            v.setMontant_de_dette(ve.getDette());
            v.setDate_de_solde(ve.getDate_de_solde());
            v.setUsersoldeur(Utilisateur.getUtilisateurByORMID(ve.getIdUserSoldeur()));
            v.setDescription(ve.getDescription());
            v.setType_enregistrement(ve.getTypeEnregistrement());
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudVenteModifier: "+ex.toString(), true);
        }
        return v;
    }
    
    public static Vente metierTocrudVente(int idvente){
        Vente v = new Vente();
        try {
            v = Vente.loadVenteByORMID(idvente);
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudVente: "+ex.toString(), true);
        }
        return v;
    }
    
    public static ChargesMetier crudTOmetierCharge(Charges c){
        ChargesMetier ch = new ChargesMetier();
        ch.setIdCharge(c.getIdcharges());
        ch.setDescription(c.getDescription());
        ch.setDesignation(c.getDesignation());
        ch.setDate_enregistrement(c.getDate());
        ch.setMontant(c.getMontant());
        ch.setType(c.getType());
        ch.setPrisEnCompte(c.getPrisEnCompte());
        return ch;
    }
    
    public static Charges metierTOcrudCharges(ChargesMetier ch,boolean modifier){
        Charges c = new Charges();
        try {
            if(modifier){
                c = Charges.getChargesByORMID(ch.getIdCharge());
            }
            c.setDesignation(ch.getDesignation());
            c.setMontant(ch.getMontant());
            c.setDate(ch.getDate_enregistrement());
            c.setDescription(ch.getDescription());
            c.setPrisEnCompte(ch.isPrisEnCompte());
            c.setType(ch.getType());
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudCharges: "+ex.toString(), true);
        }
        return c;
    }
    
    public static AddressMetier crudTOmetierAddresse(Address a){
        AddressMetier ad = new AddressMetier();
        ad.setBoitePostal(a.getBoitePostal());
        ad.setEmail(a.getEmail());
        ad.setIdAddress(a.getIdAddress());
        ad.setLieu_de_residense(a.getLieu_de_residense());
        ad.setNumtel(a.getNumtel());
        ad.setSiteweb(a.getSiteWeb());
        return ad;
    }
    
    public static Address metierTOcrudAddresse(AddressMetier ad,boolean modifier){
        Address a = new Address();
        try {
            if(modifier){
                a = Address.getAddressByORMID(ad.getIdAddress());
            }
            a.setBoitePostal(ad.getBoitePostal());
            a.setEmail(ad.getEmail());
            a.setLieu_de_residense(ad.getLieu_de_residense());
            a.setNumtel(ad.getNumtel());
            a.setSiteWeb(ad.getSiteweb());
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudAddresse: "+ex.toString(), true);
        }
        return a;
    }
   
    public static CategorieMetier crudTOmetierCategorie(Categories c){
        CategorieMetier ca = new CategorieMetier();
        ca.setDescription(c.getDescription());
        ca.setDesignation(c.getDesignation());
        ca.setIdGcategories(c.getGrandeCategorie_idGrandeCategorie().getIdGrandeCategorie());
        ca.setIdcategorie(c.getIdCategories());
        ca.setLesProduits(c.produitidProduit);
        int[] ids = new int[c.produitidProduit.size()];
        Produit[] p = c.produitidProduit.toArray();
        for (int i = 0; i < p.length; i++) {
            Produit p1 = p[i];
            ids[i] = p1.getIdProduit();
        }
        ca.setIdDesproduits(ids);
        return ca;
    }
    
    public static GcategorieMetier crudTOmetierGcategorie(Grandecategorie c){
        GcategorieMetier ca = new GcategorieMetier();
        ca.setDescription(c.getDescription());
        ca.setNom(c.getNom());
        ca.setIdGcategorie(c.getIdGrandeCategorie());
        ca.setLescategories(c.categories);
        int[] ids = new int[c.categories.size()];
        Categories[] p = c.categories.toArray();
        for (int i = 0; i < p.length; i++) {
            Categories p1 = p[i];
            ids[i] = p1.getIdCategories();
        }
        ca.setIdDescategories(ids);
        return ca;
    }
    
    public static Categories metierTocrudCategorie(CategorieMetier ca,boolean modifier){
        Categories c = new Categories();
        try {
            if(modifier){
                c = Categories.getCategoriesByORMID(ca.getIdcategorie());
            }
            c.setDescription(ca.getDescription());
            c.setDesignation(ca.getDesignation());
            c.produitidProduit.clear();
            c.setGrandeCategorie_idGrandeCategorie(Grandecategorie.getGrandecategorieByORMID(ca.getIdGcategories()));
            for (int i = 0; i < ca.getIdDesproduits().length; i++) {
                c.produitidProduit.add(Produit.getProduitByORMID(ca.getIdDesproduits()[i]));
            }
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudCategorie: "+ex.toString(), true);
        }
        return c;
    }
    
    public static Grandecategorie metierTocrudGCategorie(GcategorieMetier ca,boolean modifier){
        Grandecategorie c = new Grandecategorie();
        try {
            if(modifier){
                c = Grandecategorie.getGrandecategorieByORMID(ca.getIdGcategorie());
            }
            c.setNom(ca.getNom());
            c.setDescription(ca.getDescription());
            c.categories.clear();
            for (int i = 0; i < ca.getIdDescategories().length; i++) {
                c.categories.add(Categories.loadCategoriesByORMID(ca.getIdDescategories()[i]));
            }
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudGCategorie: "+ex.toString(), true);
            ex.printStackTrace();
        }
        return c;
    }
    
    public static ClientMetier crudTOmetierClient(Client cl){
        ClientMetier c = new ClientMetier();
        c.setIdclient(cl.getIdClient());
        c.setIdAdresse(cl.getAddressidAddress().getIdAddress());
        c.setNom(cl.getNom());
        c.setPrenom(cl.getPrenom());
        return c;
    }
    
    public static Client metierTocrudClient(ClientMetier c,boolean modifier){
        Client cl = new Client();
        try {
            if(modifier){
                cl = Client.getClientByORMID(c.getIdclient());
            }
            cl.setAddressidAddress(Address.getAddressByORMID(c.getIdAdresse()));
            cl.setNom(c.getNom());
            cl.setPrenom(c.getPrenom());
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudClient: "+ex.toString(), true);
        }
        return cl;
    }
    
    public static FournisseurMetier crudTOmetierFournisseur(Fournisseur f){
        FournisseurMetier fo = new FournisseurMetier();
        fo.setIdAddress(f.getAddressidAddress().getIdAddress());
        fo.setIdfournisseur(f.getIdfournisseur());
        fo.setLesProduits(f.produitidProduit);
        fo.setNom(f.getNom());
        int[] ids = new int[f.produitidProduit.size()];
        Produit[] p = f.produitidProduit.toArray();
        for (int i = 0; i < p.length; i++) {
            Produit p1 = p[i];
            ids[i] = p1.getIdProduit();
        }
        fo.setIdDesproduits(ids);
        return fo;
    }
    
    public static Fournisseur metierTocrudFournisseur(FournisseurMetier fo,boolean modifier){
        Fournisseur f = new Fournisseur();
        try {
            if(modifier){
                f = Fournisseur.getFournisseurByORMID(fo.getIdfournisseur());
            }
            f.setAddressidAddress(Address.getAddressByORMID(fo.getIdAddress()));
            f.setNom(fo.getNom());
            for (int i = 0; i < fo.getIdDesproduits().length; i++) {
                f.produitidProduit.add(Produit.getProduitByORMID(fo.getIdDesproduits()[i]));
            }
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudfournisseur: "+ex.toString(), true);
        }
        return f;
    }
    
    public static ProduitMetier crudTOmetierProduit(Produit p){
        ProduitMetier pr = new ProduitMetier();
        pr.setDate_de_peremtion(p.getDate_de_peremtion());
        pr.setDesignation(p.getDesignation());
        pr.setCode(p.getCode());
        pr.setIdproduit(p.getIdProduit());
        pr.setPrix_d_achat(p.getPrix_d_achat());
        pr.setPrix_unitaire_de_vente(p.getPrix_unitaire_de_vente());
        pr.setQuantite(p.getQuantite());
        pr.setSeiulLimite(p.getSeuil_de_vente());
        int[] ids = new int[p.categoriesidCategories.size()];
        Categories[] f = p.categoriesidCategories.toArray();
        for (int i = 0; i < f.length; i++) {
            Categories p1 = f[i];
            ids[i] = p1.getIdCategories();
        }
        pr.setIdDescategories(ids);
        
        int[] ids1 = new int[p.fournisseuridfournisseur.size()];
        Fournisseur[] f1 = p.fournisseuridfournisseur.toArray();
        for (int i = 0; i < f1.length; i++) {
            Fournisseur p2 = f1[i];
            ids1[i] = p2.getIdfournisseur();
        }
        pr.setIdDesfournisseurs(ids1);
        
//        int[] ids2 = new int[p.produit_vente.size()];
//        Produit_vente[] f2 = p.produit_vente.toArray();
//        for (int i = 0; i < f2.length; i++) {
//            Produit_vente p3 = f2[i];
//            ids1[i] = p3.getVenteidVenteId();
//        }
//        pr.setIdDesVentes(ids2);
        return pr;
    }
    
    @SuppressWarnings("UseSpecificCatch")
    public static Produit metierTocrudProduit(ProduitMetier pr,boolean modifier){
        Produit p = new Produit();
        try {
            if(modifier){
                p = Produit.getProduitByORMID(pr.getIdproduit());
                try{
                    p.produit_vente.clear();
                    for (int i = 0; i < pr.getIdDesVentes().length; i++) {
                        Produit p1 = Produit.getProduitByORMID(p.getIdProduit());
                        Vente v = Vente.getVenteByORMID(pr.getIdDesVentes()[i]);
                        p.produit_vente.add(Produit_vente.getProduit_venteByORMID(p1,v));
                    }
                }catch(java.lang.NullPointerException e){}
            }else{
                p.setCode(pr.getCode());
            }
            p.setDate_de_peremtion(pr.getDate_de_peremtion());
            p.setDesignation(pr.getDesignation());
            p.setPrix_d_achat(pr.getPrix_d_achat());
            p.setPrix_unitaire_de_vente(pr.getPrix_unitaire_de_vente());
            p.setQuantite(pr.getQuantite());
            p.setSeuil_de_vente(pr.getSeiulLimite());
            try{
                p.categoriesidCategories.clear();
                p.fournisseuridfournisseur.clear();
                for (int i = 0; i < pr.getIdDescategories().length; i++) {
                    p.categoriesidCategories.add(Categories.loadCategoriesByORMID(pr.getIdDescategories()[i]));
                }
                for (int i = 0; i < pr.getIdDesfournisseurs().length; i++) {
                    p.fournisseuridfournisseur.add(Fournisseur.getFournisseurByORMID(pr.getIdDesfournisseurs()[i]));
                }
            }catch(java.lang.NullPointerException e){}
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudProduit: "+ex.toString(), true);
        }
        return p;
    }
    
    public static UtilisateurMetier crudTOmetierUtilisateur(Utilisateur u){
        UtilisateurMetier ut = new UtilisateurMetier();
        ut.setDescription(u.getDescription());
        ut.setIdtypeutilisateur(u.getTypeusersidTypeUsers().getIdTypeUsers());
        ut.setIdutilisateur(u.getIdUser());
        ut.setLogin(u.getLogin());
        ut.setMotdepass(u.getMotdepass());
        ut.setNom(u.getNom());
        ut.setPrenom(u.getPrenom());
        ut.setIdaddresse(u.getAddressidAddress().getIdAddress());
        ut.setTypeuser(u.getTypeusersidTypeUsers().getTypeuser());
        return ut;
    }
    
    public static Utilisateur metierTocrudUtilisateur(UtilisateurMetier ut,boolean modifier){
        Utilisateur u = new Utilisateur();
        try {
            if(modifier){
                u = Utilisateur.getUtilisateurByORMID(ut.getIdutilisateur());
            }
            u.setDescription(ut.getDescription());
            u.setLogin(ut.getLogin());
            u.setMotdepass(ut.getMotdepass());
            u.setNom(ut.getNom());
            u.setPrenom(ut.getPrenom());
            u.setTypeusersidTypeUsers(Typeusers.getTypeusersByORMID(ut.getIdtypeutilisateur()));
            u.setAddressidAddress(Address.getAddressByORMID(ut.getIdaddresse()));
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("ConverTypeObjet:metierToCrudUtilisateur: "+ex.toString(), true);
        }
        return u;
    }
}
