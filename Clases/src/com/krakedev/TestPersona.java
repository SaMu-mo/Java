package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas p; //1.Declaro la variable p tipo persona 
		Personas p2 = new Personas();
		p=new Personas();//2.Instanciar a persona y lo referencio con p
		//3. Acceder a los atributos 
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);
		
		//4.Modificar los atributos
		p.nombre = "Samuel";
		p.edad = 19;
		p.estatura = 1.76;
		System.out.println("--------------------");
		//5.Combrobar Cambios
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);
		
		
		p2.nombre = "Joice";
				
		System.out.println("*********");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
		
	}

}
