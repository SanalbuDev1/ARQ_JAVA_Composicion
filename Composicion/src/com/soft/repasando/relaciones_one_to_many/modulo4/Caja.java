package com.soft.repasando.relaciones_one_to_many.modulo4;

import java.util.*;

public class Caja {

	// 1 a n
	private List<Galleta> galletas;

	public Caja() {
		this.galletas = new ArrayList<>();
	}
	
	public void addGalleta(String nombre, Double precio) {
		galletas.add(new Galleta(nombre,precio));
	}
	
	public int totalGalletas() {
		return galletas.size();
	}
	
	public double totalPrecio() {
		double contador = 2000;
		for(Galleta g: this.galletas) {
			contador += g.getPrecio();
		}
		return contador;		
	}

	@Override
	public String toString() {
		return "Caja [galletas=" + galletas + "]";
	}
	
	
	
	
}
