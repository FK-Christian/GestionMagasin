/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.controllers.ControlleurMetier;

import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import crud.Typeusers;
import crud.Usersrights;
import org.orm.PersistentException;

/**
 *
 * @author christian
 */
public class DroitAccessControlleur {
    private boolean hasRight;
    private Typeusers typeuser;
    public DroitAccessControlleur(UtilisateurMetier user1,int code){
        try {
            this.typeuser =  Typeusers.loadTypeusersByORMID(user1.getIdtypeutilisateur());
            int droit;
            switch(code){
                case 0:// ajouter un fournisseur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUnfournisseur();
                break;
                case 1:// modifier un fournisseur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUnFournisseur();
                break;
                case 2:// supprimer un fournisseur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUnfournisseur();
                break;
                case 3:// ajouter un utilisateur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getCreerUnUser();
                break;
                case 4:// modifier un utilisateur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUnUsers();
                break;
                case 5:// supprimer un utilisateur
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUnUsers();
                break;
                case 6:// ajouter un produit
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getEnregistrerUnproduit();
                break;
                case 7:// modifier un produit
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUnProduit();
                break;
                case 8:// supprimer un produit
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUnProduit();
                break;
                case 9:// ajouter une vente
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getVendre();
                break;
                case 10:// modifier une vente
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUneVente();
                break;
                case 11:// supprimer une vente
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUneVente();
                break;
                case 12:// consulter les produits
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getConsulterLesProduits();
                break;
                case 13:// voir les statistiques
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getVoirLesStatistiques();
                break;
                case 14:// ajouter une addresse
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUneAddresse();
                break;
                case 15:// modifier une addresse
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUneAddresse();
                break;
                case 16:// supprimer une addresse
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUneAddresse();
                break;
                case 17:// ajouter une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUneCategorie();
                break;
                case 18:// modifier une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUneCategorie();
                break;
                case 19:// supprimer une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUneCategorie();
                break;
                case 20:// ajouter un client
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUnClient();
                break;
                case 21:// modifier un client
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUnClient();
                break;
                case 22:// supprimer un client
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerunClient();
                break;
                case 32:// ajouter charges
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUneCharge();
                break;
                case 33:// modifier charges
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUneCharge();
                break;
                case 34:// supprimer charges
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerunecharge();
                break;
                case 38:// ajouter une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getAjouterUneCategorie();
                break;
                case 39:// modifier une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getModifierUneCategorie();
                break;
                case 40:// supprimer une categorie
                    droit = Usersrights.loadUsersrightsByORMID(this.typeuser.getUsersrightsidUsersRights().getIdUsersRights()).getSupprimerUneCategorie();
                break;
                case 23: //se connecter
                    droit = 1;
                break;
                case 24: //se connecter
                    droit = 1;
                break;
                case 26: //se connecter
                    droit = 1;
                break;
                case 27: //se connecter
                    droit = 1;
                break;
                case 28: //se connecter
                    droit = 1;
                break;
                case 30: //se connecter
                    droit = 1;
                break;
                case 31: //lister statistiques
                    droit = 1;
                break;
                case 43: //lister Gcategories
                    droit = 1;
                break;
                case 41: //lister charges
                    droit = 1;
                break;
                default:
                    droit = 0;
                break;
            }
            hasRight = (droit==1);
        } catch (PersistentException ex) {
            Gestion.utils.Utils.addMessage(ex.toString(),true);
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage(ex.toString(),true);
        }
    }
    public boolean ALeDroit(){
        return this.hasRight;
    }
}
