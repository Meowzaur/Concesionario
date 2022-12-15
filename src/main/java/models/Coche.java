package models;

import java.util.Date;

public class Coche {
	
	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	private String color; // Hacer enum?
	private double precio;
	private boolean vendido;
	private String estado;
	private int dias;
	private Date fechaEntrega;
	
	public Coche(int id, String matricula, String marca, String modelo, String color, double precio, boolean vendido,
			String estado, int dias, Date fechaEntrega) {
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.vendido = vendido;
		this.estado = estado;
		this.dias = dias;
		this.fechaEntrega = fechaEntrega;
	}

}
