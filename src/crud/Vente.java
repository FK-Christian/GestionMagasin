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

public class Vente {
	public Vente() {
	}
	
	public static Vente loadVenteByORMID(int idVente) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadVenteByORMID(session, idVente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente getVenteByORMID(int idVente) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getVenteByORMID(session, idVente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByORMID(int idVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadVenteByORMID(session, idVente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente getVenteByORMID(int idVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getVenteByORMID(session, idVente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByORMID(PersistentSession session, int idVente) throws PersistentException {
		try {
			return (Vente) session.load(crud.Vente.class, new Integer(idVente));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente getVenteByORMID(PersistentSession session, int idVente) throws PersistentException {
		try {
			return (Vente) session.get(crud.Vente.class, new Integer(idVente));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByORMID(PersistentSession session, int idVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vente) session.load(crud.Vente.class, new Integer(idVente), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente getVenteByORMID(PersistentSession session, int idVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vente) session.get(crud.Vente.class, new Integer(idVente), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryVente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryVente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente[] listVenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listVenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente[] listVenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listVenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Vente as Vente");
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
	
	public static List queryVente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Vente as Vente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente[] listVenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVente(session, condition, orderBy);
			return (Vente[]) list.toArray(new Vente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente[] listVenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVente(session, condition, orderBy, lockMode);
			return (Vente[]) list.toArray(new Vente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadVenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadVenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente loadVenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Vente[] ventes = listVenteByQuery(session, condition, orderBy);
		if (ventes != null && ventes.length > 0)
			return ventes[0];
		else
			return null;
	}
	
	public static Vente loadVenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Vente[] ventes = listVenteByQuery(session, condition, orderBy, lockMode);
		if (ventes != null && ventes.length > 0)
			return ventes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateVenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateVenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Vente as Vente");
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
	
	public static java.util.Iterator iterateVenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Vente as Vente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vente createVente() {
		return new crud.Vente();
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
			if(getClientidClient() != null) {
				getClientidClient().vente.remove(this);
			}
			
			if(getUtilisateuridUser() != null) {
				getUtilisateuridUser().vente.remove(this);
			}
			
			if(getUsersoldeur() != null) {
				getUsersoldeur().vente1.remove(this);
			}
			
			crud.Produit_vente[] lProduit_ventes = produit_vente.toArray();
			for(int i = 0; i < lProduit_ventes.length; i++) {
				lProduit_ventes[i].setVenteidVente(null);
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
			if(getClientidClient() != null) {
				getClientidClient().vente.remove(this);
			}
			
			if(getUtilisateuridUser() != null) {
				getUtilisateuridUser().vente.remove(this);
			}
			
			if(getUsersoldeur() != null) {
				getUsersoldeur().vente1.remove(this);
			}
			
			crud.Produit_vente[] lProduit_ventes = produit_vente.toArray();
			for(int i = 0; i < lProduit_ventes.length; i++) {
				lProduit_ventes[i].setVenteidVente(null);
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
		if (key == crud.ORMConstants.KEY_VENTE_PRODUIT_VENTE) {
			return ORM_produit_vente;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_VENTE_CLIENTIDCLIENT) {
			this.clientidClient = (crud.Client) owner;
		}
		
		else if (key == crud.ORMConstants.KEY_VENTE_UTILISATEURIDUSER) {
			this.utilisateuridUser = (crud.Utilisateur) owner;
		}
		
		else if (key == crud.ORMConstants.KEY_VENTE_USERSOLDEUR) {
			this.usersoldeur = (crud.Utilisateur) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idVente;
	
	private int prix_de_vente;
	
	private java.sql.Timestamp date_de_vente;
	
	private crud.Client clientidClient;
	
	private crud.Utilisateur utilisateuridUser;
	
	private int etat;
	
	private int tva;
	
	private int benefices;
	
	private Integer montant_de_dette;
	
	private java.sql.Timestamp date_de_solde;
	
	private String type_enregistrement;
	
	private String description;
	
	private crud.Utilisateur usersoldeur;
	
	private java.util.Set ORM_produit_vente = new java.util.HashSet();
	
	private void setIdVente(int value) {
		this.idVente = value;
	}
	
	public int getIdVente() {
		return idVente;
	}
	
	public int getORMID() {
		return getIdVente();
	}
	
	public void setPrix_de_vente(int value) {
		this.prix_de_vente = value;
	}
	
	public int getPrix_de_vente() {
		return prix_de_vente;
	}
	
	public void setDate_de_vente(java.sql.Timestamp value) {
		this.date_de_vente = value;
	}
	
	public java.sql.Timestamp getDate_de_vente() {
		return date_de_vente;
	}
	
	public void setEtat(int value) {
		this.etat = value;
	}
	
	public int getEtat() {
		return etat;
	}
	
	public void setTva(int value) {
		this.tva = value;
	}
	
	public int getTva() {
		return tva;
	}
	
	public void setBenefices(int value) {
		this.benefices = value;
	}
	
	public int getBenefices() {
		return benefices;
	}
	
	public void setMontant_de_dette(int value) {
		setMontant_de_dette(new Integer(value));
	}
	
	public void setMontant_de_dette(Integer value) {
		this.montant_de_dette = value;
	}
	
	public Integer getMontant_de_dette() {
		return montant_de_dette;
	}
	
	public void setDate_de_solde(java.sql.Timestamp value) {
		this.date_de_solde = value;
	}
	
	public java.sql.Timestamp getDate_de_solde() {
		return date_de_solde;
	}
	
	public void setType_enregistrement(String value) {
		this.type_enregistrement = value;
	}
	
	public String getType_enregistrement() {
		return type_enregistrement;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setClientidClient(crud.Client value) {
		if (clientidClient != null) {
			clientidClient.vente.remove(this);
		}
		if (value != null) {
			value.vente.add(this);
		}
	}
	
	public crud.Client getClientidClient() {
		return clientidClient;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_ClientidClient(crud.Client value) {
		this.clientidClient = value;
	}
	
	private crud.Client getORM_ClientidClient() {
		return clientidClient;
	}
	
	public void setUtilisateuridUser(crud.Utilisateur value) {
		if (utilisateuridUser != null) {
			utilisateuridUser.vente.remove(this);
		}
		if (value != null) {
			value.vente.add(this);
		}
	}
	
	public crud.Utilisateur getUtilisateuridUser() {
		return utilisateuridUser;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_UtilisateuridUser(crud.Utilisateur value) {
		this.utilisateuridUser = value;
	}
	
	private crud.Utilisateur getORM_UtilisateuridUser() {
		return utilisateuridUser;
	}
	
	public void setUsersoldeur(crud.Utilisateur value) {
		if (usersoldeur != null) {
			usersoldeur.vente1.remove(this);
		}
		if (value != null) {
			value.vente1.add(this);
		}
	}
	
	public crud.Utilisateur getUsersoldeur() {
		return usersoldeur;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Usersoldeur(crud.Utilisateur value) {
		this.usersoldeur = value;
	}
	
	private crud.Utilisateur getORM_Usersoldeur() {
		return usersoldeur;
	}
	
	private void setORM_Produit_vente(java.util.Set value) {
		this.ORM_produit_vente = value;
	}
	
	private java.util.Set getORM_Produit_vente() {
		return ORM_produit_vente;
	}
	
	public final crud.Produit_venteSetCollection produit_vente = new crud.Produit_venteSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_VENTE_PRODUIT_VENTE, crud.ORMConstants.KEY_PRODUIT_VENTE_VENTEIDVENTE, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdVente());
	}
	
}
