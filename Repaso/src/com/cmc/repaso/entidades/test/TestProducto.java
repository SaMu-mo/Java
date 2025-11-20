package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto("Shampoo", 10);
		
		producto1.setPrecio(-3);
		producto1.calcularPrecioPromo(3,20);
		
		System.out.println(producto1.getPrecio());
		
		
	}

}
