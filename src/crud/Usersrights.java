/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package crud;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usersrights {
	public Usersrights() {
	}
	
	public static Usersrights loadUsersrightsByORMID(int idUsersRights) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUsersrightsByORMID(session, idUsersRights);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights getUsersrightsByORMID(int idUsersRights) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getUsersrightsByORMID(session, idUsersRights);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByORMID(int idUsersRights, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUsersrightsByORMID(session, idUsersRights, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights getUsersrightsByORMID(int idUsersRights, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getUsersrightsByORMID(session, idUsersRights, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByORMID(PersistentSession session, int idUsersRights) throws PersistentException {
		try {
			return (Usersrights) session.load(crud.Usersrights.class, new Integer(idUsersRights));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights getUsersrightsByORMID(PersistentSession session, int idUsersRights) throws PersistentException {
		try {
			return (Usersrights) session.get(crud.Usersrights.class, new Integer(idUsersRights));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByORMID(PersistentSession session, int idUsersRights, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usersrights) session.load(crud.Usersrights.class, new Integer(idUsersRights), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights getUsersrightsByORMID(PersistentSession session, int idUsersRights, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usersrights) session.get(crud.Usersrights.class, new Integer(idUsersRights), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsersrights(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryUsersrights(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsersrights(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryUsersrights(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights[] listUsersrightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listUsersrightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights[] listUsersrightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listUsersrightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsersrights(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Usersrights as Usersrights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsersrights(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Usersrights as Usersrights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usersrights", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights[] listUsersrightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsersrights(session, condition, orderBy);
			return (Usersrights[]) list.toArray(new Usersrights[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights[] listUsersrightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsersrights(session, condition, orderBy, lockMode);
			return (Usersrights[]) list.toArray(new Usersrights[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUsersrightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUsersrightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights loadUsersrightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usersrights[] usersrightses = listUsersrightsByQuery(session, condition, orderBy);
		if (usersrightses != null && usersrightses.length > 0)
			return usersrightses[0];
		else
			return null;
	}
	
	public static Usersrights loadUsersrightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usersrights[] usersrightses = listUsersrightsByQuery(session, condition, orderBy, lockMode);
		if (usersrightses != null && usersrightses.length > 0)
			return usersrightses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsersrightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateUsersrightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersrightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateUsersrightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersrightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Usersrights as Usersrights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersrightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Usersrights as Usersrights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usersrights", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usersrights createUsersrights() {
		return new crud.Usersrights();
	}
	
	public boolean save() throws PersistentException {
		try {
			crud.GesMagPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			crud.GesMagPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			crud.GesMagPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			crud.GesMagPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			crud.Typeusers[] lTypeuserss = typeusers.toArray();
			for(int i = 0; i < lTypeuserss.length; i++) {
				lTypeuserss[i].setUsersrightsidUsersRights(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			crud.Typeusers[] lTypeuserss = typeusers.toArray();
			for(int i = 0; i < lTypeuserss.length; i++) {
				lTypeuserss[i].setUsersrightsidUsersRights(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == crud.ORMConstants.KEY_USERSRIGHTS_TYPEUSERS) {
			return ORM_typeusers;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idUsersRights;
	
	private int creerUnUser;
	
	private int modifierUnUsers;
	
	private int supprimerUnUsers;
	
	private int vendre;
	
	private int modifierUneVente;
	
	private int supprimerUneVente;
	
	private int enregistrerUnproduit;
	
	private int modifierUnProduit;
	
	private int supprimerUnProduit;
	
	private int voirLesStatistiques;
	
	private int consulterLesProduits;
	
	private int ajouterUnfournisseur;
	
	private int modifierUnFournisseur;
	
	private int supprimerUnfournisseur;
	
	private int ajouterUneAddresse;
	
	private int modifierUneAddresse;
	
	private int supprimerUneAddresse;
	
	private int ajouterUneCategorie;
	
	private int modifierUneCategorie;
	
	private int supprimerUneCategorie;
	
	private int ajouterUnClient;
	
	private int modifierUnClient;
	
	private int supprimerunClient;
	
	private int ajouterUneCharge;
	
	private int modifierUneCharge;
	
	private int supprimerunecharge;
	
	private int privilegeRoot;
	
	private java.util.Set ORM_typeusers = new java.util.HashSet();
	
	private void setIdUsersRights(int value) {
		this.idUsersRights = value;
	}
	
	public int getIdUsersRights() {
		return idUsersRights;
	}
	
	public int getORMID() {
		return getIdUsersRights();
	}
	
	public void setCreerUnUser(int value) {
		this.creerUnUser = value;
	}
	
	public int getCreerUnUser() {
		return creerUnUser;
	}
	
	public void setModifierUnUsers(int value) {
		this.modifierUnUsers = value;
	}
	
	public int getModifierUnUsers() {
		return modifierUnUsers;
	}
	
	public void setSupprimerUnUsers(int value) {
		this.supprimerUnUsers = value;
	}
	
	public int getSupprimerUnUsers() {
		return supprimerUnUsers;
	}
	
	public void setVendre(int value) {
		this.vendre = value;
	}
	
	public int getVendre() {
		return vendre;
	}
	
	public void setModifierUneVente(int value) {
		this.modifierUneVente = value;
	}
	
	public int getModifierUneVente() {
		return modifierUneVente;
	}
	
	public void setSupprimerUneVente(int value) {
		this.supprimerUneVente = value;
	}
	
	public int getSupprimerUneVente() {
		return supprimerUneVente;
	}
	
	public void setEnregistrerUnproduit(int value) {
		this.enregistrerUnproduit = value;
	}
	
	public int getEnregistrerUnproduit() {
		return enregistrerUnproduit;
	}
	
	public void setModifierUnProduit(int value) {
		this.modifierUnProduit = value;
	}
	
	public int getModifierUnProduit() {
		return modifierUnProduit;
	}
	
	public void setSupprimerUnProduit(int value) {
		this.supprimerUnProduit = value;
	}
	
	public int getSupprimerUnProduit() {
		return supprimerUnProduit;
	}
	
	public void setVoirLesStatistiques(int value) {
		this.voirLesStatistiques = value;
	}
	
	public int getVoirLesStatistiques() {
		return voirLesStatistiques;
	}
	
	public void setConsulterLesProduits(int value) {
		this.consulterLesProduits = value;
	}
	
	public int getConsulterLesProduits() {
		return consulterLesProduits;
	}
	
	public void setAjouterUnfournisseur(int value) {
		this.ajouterUnfournisseur = value;
	}
	
	public int getAjouterUnfournisseur() {
		return ajouterUnfournisseur;
	}
	
	public void setModifierUnFournisseur(int value) {
		this.modifierUnFournisseur = value;
	}
	
	public int getModifierUnFournisseur() {
		return modifierUnFournisseur;
	}
	
	public void setSupprimerUnfournisseur(int value) {
		this.supprimerUnfournisseur = value;
	}
	
	public int getSupprimerUnfournisseur() {
		return supprimerUnfournisseur;
	}
	
	public void setAjouterUneAddresse(int value) {
		this.ajouterUneAddresse = value;
	}
	
	public int getAjouterUneAddresse() {
		return ajouterUneAddresse;
	}
	
	public void setModifierUneAddresse(int value) {
		this.modifierUneAddresse = value;
	}
	
	public int getModifierUneAddresse() {
		return modifierUneAddresse;
	}
	
	public void setSupprimerUneAddresse(int value) {
		this.supprimerUneAddresse = value;
	}
	
	public int getSupprimerUneAddresse() {
		return supprimerUneAddresse;
	}
	
	public void setAjouterUneCategorie(int value) {
		this.ajouterUneCategorie = value;
	}
	
	public int getAjouterUneCategorie() {
		return ajouterUneCategorie;
	}
	
	public void setModifierUneCategorie(int value) {
		this.modifierUneCategorie = value;
	}
	
	public int getModifierUneCategorie() {
		return modifierUneCategorie;
	}
	
	public void setSupprimerUneCategorie(int value) {
		this.supprimerUneCategorie = value;
	}
	
	public int getSupprimerUneCategorie() {
		return supprimerUneCategorie;
	}
	
	public void setAjouterUnClient(int value) {
		this.ajouterUnClient = value;
	}
	
	public int getAjouterUnClient() {
		return ajouterUnClient;
	}
	
	public void setModifierUnClient(int value) {
		this.modifierUnClient = value;
	}
	
	public int getModifierUnClient() {
		return modifierUnClient;
	}
	
	public void setSupprimerunClient(int value) {
		this.supprimerunClient = value;
	}
	
	public int getSupprimerunClient() {
		return supprimerunClient;
	}
	
	public void setAjouterUneCharge(int value) {
		this.ajouterUneCharge = value;
	}
	
	public int getAjouterUneCharge() {
		return ajouterUneCharge;
	}
	
	public void setModifierUneCharge(int value) {
		this.modifierUneCharge = value;
	}
	
	public int getModifierUneCharge() {
		return modifierUneCharge;
	}
	
	public void setSupprimerunecharge(int value) {
		this.supprimerunecharge = value;
	}
	
	public int getSupprimerunecharge() {
		return supprimerunecharge;
	}
	
	public void setPrivilegeRoot(int value) {
		this.privilegeRoot = value;
	}
	
	public int getPrivilegeRoot() {
		return privilegeRoot;
	}
	
	private void setORM_Typeusers(java.util.Set value) {
		this.ORM_typeusers = value;
	}
	
	private java.util.Set getORM_Typeusers() {
		return ORM_typeusers;
	}
	
	public final crud.TypeusersSetCollection typeusers = new crud.TypeusersSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_USERSRIGHTS_TYPEUSERS, crud.ORMConstants.KEY_TYPEUSERS_USERSRIGHTSIDUSERSRIGHTS, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsersRights());
	}
	
}
