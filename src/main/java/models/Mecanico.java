package models;

public class Mecanico {

	private String nombre;
	private String apellidos;
	private String dni;
	private int telefono;
	private int numeroCuenta;
	private String direccion;
	private boolean esJefe;
	private String especialidades;

	public Mecanico(String nombre, String apellidos, String dni, int telefono, int numeroCuenta, String direccion,
			boolean esJefe, String especialidades) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.numeroCuenta = numeroCuenta;
		this.direccion = direccion;
		this.esJefe = esJefe;
		this.especialidades = especialidades;
	}

}
