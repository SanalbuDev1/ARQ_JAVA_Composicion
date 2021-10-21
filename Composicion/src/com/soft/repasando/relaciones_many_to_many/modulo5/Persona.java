package com.soft.repasando.relaciones_many_to_many.modulo5;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private List<Casa> casas;	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.casas = new ArrayList<Casa>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public boolean contains(Object o) {
		return casas.contains(o);
	}
	public boolean add(Casa e) {
		return casas.add(e);
	}
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		Persona p = (Persona) obj;
		return p.getNombre().equalsIgnoreCase(this.nombre);
		
	}
	
	
	
	
}
