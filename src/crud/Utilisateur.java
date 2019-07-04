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

public class Utilisateur {
	public Utilisateur() {
	}
	
	public static Utilisateur loadUtilisateurByORMID(int idUser) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, idUser);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int idUser) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, idUser);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(int idUser, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, idUser, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int idUser, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, idUser, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int idUser) throws PersistentException {
		try {
			return (Utilisateur) session.load(crud.Utilisateur.class, new Integer(idUser));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int idUser) throws PersistentException {
		try {
			return (Utilisateur) session.get(crud.Utilisateur.class, new Integer(idUser));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int idUser, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.load(crud.Utilisateur.class, new Integer(idUser), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int idUser, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.get(crud.Utilisateur.class, new Integer(idUser), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Utilisateur as Utilisateur");
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
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy, lockMode);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy, lockMode);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Utilisateur as Utilisateur");
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
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur createUtilisateur() {
		return new crud.Utilisateur();
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
			if(getTypeusersidTypeUsers() != null) {
				getTypeusersidTypeUsers().utilisateur.remove(this);
			}
			
			if(getAddressidAddress() != null) {
				getAddressidAddress().utilisateur.remove(this);
			}
			
			crud.Vente[] lVentes = vente.toArray();
			for(int i = 0; i < lVentes.length; i++) {
				lVentes[i].setUtilisateuridUser(null);
			}
			crud.Vente[] lVente1s = vente1.toArray();
			for(int i = 0; i < lVente1s.length; i++) {
				lVente1s[i].setUsersoldeur(null);
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
			if(getTypeusersidTypeUsers() != null) {
				getTypeusersidTypeUsers().utilisateur.remove(this);
			}
			
			if(getAddressidAddress() != null) {
				getAddressidAddress().utilisateur.remove(this);
			}
			
			crud.Vente[] lVentes = vente.toArray();
			for(int i = 0; i < lVentes.length; i++) {
				lVentes[i].setUtilisateuridUser(null);
			}
			crud.Vente[] lVente1s = vente1.toArray();
			for(int i = 0; i < lVente1s.length; i++) {
				lVente1s[i].setUsersoldeur(null);
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
		if (key == crud.ORMConstants.KEY_UTILISATEUR_VENTE) {
			return ORM_vente;
		}
		else if (key == crud.ORMConstants.KEY_UTILISATEUR_VENTE1) {
			return ORM_vente1;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_UTILISATEUR_TYPEUSERSIDTYPEUSERS) {
			this.typeusersidTypeUsers = (crud.Typeusers) owner;
		}
		
		else if (key == crud.ORMConstants.KEY_UTILISATEUR_ADDRESSIDADDRESS) {
			this.addressidAddress = (crud.Address) owner;
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
	
	private int idUser;
	
	private String nom;
	
	private String prenom;
	
	private String login;
	
	private String motdepass;
	
	private String description;
	
	private crud.Typeusers typeusersidTypeUsers;
	
	private crud.Address addressidAddress;
	
	private java.util.Set ORM_vente = new java.util.HashSet();
	
	private java.util.Set ORM_vente1 = new java.util.HashSet();
	
	private void setIdUser(int value) {
		this.idUser = value;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public int getORMID() {
		return getIdUser();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setMotdepass(String value) {
		this.motdepass = value;
	}
	
	public String getMotdepass() {
		return motdepass;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setTypeusersidTypeUsers(crud.Typeusers value) {
		if (typeusersidTypeUsers != null) {
			typeusersidTypeUsers.utilisateur.remove(this);
		}
		if (value != null) {
			value.utilisateur.add(this);
		}
	}
	
	public crud.Typeusers getTypeusersidTypeUsers() {
		return typeusersidTypeUsers;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_TypeusersidTypeUsers(crud.Typeusers value) {
		this.typeusersidTypeUsers = value;
	}
	
	private crud.Typeusers getORM_TypeusersidTypeUsers() {
		return typeusersidTypeUsers;
	}
	
	public void setAddressidAddress(crud.Address value) {
		if (addressidAddress != null) {
			addressidAddress.utilisateur.remove(this);
		}
		if (value != null) {
			value.utilisateur.add(this);
		}
	}
	
	public crud.Address getAddressidAddress() {
		return addressidAddress;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_AddressidAddress(crud.Address value) {
		this.addressidAddress = value;
	}
	
	private crud.Address getORM_AddressidAddress() {
		return addressidAddress;
	}
	
	private void setORM_Vente(java.util.Set value) {
		this.ORM_vente = value;
	}
	
	private java.util.Set getORM_Vente() {
		return ORM_vente;
	}
	
	public final crud.VenteSetCollection vente = new crud.VenteSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_UTILISATEUR_VENTE, crud.ORMConstants.KEY_VENTE_UTILISATEURIDUSER, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Vente1(java.util.Set value) {
		this.ORM_vente1 = value;
	}
	
	private java.util.Set getORM_Vente1() {
		return ORM_vente1;
	}
	
	public final crud.VenteSetCollection vente1 = new crud.VenteSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_UTILISATEUR_VENTE1, crud.ORMConstants.KEY_VENTE_USERSOLDEUR, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUser());
	}
	
}
