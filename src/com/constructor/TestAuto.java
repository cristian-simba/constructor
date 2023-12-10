package com.constructor;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Nissan", 2020, 2390.31);
		System.out.println("marca: " + auto1.getMarca());
		System.out.println("año: " + auto1.getAnio());
		System.out.println("precio: " + auto1.getPrecio());
	}

}
