package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas p=new Personas("Samuel"); //1.Declaro la variable p tipo persona 
		Personas p2 = new Personas("Ana",20,1.75);
		//p=new Personas();//2.Instanciar a persona y lo referencio con p
		//3. Acceder a los atributos 
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());
		
		//4.Modificar los atributos
		p.setNombre("Samuel");
		p.setEdad(19);
		p.setEstatura(1.77);
		System.out.println("--------------------");
		//5.Combrobar Cambios
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());
		
		
		p2.setNombre("Joice");
				
		System.out.println("*********");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
		
	}

}
