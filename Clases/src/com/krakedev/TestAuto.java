package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		a1.marca = "Toyota";
		a1.anio = 2016;
		a1.precio = 16000.90;
		
		a2.marca = "Mazda";
		a2.anio = 2025;
		a2.precio = 20000.90;
		
		System.out.println(a1.marca);
		System.out.println(a1.anio);
		System.out.println(a1.precio);
		System.out.println("------------------");
		System.out.println(a2.marca);
		System.out.println(a2.anio);
		System.out.println(a2.precio);
	}

}
