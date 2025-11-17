package com.krakedev;

public class Cuadrado {
	public int lado1;
	public int lado2;
	public int lado3;
	public int lado4;
	
	
	public int calcularArea() {
		int area; 
		area = lado1*lado1;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro; 
		perimetro = lado1+lado2+lado3+lado4;
		return perimetro;
	}
}
