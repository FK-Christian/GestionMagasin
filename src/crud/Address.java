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

public class Address {
	public Address() {
	}
	
	public static Address loadAddressByORMID(int idAddress) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadAddressByORMID(session, idAddress);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address getAddressByORMID(int idAddress) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getAddressByORMID(session, idAddress);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByORMID(int idAddress, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadAddressByORMID(session, idAddress, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address getAddressByORMID(int idAddress, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getAddressByORMID(session, idAddress, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByORMID(PersistentSession session, int idAddress) throws PersistentException {
		try {
			return (Address) session.load(crud.Address.class, new Integer(idAddress));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address getAddressByORMID(PersistentSession session, int idAddress) throws PersistentException {
		try {
			return (Address) session.get(crud.Address.class, new Integer(idAddress));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByORMID(PersistentSession session, int idAddress, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Address) session.load(crud.Address.class, new Integer(idAddress), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address getAddressByORMID(PersistentSession session, int idAddress, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Address) session.get(crud.Address.class, new Integer(idAddress), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAddress(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryAddress(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAddress(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryAddress(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address[] listAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address[] listAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAddress(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Address as Address");
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
	
	public static List queryAddress(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Address as Address");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Address", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAddress(session, condition, orderBy);
			return (Address[]) list.toArray(new Address[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAddress(session, condition, orderBy, lockMode);
			return (Address[]) list.toArray(new Address[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address loadAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Address[] addresses = listAddressByQuery(session, condition, orderBy);
		if (addresses != null && addresses.length > 0)
			return addresses[0];
		else
			return null;
	}
	
	public static Address loadAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Address[] addresses = listAddressByQuery(session, condition, orderBy, lockMode);
		if (addresses != null && addresses.length > 0)
			return addresses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Address as Address");
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
	
	public static java.util.Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Address as Address");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Address", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Address createAddress() {
		return new crud.Address();
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
			crud.Client[] lClients = client.toArray();
			for(int i = 0; i < lClients.length; i++) {
				lClients[i].setAddressidAddress(null);
			}
			crud.Fournisseur[] lFournisseurs = fournisseur.toArray();
			for(int i = 0; i < lFournisseurs.length; i++) {
				lFournisseurs[i].setAddressidAddress(null);
			}
			crud.Utilisateur[] lUtilisateurs = utilisateur.toArray();
			for(int i = 0; i < lUtilisateurs.length; i++) {
				lUtilisateurs[i].setAddressidAddress(null);
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
			crud.Client[] lClients = client.toArray();
			for(int i = 0; i < lClients.length; i++) {
				lClients[i].setAddressidAddress(null);
			}
			crud.Fournisseur[] lFournisseurs = fournisseur.toArray();
			for(int i = 0; i < lFournisseurs.length; i++) {
				lFournisseurs[i].setAddressidAddress(null);
			}
			crud.Utilisateur[] lUtilisateurs = utilisateur.toArray();
			for(int i = 0; i < lUtilisateurs.length; i++) {
				lUtilisateurs[i].setAddressidAddress(null);
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
		if (key == crud.ORMConstants.KEY_ADDRESS_CLIENT) {
			return ORM_client;
		}
		else if (key == crud.ORMConstants.KEY_ADDRESS_FOURNISSEUR) {
			return ORM_fournisseur;
		}
		else if (key == crud.ORMConstants.KEY_ADDRESS_UTILISATEUR) {
			return ORM_utilisateur;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idAddress;
	
	private String numtel;
	
	private String lieu_de_residense;
	
	private String email;
	
	private String boitePostal;
	
	private String siteWeb;
	
	private java.util.Set ORM_client = new java.util.HashSet();
	
	private java.util.Set ORM_fournisseur = new java.util.HashSet();
	
	private java.util.Set ORM_utilisateur = new java.util.HashSet();
	
	private void setIdAddress(int value) {
		this.idAddress = value;
	}
	
	public int getIdAddress() {
		return idAddress;
	}
	
	public int getORMID() {
		return getIdAddress();
	}
	
	public void setNumtel(String value) {
		this.numtel = value;
	}
	
	public String getNumtel() {
		return numtel;
	}
	
	public void setLieu_de_residense(String value) {
		this.lieu_de_residense = value;
	}
	
	public String getLieu_de_residense() {
		return lieu_de_residense;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setBoitePostal(String value) {
		this.boitePostal = value;
	}
	
	public String getBoitePostal() {
		return boitePostal;
	}
	
	public void setSiteWeb(String value) {
		this.siteWeb = value;
	}
	
	public String getSiteWeb() {
		return siteWeb;
	}
	
	private void setORM_Client(java.util.Set value) {
		this.ORM_client = value;
	}
	
	private java.util.Set getORM_Client() {
		return ORM_client;
	}
	
	public final crud.ClientSetCollection client = new crud.ClientSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_ADDRESS_CLIENT, crud.ORMConstants.KEY_CLIENT_ADDRESSIDADDRESS, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Fournisseur(java.util.Set value) {
		this.ORM_fournisseur = value;
	}
	
	private java.util.Set getORM_Fournisseur() {
		return ORM_fournisseur;
	}
	
	public final crud.FournisseurSetCollection fournisseur = new crud.FournisseurSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_ADDRESS_FOURNISSEUR, crud.ORMConstants.KEY_FOURNISSEUR_ADDRESSIDADDRESS, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Utilisateur(java.util.Set value) {
		this.ORM_utilisateur = value;
	}
	
	private java.util.Set getORM_Utilisateur() {
		return ORM_utilisateur;
	}
	
	public final crud.UtilisateurSetCollection utilisateur = new crud.UtilisateurSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_ADDRESS_UTILISATEUR, crud.ORMConstants.KEY_UTILISATEUR_ADDRESSIDADDRESS, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAddress());
	}
	
}
