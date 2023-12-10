package com.constructor;

public class Auto {
	private String marca;
	private int anio;
	private double precio;
		
	public Auto(String marca, int anio, double precio) {
		super();
		this.marca = marca;
		this.anio = anio;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
