package org.generation.fiesta.test;

import java.util.*;

import org.generation.fiesta.entity.*;

public class TestFiesta {

	public static void main(String[] args) { //public static void  es para la implementacion 
		Fiesta ruby = new FiestaXV(); // PARA IMPORATAR LA INTERFAZ
		Fiesta fer = new FiestaDespedidaSoltera(); // PARA IMPORATAR LA INTERFAZ
		Fiesta viernesCH18 = new FiestaTematica();
		
		List<Fiesta> organizadorFiesta = new ArrayList<Fiesta>();
		
		organizadorFiesta.add(ruby);
		organizadorFiesta.add(fer);
		organizadorFiesta.add(viernesCH18);

		
		organizadorFiesta.forEach(fiesta -> resumen(fiesta)); //aqui esta el metodo que hicimos y lo pasamos al metodo
		
	}
	//Vamos a interar cada una de las fiestas 
	public static void resumen (Fiesta fiesta) { //entre metodos de clases si se pueden llamar //pasamo este metodo a static
		System.out.println("=========================");
		System.out.println(fiesta.resumenFiesta());
	}

}
