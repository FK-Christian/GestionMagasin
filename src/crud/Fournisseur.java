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

public class Fournisseur {
	public Fournisseur() {
	}
	
	public static Fournisseur loadFournisseurByORMID(int idfournisseur) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadFournisseurByORMID(session, idfournisseur);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur getFournisseurByORMID(int idfournisseur) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getFournisseurByORMID(session, idfournisseur);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByORMID(int idfournisseur, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadFournisseurByORMID(session, idfournisseur, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur getFournisseurByORMID(int idfournisseur, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getFournisseurByORMID(session, idfournisseur, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByORMID(PersistentSession session, int idfournisseur) throws PersistentException {
		try {
			return (Fournisseur) session.load(crud.Fournisseur.class, new Integer(idfournisseur));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur getFournisseurByORMID(PersistentSession session, int idfournisseur) throws PersistentException {
		try {
			return (Fournisseur) session.get(crud.Fournisseur.class, new Integer(idfournisseur));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByORMID(PersistentSession session, int idfournisseur, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fournisseur) session.load(crud.Fournisseur.class, new Integer(idfournisseur), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur getFournisseurByORMID(PersistentSession session, int idfournisseur, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fournisseur) session.get(crud.Fournisseur.class, new Integer(idfournisseur), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFournisseur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryFournisseur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFournisseur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryFournisseur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur[] listFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur[] listFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFournisseur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Fournisseur as Fournisseur");
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
	
	public static List queryFournisseur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Fournisseur as Fournisseur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fournisseur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFournisseur(session, condition, orderBy);
			return (Fournisseur[]) list.toArray(new Fournisseur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFournisseur(session, condition, orderBy, lockMode);
			return (Fournisseur[]) list.toArray(new Fournisseur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fournisseur[] fournisseurs = listFournisseurByQuery(session, condition, orderBy);
		if (fournisseurs != null && fournisseurs.length > 0)
			return fournisseurs[0];
		else
			return null;
	}
	
	public static Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fournisseur[] fournisseurs = listFournisseurByQuery(session, condition, orderBy, lockMode);
		if (fournisseurs != null && fournisseurs.length > 0)
			return fournisseurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Fournisseur as Fournisseur");
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
	
	public static java.util.Iterator iterateFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Fournisseur as Fournisseur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fournisseur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fournisseur createFournisseur() {
		return new crud.Fournisseur();
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
			if(getAddressidAddress() != null) {
				getAddressidAddress().fournisseur.remove(this);
			}
			
			crud.Produit[] lProduitidProduits = produitidProduit.toArray();
			for(int i = 0; i < lProduitidProduits.length; i++) {
				lProduitidProduits[i].fournisseuridfournisseur.remove(this);
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
			if(getAddressidAddress() != null) {
				getAddressidAddress().fournisseur.remove(this);
			}
			
			crud.Produit[] lProduitidProduits = produitidProduit.toArray();
			for(int i = 0; i < lProduitidProduits.length; i++) {
				lProduitidProduits[i].fournisseuridfournisseur.remove(this);
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
		if (key == crud.ORMConstants.KEY_FOURNISSEUR_PRODUITIDPRODUIT) {
			return ORM_produitidProduit;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_FOURNISSEUR_ADDRESSIDADDRESS) {
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
	
	private int idfournisseur;
	
	private String nom;
	
	private crud.Address addressidAddress;
	
	private java.util.Set ORM_produitidProduit = new java.util.HashSet();
	
	private void setIdfournisseur(int value) {
		this.idfournisseur = value;
	}
	
	public int getIdfournisseur() {
		return idfournisseur;
	}
	
	public int getORMID() {
		return getIdfournisseur();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setAddressidAddress(crud.Address value) {
		if (addressidAddress != null) {
			addressidAddress.fournisseur.remove(this);
		}
		if (value != null) {
			value.fournisseur.add(this);
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
	
	private void setORM_ProduitidProduit(java.util.Set value) {
		this.ORM_produitidProduit = value;
	}
	
	private java.util.Set getORM_ProduitidProduit() {
		return ORM_produitidProduit;
	}
	
	public final crud.ProduitSetCollection produitidProduit = new crud.ProduitSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_FOURNISSEUR_PRODUITIDPRODUIT, crud.ORMConstants.KEY_PRODUIT_FOURNISSEURIDFOURNISSEUR, crud.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdfournisseur());
	}
	
}
