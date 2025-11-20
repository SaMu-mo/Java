package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(10,"Pastel","Chocolate",5.5);
		p1.setDescripcion("Vainilla");
		p1.setPeso(8.8);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getDescripcion());
		System.out.println(p1.getEntero());
		System.out.println(p1.getPeso());

	}

}
