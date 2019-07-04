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

import java.io.Serializable;
public class Produit_vente implements Serializable {
	public Produit_vente() {
	}
	
	public static Produit_vente loadProduit_venteByORMID(crud.Produit produitidProduit, crud.Vente venteidVente) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduit_venteByORMID(session, produitidProduit, venteidVente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente getProduit_venteByORMID(crud.Produit produitidProduit, crud.Vente venteidVente) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getProduit_venteByORMID(session, produitidProduit, venteidVente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByORMID(crud.Produit produitidProduit, crud.Vente venteidVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduit_venteByORMID(session, produitidProduit, venteidVente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente getProduit_venteByORMID(crud.Produit produitidProduit, crud.Vente venteidVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getProduit_venteByORMID(session, produitidProduit, venteidVente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByORMID(PersistentSession session, crud.Produit produitidProduit, crud.Vente venteidVente) throws PersistentException {
		try {
			Produit_vente produit_vente = new crud.Produit_vente();
			produit_vente.setORM_ProduitidProduit(produitidProduit);
			produit_vente.setORM_VenteidVente(venteidVente);
			
			return (Produit_vente) session.load(crud.Produit_vente.class, produit_vente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente getProduit_venteByORMID(PersistentSession session, crud.Produit produitidProduit, crud.Vente venteidVente) throws PersistentException {
		try {
			Produit_vente produit_vente = new crud.Produit_vente();
			produit_vente.setORM_ProduitidProduit(produitidProduit);
			produit_vente.setORM_VenteidVente(venteidVente);
			
			return (Produit_vente) session.get(crud.Produit_vente.class, produit_vente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByORMID(PersistentSession session, crud.Produit produitidProduit, crud.Vente venteidVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Produit_vente produit_vente = new crud.Produit_vente();
			produit_vente.setORM_ProduitidProduit(produitidProduit);
			produit_vente.setORM_VenteidVente(venteidVente);
			
			return (Produit_vente) session.load(crud.Produit_vente.class, produit_vente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente getProduit_venteByORMID(PersistentSession session, crud.Produit produitidProduit, crud.Vente venteidVente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Produit_vente produit_vente = new crud.Produit_vente();
			produit_vente.setORM_ProduitidProduit(produitidProduit);
			produit_vente.setORM_VenteidVente(venteidVente);
			
			return (Produit_vente) session.get(crud.Produit_vente.class, produit_vente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit_vente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryProduit_vente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit_vente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryProduit_vente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente[] listProduit_venteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listProduit_venteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente[] listProduit_venteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listProduit_venteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProduit_vente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit_vente as Produit_vente");
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
	
	public static List queryProduit_vente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit_vente as Produit_vente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Produit_vente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente[] listProduit_venteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProduit_vente(session, condition, orderBy);
			return (Produit_vente[]) list.toArray(new Produit_vente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente[] listProduit_venteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProduit_vente(session, condition, orderBy, lockMode);
			return (Produit_vente[]) list.toArray(new Produit_vente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduit_venteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadProduit_venteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Produit_vente loadProduit_venteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Produit_vente[] produit_ventes = listProduit_venteByQuery(session, condition, orderBy);
		if (produit_ventes != null && produit_ventes.length > 0)
			return produit_ventes[0];
		else
			return null;
	}
	
	public static Produit_vente loadProduit_venteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Produit_vente[] produit_ventes = listProduit_venteByQuery(session, condition, orderBy, lockMode);
		if (produit_ventes != null && produit_ventes.length > 0)
			return produit_ventes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProduit_venteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateProduit_venteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProduit_venteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateProduit_venteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProduit_venteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit_vente as Produit_vente");
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
	
	public static java.util.Iterator iterateProduit_venteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Produit_vente as Produit_vente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Produit_vente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Produit_vente))
			return false;
		Produit_vente produit_vente = (Produit_vente)aObj;
		if (getProduitidProduit() == null) {
			if (produit_vente.getProduitidProduit() != null)
				return false;
		}
		else if (!getProduitidProduit().equals(produit_vente.getProduitidProduit()))
			return false;
		if (getVenteidVente() == null) {
			if (produit_vente.getVenteidVente() != null)
				return false;
		}
		else if (!getVenteidVente().equals(produit_vente.getVenteidVente()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getProduitidProduit() != null) {
			hashcode = hashcode + (int) getProduitidProduit().getORMID();
		}
		if (getVenteidVente() != null) {
			hashcode = hashcode + (int) getVenteidVente().getORMID();
		}
		return hashcode;
	}
	
	public static Produit_vente createProduit_vente() {
		return new crud.Produit_vente();
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
			crud.Produit produitidProduit = getProduitidProduit();
			if(getProduitidProduit() != null) {
				getProduitidProduit().produit_vente.remove(this);
			}
			setORM_ProduitidProduit(produitidProduit);
			
			crud.Vente venteidVente = getVenteidVente();
			if(getVenteidVente() != null) {
				getVenteidVente().produit_vente.remove(this);
			}
			setORM_VenteidVente(venteidVente);
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			crud.Produit produitidProduit = getProduitidProduit();
			if(getProduitidProduit() != null) {
				getProduitidProduit().produit_vente.remove(this);
			}
			setORM_ProduitidProduit(produitidProduit);
			
			crud.Vente venteidVente = getVenteidVente();
			if(getVenteidVente() != null) {
				getVenteidVente().produit_vente.remove(this);
			}
			setORM_VenteidVente(venteidVente);
			
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_PRODUIT_VENTE_PRODUITIDPRODUIT) {
			this.produitidProduit = (crud.Produit) owner;
		}
		
		else if (key == crud.ORMConstants.KEY_PRODUIT_VENTE_VENTEIDVENTE) {
			this.venteidVente = (crud.Vente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private crud.Produit produitidProduit;
	
	private int produitidProduitId;
	
	private void setProduitidProduitId(int value) {
		this.produitidProduitId = value;
	}
	
	public int getProduitidProduitId() {
		return produitidProduitId;
	}
	
	private crud.Vente venteidVente;
	
	private int venteidVenteId;
	
	private void setVenteidVenteId(int value) {
		this.venteidVenteId = value;
	}
	
	public int getVenteidVenteId() {
		return venteidVenteId;
	}
	
	private Integer nombre_article;
	
	private int prix_unitaire_de_vente_reel;
	
	public void setNombre_article(int value) {
		setNombre_article(new Integer(value));
	}
	
	public void setNombre_article(Integer value) {
		this.nombre_article = value;
	}
	
	public Integer getNombre_article() {
		return nombre_article;
	}
	
	public void setPrix_unitaire_de_vente_reel(int value) {
		this.prix_unitaire_de_vente_reel = value;
	}
	
	public int getPrix_unitaire_de_vente_reel() {
		return prix_unitaire_de_vente_reel;
	}
	
	public void setProduitidProduit(crud.Produit value) {
		if (produitidProduit != null) {
			produitidProduit.produit_vente.remove(this);
		}
		if (value != null) {
			value.produit_vente.add(this);
		}
	}
	
	public crud.Produit getProduitidProduit() {
		return produitidProduit;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_ProduitidProduit(crud.Produit value) {
		this.produitidProduit = value;
	}
	
	private crud.Produit getORM_ProduitidProduit() {
		return produitidProduit;
	}
	
	public void setVenteidVente(crud.Vente value) {
		if (venteidVente != null) {
			venteidVente.produit_vente.remove(this);
		}
		if (value != null) {
			value.produit_vente.add(this);
		}
	}
	
	public crud.Vente getVenteidVente() {
		return venteidVente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_VenteidVente(crud.Vente value) {
		this.venteidVente = value;
	}
	
	private crud.Vente getORM_VenteidVente() {
		return venteidVente;
	}
	
	public String toString() {
		return String.valueOf(((getProduitidProduit() == null) ? "" : String.valueOf(getProduitidProduit().getORMID())) + " " + ((getVenteidVente() == null) ? "" : String.valueOf(getVenteidVente().getORMID())));
	}
	
}
