package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	public int lado1;
	public int lado2;
	public int lado3;
	
	
	public int calcularArea() {
		int area; 
		area = base*altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro; 
		perimetro = lado1+lado2+lado3;
		return perimetro;
	}
}
