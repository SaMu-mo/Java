package com.krakedev;

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
		
		
		c1.lado1 = 8;
		c1.lado2 = 8;
		c1.lado3 = 8;
		c1.lado4 = 8;
		
		c2.lado1 = 7;
		c2.lado2 = 7;
		c2.lado3 = 7;
		c2.lado4 = 7;
		
		c3.lado1 = 12;
		c3.lado2 = 12;
		c3.lado3 = 12;
		c3.lado4 = 12;
		
		
		
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
