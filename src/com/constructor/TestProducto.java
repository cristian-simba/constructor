package com.constructor;

public class TestProducto {
	public static void main(String[] args) {
		Producto productoA = new Producto("Paracetamol", "Pastilla para el dolor del cuerpo", 0.50, 20);
		System.out.println("nombre: " + productoA.getNombre());
		System.out.println("descripcion: " + productoA.getDescripcion());
		System.out.println("precio: " + productoA.getPrecio());
		System.out.println("stock Actual: " + productoA.getStockActual());
	}
}
