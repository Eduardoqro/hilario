package org.generation;

import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relación de llave(key)-valor
		 * que forma una especie de tabla de datos 
		 */
		
		//Definimos un tipo de coleccion HashMap
		//		<key ,value>
		HashMap<Integer , String> amores=new HashMap<Integer, String>();
		
		//Agregamos valores a nuestra colección
		amores.put(20201011, "Legolas");
		amores.put(20211102, "Edward Cullen");
		amores.put(20220101, "Akane Tendo");
		amores.put(19980214, "Máximo Decimo Meridio");
		amores.put(19900324, "Maribel Guardia");
		amores.put(20060520, "Chayanne");
		amores.put(20220830, "Legolas"); //mientras la llave sea diferente se puede repetir el valor
		System.out.println(amores);
		System.out.println("==================");
		
		//Desplegamos el tamaño de la colección
		System.out.println("N. de amores= "+amores.size());
		System.out.println("==================");
		
		//Mostramos el amor de Chayanne
		//Es mucho mas facil encontrar los elementos con su llave --> es la ventaja de esta coleccion
		System.out.println("El gran gran amor= "+amores.get(20060520));
		System.out.println("==================");
		
		//Removemos un elemento de la colección.
		amores.remove(19900324);
		System.out.println(amores);
		System.out.println("==================");
		
		//Iteramos los elemetos de la colección
		for(int fechaAniversario: amores.keySet())
			System.out.println("El día "+ fechaAniversario+" conocí a "+amores.get(fechaAniversario));
		System.out.println("==================");
		
		//Iteramos solo los valores 
		for(String nombreAmor : amores.values())
			System.out.println("Una persona mas a mi colección: "+nombreAmor);
		System.out.println("==================");

		
		if(amores.containsValue("Chayanne"))
			System.out.println("Bailastes Tesoro"); //Imprime esto si lo encuetra

		//En la documentacion hay mas metodos y respuestas.


	}

}
