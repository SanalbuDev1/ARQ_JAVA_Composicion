package com.soft.repasando.relaciones_one_to_one.modulo2.ejemplo2;

public class Sobre {

	private String color;
	private Galleta galleta;		
	
	public Sobre(String color, String sabor, Double precio) {
		super();
		this.color = color;
		this.galleta = new Galleta(sabor, precio+100);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}		

	public String getNombre() {
		return galleta.getNombre();
	}

	public void setNombre(String nombre) {
		galleta.setNombre(nombre);
	}	

	public Double getPrecio() {
		return galleta.getPrecio();
	}	

	@Override
	public String toString() {
		return "Sobre [color=" + color + ", galleta=" + galleta + "]";
	}

	
	
	
	
}
