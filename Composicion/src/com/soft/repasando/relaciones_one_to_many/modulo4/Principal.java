package com.soft.repasando.relaciones_one_to_many.modulo4;

public class Principal {

	public static void main(String[] args) {	
		
		
		
		Caja cajaGalletas = new Caja();
		cajaGalletas.addGalleta("Chocolate", 2000d);
		cajaGalletas.addGalleta("Milo", 3000d);
		cajaGalletas.addGalleta("Chocolate", 2000d);
		cajaGalletas.addGalleta("Milo", 3000d);
		
		System.out.println(cajaGalletas.totalGalletas());
		System.out.println("Precio total " + cajaGalletas.totalPrecio());
		
		
		
	}
	
}
