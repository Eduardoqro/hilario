package org.generation.tacos.test;

import org.generation.tacos.entity.Taco;
import org.generation.tacos.entity.TacoPastor;

public class TestTaco {

	public static void main(String[] args) {
		Taco tacoGenerico = new Taco("Taco Genérico","Maíz");
		System.out.println(tacoGenerico); //Asi solo imprime el paquete y el identificador
		System.out.println("====================");
		
		TacoPastor tacoPastor = new TacoPastor("Taco Pastor", "Maíz-Pequeño", false, 3, true);
		System.out.println(tacoPastor);//Solo muestra los atributos de la clase padre
		System.out.println("====================");
		System.out.println("Oferta taco paster:"+ tacoPastor.oferta()); //Llamamos al metodo oferta de tacosPastor//Es la clase sin parametros
		System.out.println("Oferta taco paster:"+ tacoPastor.oferta("hoy"));//Con el argumento de tipo String y lo busca en su herencia
	}

}
