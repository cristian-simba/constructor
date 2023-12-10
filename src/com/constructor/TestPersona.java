package com.constructor;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona("David", 21, 1.23);
		System.out.println("nombre: "+ p.getNombre());
		System.out.println("edad: "+ p.getEdad());
		System.out.println("estatura: "+ p.getEstatura());
	}
}
