package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int area;
		double area2;
		r1.setBase(10); 
		r1.setAltura(5);
		
		r2.setLado1(8);
		r2.setLado2(8);
		r2.setLado3(8);
		
		
		
		
		area = r1.calcularArea();
		area2 = r2.calcularPerimetro();
	
		System.out.println("El area de r1 es: " + area);
		System.out.println("El area de r2 es: " + area2);
	}

}
