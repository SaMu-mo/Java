package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto("Paracetamol");
		Producto productoB = new Producto("Tramadol");
		Producto productoC = new Producto("Vitamina C");
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Sin Receta");
		productoA.setPrecio(5.5);
		productoA.setStockActual(20);
		
		productoB.setNombre("Tramadol");
		productoB.setDescripcion("Con Receta");
		productoB.setPrecio(0.3);
		productoB.setStockActual(20);
		
		productoC.setNombre("Vitamina C");
		productoC.setDescripcion("Sin Receta");
		productoC.setPrecio(3.4);
		productoC.setStockActual(20);
		
		System.out.println(productoA.getNombre());
		System.out.println(productoA.getDescripcion());
		System.out.println(productoA.getPrecio());
		System.out.println(productoA.getStockActual());
		System.out.println("--------------");
		System.out.println(productoB.getNombre());
		System.out.println(productoB.getDescripcion());
		System.out.println(productoB.getPrecio());
		System.out.println(productoB.getStockActual());
		System.out.println("------------");
		System.out.println(productoC.getNombre());
		System.out.println(productoC.getDescripcion());
		System.out.println(productoC.getPrecio());
		System.out.println(productoC.getStockActual());
		System.out.println("--------------");
		

	}

}
