package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item();
		Item item2 = new Item();
		
		item1.setNombre("Shampoo");
		item1.setProductosActuales(20);
		item1.vender(5);
		item1.devolver(2);
		
		item1.imprimir();
		System.out.println("--------------");
		
		item2.setProductosActuales(49);
		item2.vender(5);
		item2.devolver(2);
		
		item2.imprimir();
		
	}

}
