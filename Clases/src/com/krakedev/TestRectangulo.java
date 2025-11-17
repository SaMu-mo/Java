package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int area;
		double area2;
		r1.base = 10;
		r1.altura = 5;
		
		r2.lado1 = 8;
		r2.lado2 = 8;
		r2.lado3 = 8;
		
		
		
		area = r1.calcularArea();
		area2 = r2.calcularPerimetro();
	
		System.out.println("El area de r1 es: " + area);
		System.out.println("El area de r2 es: " + area2);
	}

}
