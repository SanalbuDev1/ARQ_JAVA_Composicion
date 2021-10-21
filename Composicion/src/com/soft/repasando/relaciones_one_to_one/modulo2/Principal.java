package com.soft.repasando.relaciones_one_to_one.modulo2;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta();
		g1.setNombre("Choclate");
		g1.setPrecio(6500d);
		
		System.out.println(g1);
		
		Sobre s1 = new Sobre();
		s1.setColor("verde");
		s1.setGalleta(g1);
		
		System.out.println(s1);
		
	}
	
}
