package models;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String dni;
	private int telefono;
	private int numeroCuenta;
	private String direccion;

	public Cliente(String nombre, String apellidos, String dni, int telefono, int numeroCuenta, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.numeroCuenta = numeroCuenta;
		this.direccion = direccion;
	}

}
