package com.soft.repasando.relacionesRecursividad.modulo6;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private List<Persona> amigos = new ArrayList<Persona>();
		
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	public boolean remove(Object o) {
		return amigos.remove(o);
	}
	public boolean contains(Object o) {
		return amigos.contains(o);
	}
	public boolean add(Persona e) {
		return amigos.add(e);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String listarAmigos() {
		String amigos = "";
		for(Persona p : this.amigos) {
			amigos = amigos.concat(" ").concat(""+p.getNombre());
		}
		return amigos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
