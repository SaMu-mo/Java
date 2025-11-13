package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2 ) {
		int resultado;//declaro la variable 
		resultado= valor1+valor2;
		return resultado;
	}
	
	public int restar(int valor1, int valor2) {
		int resultado;
		resultado = valor1-valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2 ) {
		double resultado;//declaro la variable 
		resultado= valor1*valor2;
		return resultado;
	}
	
	public double dividir(double valor1, double valor2 ) {
		double resultado;//declaro la variable 
		resultado= valor1/valor2;
		return resultado;
	}
	
	public double promediar(double valor1, double valor2, double valor3 ) {
		double resultado;//declaro la variable 
		resultado= (valor1+valor2+valor2)/3;
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no Joven, sali al almuerzo. Regreso en 15 minutos");
	}

	
}
