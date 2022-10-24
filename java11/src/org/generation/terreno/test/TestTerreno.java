package org.generation.terreno.test;

import java.util.ArrayList;
import java.util.List;

import org.generation.terreno.entity.Terreno;
import org.generation.terreno.entity.TerrenoBaldio;
import org.generation.terreno.entity.TerrenoConCasa;

public class TestTerreno {

	public static void main(String[] args) {
		/*
		No se puede instanciar Terreno, porque no es una clase abstracta
		Terreno miNavidad = new Terreno("Abuela", 20, 40, "La abuela");
		System.out.println(miNavidad);
		 */
		//Clase pardre-->Terreno, asi podmos estancioanlor con otras clases
		Terreno miNavidad =new TerrenoConCasa("Abuela",20,40,"La abuela");
		System.out.println(miNavidad);
		System.out.println(miNavidad.formaDeObtenerlo());
		System.out.println("================");
		Terreno peorEsNada = new TerrenoBaldio("Peor es Nada",40,80,"La suegra");
		System.out.println(peorEsNada);
		System.out.println(peorEsNada.formaDeObtenerlo());
		System.out.println("================");
		//clase hija TerrenoConCasa
		//peorEsNada = new TerrenoConCasa("Mi rancho",40,80, "Se le compre a Sergio");
		//System.out.println(peorEsNada.formaDeObtenerlo());
		
		List<Terreno> misPropiedades;
		misPropiedades = new ArrayList<Terreno>(); //Se hace referencia a la clase superior // la clase superior hereda a las hijas pero no arrebes
		misPropiedades.add(peorEsNada);
		misPropiedades.add(miNavidad);
		
		System.out.println("==Como obtuve mis propiedades====");
		misPropiedades.forEach(terreno -> System.out.println(terreno.formaDeObtenerlo())); //Se imprime dependiendo del objeto en curso //Este metodo toma varias formas//invoca peorEsNada y despues miNavidad
		
		
		
		
	}

}
