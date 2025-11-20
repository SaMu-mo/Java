package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante("Juan");
		
		estudiante1.calificar(5);
		
		System.out.println("El resultado es igual a:" + estudiante1.getResultado());
	}

}
