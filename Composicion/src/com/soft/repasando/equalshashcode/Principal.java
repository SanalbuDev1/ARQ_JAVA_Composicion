package com.soft.repasando.equalshashcode;

public class Principal {

	
	static public void main(String[] args) {
		Persona p = new Persona("Juan");
		Persona p1 = p;
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p==p1);
		
		
		Persona p2 = new Persona("Juan");
		Persona p3 =  new Persona("Juan");
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p2.equals(p3));
		System.out.println(p2==p3);
	}
	
}
