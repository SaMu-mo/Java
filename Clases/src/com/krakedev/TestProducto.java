package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Sin Receta";
		productoA.precio = 5.5;
		productoA.stockActual = 20;
		
		productoB.nombre = "Tramadol";
		productoB.descripcion = "Con Receta";
		productoB.precio = 0.30;
		productoB.stockActual = 50;
		
		productoC.nombre = "Vitamina C";
		productoC.descripcion = "Sin Receta";
		productoC.precio = 3.4;
		productoC.stockActual = 100;
		
		System.out.println(productoA.nombre);
		System.out.println(productoA.descripcion);
		System.out.println(productoA.precio);
		System.out.println(productoA.stockActual);
		System.out.println("--------------");
		System.out.println(productoB.nombre);
		System.out.println(productoB.descripcion);
		System.out.println(productoB.precio);
		System.out.println(productoB.stockActual);
		System.out.println("--------------");
		System.out.println(productoC.nombre);
		System.out.println(productoC.descripcion);
		System.out.println(productoC.precio);
		System.out.println(productoC.stockActual);
		System.out.println("--------------");
		

	}

}
