package com.soft.repasando.relaciones_one_to_one.modulo2;

public class Sobre {

	private String color;
	private Galleta galleta;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	

	public Galleta getGalleta() {
		return galleta;
	}

	public void setGalleta(Galleta galleta) {
		this.galleta = galleta;
	}

	@Override
	public String toString() {
		return "Sobre [color=" + color + ", galleta=" + galleta + "]";
	}

	
	
	
	
}
