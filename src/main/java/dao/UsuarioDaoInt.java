package dao;

import java.util.List;

import models.Usuario;

/**
 * Clase interfaz UsuarioDaoInt
 */
public interface UsuarioDaoInt extends CommonDaoInt<Usuario> {

	/**
	 * Devuelve los usuarios que tienen ese nombre en la base de datos
	 * 
	 * @param name Nombre de los usuarios que queremos obtener de la base de datos
	 * @return Usuarios que contienen ese nombre
	 */
	public List<Usuario> searchByNombre(final String nombre);

	/**
	 * Devuelve los usuarios que tienen ese primer apellido en la base de datos
	 * 
	 * @param firstLastName Primer apellido de los usuarios que queremos obtener de
	 *                      la base de datos
	 * @return usuarios que contienen ese firstLastName
	 */
	public List<Usuario> searchByApellidos(final String apellidos);

	public Usuario searchByDNI(final String DNI);

}
