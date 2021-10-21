package com.soft.repasando.relaciones_many_to_many.modulo5;

import java.util.*;

public class Casa {

	private String color;
	private List<Persona> persona;	
	
	public Casa(String color) {
		super();
		this.color = color;
		this.persona = new ArrayList<>();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean add(Persona e) {
		return persona.add(e);
	}

	public boolean contains(Object o) {
		return persona.contains(o);
	}
	
	public int totalPersonas() {
		return this.persona.size();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Casa other = (Casa) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
