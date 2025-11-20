package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		if(this.precio<0) {
		this.precio = precio * -1;
		}
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void calcularPrecioPromo(double precio,double descuento) {
		this.precio = precio - (descuento/100);
		System.out.println("EL PRECIO ES: " + this.precio);
		
	}
}
