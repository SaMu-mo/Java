package com.krakedev.test;

import com.krakedev.Cuadrado;

public class testCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		int area;
		double area1;
		int area2;
		double area3;
		int area4;
		double area5;
		
		
		c1.setLado1(8);
		c1.setLado2(8);
		c1.setLado3(8);
		c1.setLado4(8);
		
		c2.setLado1(7);
		c2.setLado2(7);
		c2.setLado3(7);
		c2.setLado4(7);
		
		c3.setLado1(4);
		c3.setLado2(4);
		c3.setLado3(4);
		c3.setLado4(4);
		
		
		
		area = c1.calcularArea();
		area1 = c1.calcularPerimetro();
		area2 = c2.calcularArea();
		area3 = c2.calcularPerimetro();
		area4 = c3.calcularArea();
		area5 = c3.calcularPerimetro();
	
		System.out.println("El area de c1 es: " + area);
		System.out.println("El perimetro de c1 es: " + area1);
		System.out.println("-------------------------");
		System.out.println("El area de c2 es: " + area2);
		System.out.println("El perimetro de c2 es: " + area3);
		System.out.println("-------------------------");
		System.out.println("El area de c3 es: " + area4);
		System.out.println("El perimetro de c3 es: " + area5);
		System.out.println("-------------------------");
	}

}
