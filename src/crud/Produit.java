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

public class Produit {
	public Produit() {
	}
	
	public static Produit loadProduitByORMID(int idProduit) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduitByORMID(session, idProduit);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit getProduitByORMID(int idProduit) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getProduitByORMID(session, idProduit);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByORMID(int idProduit, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduitByORMID(session, idProduit, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit getProduitByORMID(int idProduit, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getProduitByORMID(session, idProduit, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByORMID(PersistentSession session, int idProduit) throws PersistentException {
		try {
			return (Produit) session.load(crud.Produit.class, new Integer(idProduit));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit getProduitByORMID(PersistentSession session, int idProduit) throws PersistentException {
		try {
			return (Produit) session.get(crud.Produit.class, new Integer(idProduit));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByORMID(PersistentSession session, int idProduit, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Produit) session.load(crud.Produit.class, new Integer(idProduit), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit getProduitByORMID(PersistentSession session, int idProduit, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Produit) session.get(crud.Produit.class, new Integer(idProduit), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryProduit(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryProduit(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit[] listProduitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listProduitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit[] listProduitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listProduitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit as Produit");
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
	
	public static List queryProduit(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit as Produit");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Produit", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit[] listProduitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProduit(session, condition, orderBy);
			return (Produit[]) list.toArray(new Produit[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit[] listProduitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProduit(session, condition, orderBy, lockMode);
			return (Produit[]) list.toArray(new Produit[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit loadProduitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Produit[] produits = listProduitByQuery(session, condition, orderBy);
		if (produits != null && produits.length > 0)
			return produits[0];
		else
			return null;
	}
	
	public static Produit loadProduitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Produit[] produits = listProduitByQuery(session, condition, orderBy, lockMode);
		if (produits != null && produits.length > 0)
			return produits[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProduitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateProduitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProduitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateProduitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProduitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit as Produit");
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
	
	public static java.util.Iterator iterateProduitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit as Produit");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Produit", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit createProduit() {
		return new crud.Produit();
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
			crud.Fournisseur[] lFournisseuridfournisseurs = fournisseuridfournisseur.toArray();
			for(int i = 0; i < lFournisseuridfournisseurs.length; i++) {
				lFournisseuridfournisseurs[i].produitidProduit.remove(this);
			}
			crud.Categories[] lCategoriesidCategoriess = categoriesidCategories.toArray();
			for(int i = 0; i < lCategoriesidCategoriess.length; i++) {
				lCategoriesidCategoriess[i].produitidProduit.remove(this);
			}
			crud.Produit_vente[] lProduit_ventes = produit_vente.toArray();
			for(int i = 0; i < lProduit_ventes.length; i++) {
				lProduit_ventes[i].setProduitidProduit(null);
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
			crud.Fournisseur[] lFournisseuridfournisseurs = fournisseuridfournisseur.toArray();
			for(int i = 0; i < lFournisseuridfournisseurs.length; i++) {
				lFournisseuridfournisseurs[i].produitidProduit.remove(this);
			}
			crud.Categories[] lCategoriesidCategoriess = categoriesidCategories.toArray();
			for(int i = 0; i < lCategoriesidCategoriess.length; i++) {
				lCategoriesidCategoriess[i].produitidProduit.remove(this);
			}
			crud.Produit_vente[] lProduit_ventes = produit_vente.toArray();
			for(int i = 0; i < lProduit_ventes.length; i++) {
				lProduit_ventes[i].setProduitidProduit(null);
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
		if (key == crud.ORMConstants.KEY_PRODUIT_FOURNISSEURIDFOURNISSEUR) {
			return ORM_fournisseuridfournisseur;
		}
		else if (key == crud.ORMConstants.KEY_PRODUIT_CATEGORIESIDCATEGORIES) {
			return ORM_categoriesidCategories;
		}
		else if (key == crud.ORMConstants.KEY_PRODUIT_PRODUIT_VENTE) {
			return ORM_produit_vente;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idProduit;
	
	private String designation;
	
	private int prix_unitaire_de_vente;
	
	private int prix_d_achat;
	
	private java.util.Date date_de_peremtion;
	
	private int quantite;
	
	private String code;
	
	private int seuil_de_vente;
	
	private java.util.Set ORM_fournisseuridfournisseur = new java.util.HashSet();
	
	private java.util.Set ORM_categoriesidCategories = new java.util.HashSet();
	
	private java.util.Set ORM_produit_vente = new java.util.HashSet();
	
	private void setIdProduit(int value) {
		this.idProduit = value;
	}
	
	public int getIdProduit() {
		return idProduit;
	}
	
	public int getORMID() {
		return getIdProduit();
	}
	
	public void setDesignation(String value) {
		this.designation = value;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setPrix_unitaire_de_vente(int value) {
		this.prix_unitaire_de_vente = value;
	}
	
	public int getPrix_unitaire_de_vente() {
		return prix_unitaire_de_vente;
	}
	
	public void setPrix_d_achat(int value) {
		this.prix_d_achat = value;
	}
	
	public int getPrix_d_achat() {
		return prix_d_achat;
	}
	
	public void setDate_de_peremtion(java.util.Date value) {
		this.date_de_peremtion = value;
	}
	
	public java.util.Date getDate_de_peremtion() {
		return date_de_peremtion;
	}
	
	public void setQuantite(int value) {
		this.quantite = value;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setSeuil_de_vente(int value) {
		this.seuil_de_vente = value;
	}
	
	public int getSeuil_de_vente() {
		return seuil_de_vente;
	}
	
	private void setORM_Fournisseuridfournisseur(java.util.Set value) {
		this.ORM_fournisseuridfournisseur = value;
	}
	
	private java.util.Set getORM_Fournisseuridfournisseur() {
		return ORM_fournisseuridfournisseur;
	}
	
	public final crud.FournisseurSetCollection fournisseuridfournisseur = new crud.FournisseurSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_PRODUIT_FOURNISSEURIDFOURNISSEUR, crud.ORMConstants.KEY_FOURNISSEUR_PRODUITIDPRODUIT, crud.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_CategoriesidCategories(java.util.Set value) {
		this.ORM_categoriesidCategories = value;
	}
	
	private java.util.Set getORM_CategoriesidCategories() {
		return ORM_categoriesidCategories;
	}
	
	public final crud.CategoriesSetCollection categoriesidCategories = new crud.CategoriesSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_PRODUIT_CATEGORIESIDCATEGORIES, crud.ORMConstants.KEY_CATEGORIES_PRODUITIDPRODUIT, crud.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Produit_vente(java.util.Set value) {
		this.ORM_produit_vente = value;
	}
	
	private java.util.Set getORM_Produit_vente() {
		return ORM_produit_vente;
	}
	
	public final crud.Produit_venteSetCollection produit_vente = new crud.Produit_venteSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_PRODUIT_PRODUIT_VENTE, crud.ORMConstants.KEY_PRODUIT_VENTE_PRODUITIDPRODUIT, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdProduit());
	}
	
}
