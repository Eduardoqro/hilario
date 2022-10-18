package org.generation;

import java.util.ArrayList;

public class ArrayListConcepto {

	public static void main(String[] args) {
		/**
		 * Un List es una colección ordenada, en la que se
		 * permite elementos duplicados.
		 * Se basa en un array redimensionable que crece su tamaño
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis: 
		 * 		ArrayList<object> varName;		//utilizamos el valor envolvente del dato primitivo
		 */
		
		//Definimos una colección de tipo String
		ArrayList<String> isbn = new ArrayList<String>();
		ArrayList<String> nombresLibros = new ArrayList<String>();
		
		//Agregamos valores al arreglo
		nombresLibros.add("Matilda"); //indice 0 es el primer elemento
		nombresLibros.add("Harry Potter");
		nombresLibros.add("El túnel");
		nombresLibros.add("El último deseo");
		nombresLibros.add("Psicoanalista");
		nombresLibros.add("Quiúbole con...");
		System.out.println(nombresLibros);
		
		//Desplegamos el tamaño de la colección
		int size = nombresLibros.size();
		System.out.println("Total de libros: "+size);

		//Mosttamos solamente el libro El túnel
		String elTunelNombre = nombresLibros.get(2);
		System.out.println("Miros recomienda: "+elTunelNombre);
		
		//Removemos un elemento de la colección
		nombresLibros.remove(4);
		//Interar elementos en la colección
		for (int i = 0; i < nombresLibros.size(); i++) {  //es porque .size se utiliza en vez de leght porque es una coleccion no es un arreglo
			System.out.println("Mi regalo de navidad es: "+ nombresLibros.get(i)); //get es para el numero de indice
		}
		System.out.println("=======================");
		//Otra forma de interar con for avanzado
		for(String libro: nombresLibros)
			System.out.println("Libro:"+libro);
		
		//Cambiar o reemplazar un elemento de la colección
		nombresLibros.set(2, "El Túnel, versio tía de Miros");
		System.out.println("======================="); 

		//Interar la colección por forEach
		nombresLibros.forEach(libro ->System.out.println(libro)); //no es necesario poner el tipo de dato, si fuera mas de una instruccion ponemos las llaves
		 
		
	
	}

}
