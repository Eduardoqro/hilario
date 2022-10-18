package org.generation;

import java.util.HashSet;

public class HashSetConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ordenada de elementos. // no nos debe importar como lo ordena
		 * NO se permite elementos duplicados
		 * Por lo que cualquier elementos duplicado no se insertará. //NO se inserta ese elemento duplicado
		 */
		
		//Definimos una colección HashSet
		HashSet<String> paises = new HashSet<String>(); //Este es el constructor  new HashSet<String(tipodedato)>() y es un metodo (recuerda que llevan parentecis)
		
		//Agregamos valores a la colección
		paises.add("México");
		paises.add("Alemania");
		paises.add("Yibuti");
		paises.add("Wakanda");
		paises.add("Yemen");
		paises.add("Genovia");
		paises.add("Alemania");//Elemento duplicado
		
		System.out.println(paises); //Recuerda que no debe importar como lo ordene
	
		//Desplegamos el tamaño de la coleccion
		System.out.println("N. de paises = " +paises.size());

		//Verificar si un elemento existe en la colección
		boolean paisExistente = paises.contains("Yibuti");
		System.out.println("Existe Yibute: "+paisExistente);
	
		//Remover un elemento
		paises.remove("Yibuti");
		System.out.println(paises);
		System.out.println("===================");
		//Iteramos la coleccion
		paises.forEach(pais ->System.out.println(pais));
		System.out.println("===================");
		
	}

}
