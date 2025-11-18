package com.krakedev;

public class Producto {
	private String nombre;
	private int stockActual;
	private double precio;
	private String descripcion;
	
	
	public Producto(String nombre) {
		this.nombre = nombre;
		
	}
	public Producto(int stockActual) {
		this.stockActual = stockActual;
	
	}
	public Producto(double precio) {
		this.precio = precio;
	
	}
	public Producto(String nombre, int stockActual, double precio, String descripcion) {
		this.stockActual = stockActual;
		this.precio= precio;
		this.nombre=nombre;
		this.descripcion = descripcion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
