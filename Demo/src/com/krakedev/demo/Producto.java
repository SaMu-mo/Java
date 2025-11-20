package com.krakedev.demo;

public class Producto {
	private int entero;
	private String nombre;
	private String descripcion;
	private double peso;
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Producto (int entero, String nombre, String descripcion, double peso) {
		this.entero = entero;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		
	}
	
	
}
