package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto("TOYOTA");
		Auto a2 = new Auto("MAZDA");
		
		a1.setMarca("Toyota");
		a1.setAnio(2016);
		a1.setPrecio(16000);
		
		a2.setMarca("Mazda");
		a2.setAnio(2025);
		a2.setPrecio(26000);
		
		System.out.println(a1.getMarca());
		System.out.println(a1.getAnio());
		System.out.println(a1.getPrecio());
		System.out.println("------------------");
		System.out.println(a2.getMarca());
		System.out.println(a2.getAnio());
		System.out.println(a2.getPrecio());
	}

}
