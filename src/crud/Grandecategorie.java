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

public class Grandecategorie {
	public Grandecategorie() {
	}
	
	public static Grandecategorie loadGrandecategorieByORMID(int idGrandeCategorie) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadGrandecategorieByORMID(session, idGrandeCategorie);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie getGrandecategorieByORMID(int idGrandeCategorie) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getGrandecategorieByORMID(session, idGrandeCategorie);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByORMID(int idGrandeCategorie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadGrandecategorieByORMID(session, idGrandeCategorie, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie getGrandecategorieByORMID(int idGrandeCategorie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getGrandecategorieByORMID(session, idGrandeCategorie, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByORMID(PersistentSession session, int idGrandeCategorie) throws PersistentException {
		try {
			return (Grandecategorie) session.load(crud.Grandecategorie.class, new Integer(idGrandeCategorie));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie getGrandecategorieByORMID(PersistentSession session, int idGrandeCategorie) throws PersistentException {
		try {
			return (Grandecategorie) session.get(crud.Grandecategorie.class, new Integer(idGrandeCategorie));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByORMID(PersistentSession session, int idGrandeCategorie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grandecategorie) session.load(crud.Grandecategorie.class, new Integer(idGrandeCategorie), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie getGrandecategorieByORMID(PersistentSession session, int idGrandeCategorie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grandecategorie) session.get(crud.Grandecategorie.class, new Integer(idGrandeCategorie), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrandecategorie(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryGrandecategorie(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrandecategorie(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryGrandecategorie(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie[] listGrandecategorieByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listGrandecategorieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie[] listGrandecategorieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listGrandecategorieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrandecategorie(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Grandecategorie as Grandecategorie");
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
	
	public static List queryGrandecategorie(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Grandecategorie as Grandecategorie");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grandecategorie", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie[] listGrandecategorieByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrandecategorie(session, condition, orderBy);
			return (Grandecategorie[]) list.toArray(new Grandecategorie[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie[] listGrandecategorieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrandecategorie(session, condition, orderBy, lockMode);
			return (Grandecategorie[]) list.toArray(new Grandecategorie[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadGrandecategorieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadGrandecategorieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie loadGrandecategorieByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grandecategorie[] grandecategories = listGrandecategorieByQuery(session, condition, orderBy);
		if (grandecategories != null && grandecategories.length > 0)
			return grandecategories[0];
		else
			return null;
	}
	
	public static Grandecategorie loadGrandecategorieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Grandecategorie[] grandecategories = listGrandecategorieByQuery(session, condition, orderBy, lockMode);
		if (grandecategories != null && grandecategories.length > 0)
			return grandecategories[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGrandecategorieByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateGrandecategorieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrandecategorieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateGrandecategorieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrandecategorieByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Grandecategorie as Grandecategorie");
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
	
	public static java.util.Iterator iterateGrandecategorieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Grandecategorie as Grandecategorie");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grandecategorie", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grandecategorie createGrandecategorie() {
		return new crud.Grandecategorie();
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
			crud.Categories[] lCategoriess = categories.toArray();
			for(int i = 0; i < lCategoriess.length; i++) {
				lCategoriess[i].setGrandeCategorie_idGrandeCategorie(null);
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
			crud.Categories[] lCategoriess = categories.toArray();
			for(int i = 0; i < lCategoriess.length; i++) {
				lCategoriess[i].setGrandeCategorie_idGrandeCategorie(null);
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
		if (key == crud.ORMConstants.KEY_GRANDECATEGORIE_CATEGORIES) {
			return ORM_categories;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idGrandeCategorie;
	
	private String nom;
	
	private String description;
	
	private java.util.Set ORM_categories = new java.util.HashSet();
	
	private void setIdGrandeCategorie(int value) {
		this.idGrandeCategorie = value;
	}
	
	public int getIdGrandeCategorie() {
		return idGrandeCategorie;
	}
	
	public int getORMID() {
		return getIdGrandeCategorie();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setORM_Categories(java.util.Set value) {
		this.ORM_categories = value;
	}
	
	private java.util.Set getORM_Categories() {
		return ORM_categories;
	}
	
	public final crud.CategoriesSetCollection categories = new crud.CategoriesSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_GRANDECATEGORIE_CATEGORIES, crud.ORMConstants.KEY_CATEGORIES_GRANDECATEGORIE_IDGRANDECATEGORIE, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdGrandeCategorie());
	}
	
}
