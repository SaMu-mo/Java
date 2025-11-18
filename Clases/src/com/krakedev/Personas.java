package com.krakedev;

public class Personas {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Personas(String nombre) {
		this.nombre = nombre;
		
	}
	public Personas(int edad) {
		this.edad = edad;
	
	}
	public Personas(double estatura) {
		this.estatura = estatura;
	
	}
	public Personas(String nombre, int edad, double estatura) {
		this.edad = edad;
		this.estatura= estatura;
		this.nombre=nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
}
