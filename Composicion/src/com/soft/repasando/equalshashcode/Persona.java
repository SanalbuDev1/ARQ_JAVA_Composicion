package com.soft.repasando.equalshashcode;

public class Persona {

	private String nombre;	

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public void andar() {
		System.out.println(getNombre() + " camina a 5km/h");
	}

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//devuelvo true en el caso que los nombre coincidan
		Persona nueva = (Persona) obj;
		return nueva.getNombre().equals(this.getNombre());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
	
	
}
