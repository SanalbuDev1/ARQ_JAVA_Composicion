package com.soft.repasando.relaciones_one_to_many.modulo4;

public class Galleta {

	private String nombre;
	private Double precio;	
	
	public Galleta(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}	
	
	public Galleta() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Galleta [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
