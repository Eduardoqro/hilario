package org.generation;

import java.util.Scanner;

public class EntradaUsuario {
	Scanner sc = new Scanner(System.in); //Clase Scanner para ingresar datos
	
	/**
	 * Muestra la pregunta y espera la respuesta del usuario
	 * @param txtPregunta pregunta a mostra al usuario
	 * @return el primer caracter de la respuesta 
	 */
	char entradaTeclado(String txtPregunta) {
		System.out.print("\n"+txtPregunta);
		String respuesta = sc.next().toLowerCase();
		return respuesta.charAt(0); //"Respuesta".charAt(0)-->'R'
	}
}

//Una clase o metodo debe tener una responsabilidad unica no podemos mezclar con otras pero si se puede poner en OperacionesMath pero ya no seria especifico. 
