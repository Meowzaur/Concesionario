package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import models.Usuario;

public class UsuarioDaoImpl extends CommonDaoImpl<Usuario> implements UsuarioDaoInt {
	// Session de la base de datos
	private Session session;

	/**
	 * Constructor usuario DAO
	 * 
	 * @param session Session de la base de datos
	 */
	public UsuarioDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	/**
	 * Devuelve los usuarios que tienen ese nombre en la base de datos
	 * 
	 * @param name Nombre de los usuarios que queremos obtener de la base de datos
	 * @return Usuarios que contienen ese nombre
	 */
	public List<Usuario> searchByNombre(final String nombre) {
		// Verificaci�n de sesi�n abierta
		if (!session.getTransaction().equals(TransactionStatus.ACTIVE)) {
			session.getTransaction().begin();
		}

		// Devuelve los clientes con ese nombre
		return session.createQuery("FROM Usuario WHERE nombre='" + nombre + "'").list();
	}

	/**
	 * Devuelve los usuarios que tienen ese primer apellido en la base de datos
	 * 
	 * @param firstLastName Primer apellido de los usuarios que queremos obtener de
	 *                      la base de datos
	 * @return usuarios que contienen ese firstLastName
	 */
	public List<Usuario> searchByApellidos(final String apellidos) {
		// Verificaci�n de sesi�n abierta
		if (!session.getTransaction().equals(TransactionStatus.ACTIVE)) {
			session.getTransaction().begin();
		}

		// Devuelve los clientes con ese nombre
		return session.createQuery("FROM Usuario WHERE apellidos='" + apellidos + "'").list();
	}
	
	
	public Usuario searchByDNI(final String DNI) {
		// Verificaci�n de sesi�n abierta
		if (!session.getTransaction().equals(TransactionStatus.ACTIVE)) {
			session.getTransaction().begin();
		}

		// Devuelve los clientes con ese nombre
		return (Usuario) session.createQuery("FROM Usuario WHERE nif='" + DNI + "'").uniqueResult();
	}
}
