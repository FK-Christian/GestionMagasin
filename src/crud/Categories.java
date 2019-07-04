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

public class Categories {
	public Categories() {
	}
	
	public static Categories loadCategoriesByORMID(int idCategories) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadCategoriesByORMID(session, idCategories);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories getCategoriesByORMID(int idCategories) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getCategoriesByORMID(session, idCategories);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByORMID(int idCategories, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadCategoriesByORMID(session, idCategories, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories getCategoriesByORMID(int idCategories, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getCategoriesByORMID(session, idCategories, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByORMID(PersistentSession session, int idCategories) throws PersistentException {
		try {
			return (Categories) session.load(crud.Categories.class, new Integer(idCategories));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories getCategoriesByORMID(PersistentSession session, int idCategories) throws PersistentException {
		try {
			return (Categories) session.get(crud.Categories.class, new Integer(idCategories));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByORMID(PersistentSession session, int idCategories, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categories) session.load(crud.Categories.class, new Integer(idCategories), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories getCategoriesByORMID(PersistentSession session, int idCategories, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categories) session.get(crud.Categories.class, new Integer(idCategories), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategories(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryCategories(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategories(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryCategories(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories[] listCategoriesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories[] listCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategories(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Categories as Categories");
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
	
	public static List queryCategories(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Categories as Categories");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categories", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories[] listCategoriesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCategories(session, condition, orderBy);
			return (Categories[]) list.toArray(new Categories[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories[] listCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCategories(session, condition, orderBy, lockMode);
			return (Categories[]) list.toArray(new Categories[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories loadCategoriesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Categories[] categorieses = listCategoriesByQuery(session, condition, orderBy);
		if (categorieses != null && categorieses.length > 0)
			return categorieses[0];
		else
			return null;
	}
	
	public static Categories loadCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Categories[] categorieses = listCategoriesByQuery(session, condition, orderBy, lockMode);
		if (categorieses != null && categorieses.length > 0)
			return categorieses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateCategoriesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateCategoriesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategoriesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Categories as Categories");
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
	
	public static java.util.Iterator iterateCategoriesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Categories as Categories");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categories", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categories createCategories() {
		return new crud.Categories();
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
			if(getGrandeCategorie_idGrandeCategorie() != null) {
				getGrandeCategorie_idGrandeCategorie().categories.remove(this);
			}
			
			crud.Produit[] lProduitidProduits = produitidProduit.toArray();
			for(int i = 0; i < lProduitidProduits.length; i++) {
				lProduitidProduits[i].categoriesidCategories.remove(this);
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
			if(getGrandeCategorie_idGrandeCategorie() != null) {
				getGrandeCategorie_idGrandeCategorie().categories.remove(this);
			}
			
			crud.Produit[] lProduitidProduits = produitidProduit.toArray();
			for(int i = 0; i < lProduitidProduits.length; i++) {
				lProduitidProduits[i].categoriesidCategories.remove(this);
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
		if (key == crud.ORMConstants.KEY_CATEGORIES_PRODUITIDPRODUIT) {
			return ORM_produitidProduit;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_CATEGORIES_GRANDECATEGORIE_IDGRANDECATEGORIE) {
			this.grandeCategorie_idGrandeCategorie = (crud.Grandecategorie) owner;
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
	
	private int idCategories;
	
	private String designation;
	
	private String description;
	
	private crud.Grandecategorie grandeCategorie_idGrandeCategorie;
	
	private java.util.Set ORM_produitidProduit = new java.util.HashSet();
	
	private void setIdCategories(int value) {
		this.idCategories = value;
	}
	
	public int getIdCategories() {
		return idCategories;
	}
	
	public int getORMID() {
		return getIdCategories();
	}
	
	public void setDesignation(String value) {
		this.designation = value;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setORM_ProduitidProduit(java.util.Set value) {
		this.ORM_produitidProduit = value;
	}
	
	private java.util.Set getORM_ProduitidProduit() {
		return ORM_produitidProduit;
	}
	
	public final crud.ProduitSetCollection produitidProduit = new crud.ProduitSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_CATEGORIES_PRODUITIDPRODUIT, crud.ORMConstants.KEY_PRODUIT_CATEGORIESIDCATEGORIES, crud.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setGrandeCategorie_idGrandeCategorie(crud.Grandecategorie value) {
		if (grandeCategorie_idGrandeCategorie != null) {
			grandeCategorie_idGrandeCategorie.categories.remove(this);
		}
		if (value != null) {
			value.categories.add(this);
		}
	}
	
	public crud.Grandecategorie getGrandeCategorie_idGrandeCategorie() {
		return grandeCategorie_idGrandeCategorie;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_GrandeCategorie_idGrandeCategorie(crud.Grandecategorie value) {
		this.grandeCategorie_idGrandeCategorie = value;
	}
	
	private crud.Grandecategorie getORM_GrandeCategorie_idGrandeCategorie() {
		return grandeCategorie_idGrandeCategorie;
	}
	
	public String toString() {
		return String.valueOf(getIdCategories());
	}
	
}
