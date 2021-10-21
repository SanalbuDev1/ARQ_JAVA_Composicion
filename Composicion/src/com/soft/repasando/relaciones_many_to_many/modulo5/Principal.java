package com.soft.repasando.relaciones_many_to_many.modulo5;

public class Principal {

	public static void main(String[] args) {
		Casa c = new Casa("Santander");
		
		Persona p = new Persona("juan");
		Persona p2 = new Persona("ana");
		
		c.add(p);
		c.add(p2);
		
		System.out.println(c.contains(new Persona("Juan")));
		System.out.println(c.contains(new Persona("ana")));
		
		p.add(c);
		
		System.out.println(p.contains(new Casa("Santander")));
	}
	
}
