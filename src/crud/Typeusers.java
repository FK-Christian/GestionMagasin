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

public class Typeusers {
	public Typeusers() {
	}
	
	public static Typeusers loadTypeusersByORMID(int idTypeUsers) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadTypeusersByORMID(session, idTypeUsers);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers getTypeusersByORMID(int idTypeUsers) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getTypeusersByORMID(session, idTypeUsers);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByORMID(int idTypeUsers, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadTypeusersByORMID(session, idTypeUsers, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers getTypeusersByORMID(int idTypeUsers, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getTypeusersByORMID(session, idTypeUsers, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByORMID(PersistentSession session, int idTypeUsers) throws PersistentException {
		try {
			return (Typeusers) session.load(crud.Typeusers.class, new Integer(idTypeUsers));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers getTypeusersByORMID(PersistentSession session, int idTypeUsers) throws PersistentException {
		try {
			return (Typeusers) session.get(crud.Typeusers.class, new Integer(idTypeUsers));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByORMID(PersistentSession session, int idTypeUsers, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Typeusers) session.load(crud.Typeusers.class, new Integer(idTypeUsers), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers getTypeusersByORMID(PersistentSession session, int idTypeUsers, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Typeusers) session.get(crud.Typeusers.class, new Integer(idTypeUsers), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTypeusers(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryTypeusers(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTypeusers(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryTypeusers(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers[] listTypeusersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listTypeusersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers[] listTypeusersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listTypeusersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTypeusers(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Typeusers as Typeusers");
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
	
	public static List queryTypeusers(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Typeusers as Typeusers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Typeusers", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers[] listTypeusersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTypeusers(session, condition, orderBy);
			return (Typeusers[]) list.toArray(new Typeusers[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers[] listTypeusersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTypeusers(session, condition, orderBy, lockMode);
			return (Typeusers[]) list.toArray(new Typeusers[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadTypeusersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadTypeusersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers loadTypeusersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Typeusers[] typeuserses = listTypeusersByQuery(session, condition, orderBy);
		if (typeuserses != null && typeuserses.length > 0)
			return typeuserses[0];
		else
			return null;
	}
	
	public static Typeusers loadTypeusersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Typeusers[] typeuserses = listTypeusersByQuery(session, condition, orderBy, lockMode);
		if (typeuserses != null && typeuserses.length > 0)
			return typeuserses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTypeusersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateTypeusersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTypeusersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateTypeusersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTypeusersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Typeusers as Typeusers");
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
	
	public static java.util.Iterator iterateTypeusersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Typeusers as Typeusers");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Typeusers", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Typeusers createTypeusers() {
		return new crud.Typeusers();
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
			if(getUsersrightsidUsersRights() != null) {
				getUsersrightsidUsersRights().typeusers.remove(this);
			}
			
			crud.Utilisateur[] lUtilisateurs = utilisateur.toArray();
			for(int i = 0; i < lUtilisateurs.length; i++) {
				lUtilisateurs[i].setTypeusersidTypeUsers(null);
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
			if(getUsersrightsidUsersRights() != null) {
				getUsersrightsidUsersRights().typeusers.remove(this);
			}
			
			crud.Utilisateur[] lUtilisateurs = utilisateur.toArray();
			for(int i = 0; i < lUtilisateurs.length; i++) {
				lUtilisateurs[i].setTypeusersidTypeUsers(null);
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
		if (key == crud.ORMConstants.KEY_TYPEUSERS_UTILISATEUR) {
			return ORM_utilisateur;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_TYPEUSERS_USERSRIGHTSIDUSERSRIGHTS) {
			this.usersrightsidUsersRights = (crud.Usersrights) owner;
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
	
	private int idTypeUsers;
	
	private String typeuser;
	
	private String description;
	
	private crud.Usersrights usersrightsidUsersRights;
	
	private java.util.Set ORM_utilisateur = new java.util.HashSet();
	
	private void setIdTypeUsers(int value) {
		this.idTypeUsers = value;
	}
	
	public int getIdTypeUsers() {
		return idTypeUsers;
	}
	
	public int getORMID() {
		return getIdTypeUsers();
	}
	
	public void setTypeuser(String value) {
		this.typeuser = value;
	}
	
	public String getTypeuser() {
		return typeuser;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setUsersrightsidUsersRights(crud.Usersrights value) {
		if (usersrightsidUsersRights != null) {
			usersrightsidUsersRights.typeusers.remove(this);
		}
		if (value != null) {
			value.typeusers.add(this);
		}
	}
	
	public crud.Usersrights getUsersrightsidUsersRights() {
		return usersrightsidUsersRights;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_UsersrightsidUsersRights(crud.Usersrights value) {
		this.usersrightsidUsersRights = value;
	}
	
	private crud.Usersrights getORM_UsersrightsidUsersRights() {
		return usersrightsidUsersRights;
	}
	
	private void setORM_Utilisateur(java.util.Set value) {
		this.ORM_utilisateur = value;
	}
	
	private java.util.Set getORM_Utilisateur() {
		return ORM_utilisateur;
	}
	
	public final crud.UtilisateurSetCollection utilisateur = new crud.UtilisateurSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_TYPEUSERS_UTILISATEUR, crud.ORMConstants.KEY_UTILISATEUR_TYPEUSERSIDTYPEUSERS, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTypeUsers());
	}
	
}
