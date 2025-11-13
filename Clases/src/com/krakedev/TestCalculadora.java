package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		calcu=new Calculadora();
		
		resultadoSuma = calcu.sumar(5, 8);
		resultadoResta = calcu.restar(5,2);
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		resultadoDivision = calcu.dividir(10, 2);
		resultadoPromedio = calcu.promediar(10, 8, 9);
		
		System.out.println("Resultado Suma: " + resultadoSuma);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Multiplicacion: " + resultadoMultiplicacion);
		System.out.println("Resultado Division: " + resultadoDivision);
		System.out.println("Resultado Promedio: " + resultadoPromedio);
		calcu.mostrarResultado();
		
		
				
	}

}
