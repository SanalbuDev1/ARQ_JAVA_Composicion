package com.soft.repasando.relacionesRecursividad.modulo6;

public class Principal {

	public static void main(String[] args) {
		
		Persona carlos = new Persona("Carlos");
		Persona gema = new Persona("gema");
		Persona kelly = new Persona("kelly");
		
		carlos.add(gema);
		carlos.add(kelly);
		
		System.out.println(carlos.contains(new Persona("gema")));
		
		System.out.println(carlos.listarAmigos());
		
	}
	
}
