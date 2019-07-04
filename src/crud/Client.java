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

public class Client {
	public Client() {
	}
	
	public static Client loadClientByORMID(int idClient) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadClientByORMID(session, idClient);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client getClientByORMID(int idClient) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getClientByORMID(session, idClient);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByORMID(int idClient, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadClientByORMID(session, idClient, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client getClientByORMID(int idClient, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return getClientByORMID(session, idClient, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByORMID(PersistentSession session, int idClient) throws PersistentException {
		try {
			return (Client) session.load(crud.Client.class, new Integer(idClient));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client getClientByORMID(PersistentSession session, int idClient) throws PersistentException {
		try {
			return (Client) session.get(crud.Client.class, new Integer(idClient));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByORMID(PersistentSession session, int idClient, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Client) session.load(crud.Client.class, new Integer(idClient), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client getClientByORMID(PersistentSession session, int idClient, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Client) session.get(crud.Client.class, new Integer(idClient), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClient(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryClient(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClient(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return queryClient(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client[] listClientByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listClientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client[] listClientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return listClientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClient(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Client as Client");
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
	
	public static List queryClient(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Client as Client");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Client", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client[] listClientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClient(session, condition, orderBy);
			return (Client[]) list.toArray(new Client[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client[] listClientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClient(session, condition, orderBy, lockMode);
			return (Client[]) list.toArray(new Client[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadClientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return loadClientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client loadClientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Client[] clients = listClientByQuery(session, condition, orderBy);
		if (clients != null && clients.length > 0)
			return clients[0];
		else
			return null;
	}
	
	public static Client loadClientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Client[] clients = listClientByQuery(session, condition, orderBy, lockMode);
		if (clients != null && clients.length > 0)
			return clients[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClientByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateClientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = crud.GesMagPersistentManager.instance().getSession();
			return iterateClientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Client as Client");
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
	
	public static java.util.Iterator iterateClientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From crud.Client as Client");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Client", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Client createClient() {
		return new crud.Client();
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
				getAddressidAddress().client.remove(this);
			}
			
			crud.Vente[] lVentes = vente.toArray();
			for(int i = 0; i < lVentes.length; i++) {
				lVentes[i].setClientidClient(null);
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
				getAddressidAddress().client.remove(this);
			}
			
			crud.Vente[] lVentes = vente.toArray();
			for(int i = 0; i < lVentes.length; i++) {
				lVentes[i].setClientidClient(null);
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
		if (key == crud.ORMConstants.KEY_CLIENT_VENTE) {
			return ORM_vente;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == crud.ORMConstants.KEY_CLIENT_ADDRESSIDADDRESS) {
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
	
	private int idClient;
	
	private String nom;
	
	private String prenom;
	
	private crud.Address addressidAddress;
	
	private java.util.Set ORM_vente = new java.util.HashSet();
	
	private void setIdClient(int value) {
		this.idClient = value;
	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public int getORMID() {
		return getIdClient();
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
	
	public void setAddressidAddress(crud.Address value) {
		if (addressidAddress != null) {
			addressidAddress.client.remove(this);
		}
		if (value != null) {
			value.client.add(this);
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
	
	public final crud.VenteSetCollection vente = new crud.VenteSetCollection(this, _ormAdapter, crud.ORMConstants.KEY_CLIENT_VENTE, crud.ORMConstants.KEY_VENTE_CLIENTIDCLIENT, crud.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdClient());
	}
	
}
