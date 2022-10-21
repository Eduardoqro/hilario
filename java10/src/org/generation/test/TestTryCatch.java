package org.generation.test;

import org.generation.entity.Division;

public class TestTryCatch {

	public static void main(String[] args) {

		/**
		 * Una excepción es una situación inesperada durante la ejecucipon de un programa.
		 * Existe dos tipos de excepciones.
		 * A) Checked Exceptions o Excepciones que se heredan de la clase Exceptions
		 * 	Las excepciones de este tipo se tiene qie declarar en la firma del método o bien usar los bloques try-catch.
		 * B) Unchecked Exceptions o Excepciones que se heredan de la clase RunTimeExceptions no se esta obligado a procesarlas.
		 * 	  Es opcional el uso de los bloques try-catch.
		 * Las excepciones de tipo Error, son arrojadas por la JVM. Estos errores de los qie no nos podemos recuperar.
		 * Por ejemplo: un desbordamiento en la memoria.
		 * 
		 * El stacktrace de una excepcion es el conjunto de mensajes de errpr desde rl origin del error hasat la ultima clase que recube el error.
		 */
		Division div =new Division();
		
		System.out.println("El resultado es: "+div.divisionByCero(5));
		System.out.println("Este es el fin del programa");
		
	}

}
