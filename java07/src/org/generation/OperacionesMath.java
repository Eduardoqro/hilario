package org.generation;

public class OperacionesMath {
	/**
	 * Sintaxis de las funciones
	 * 
	 * <modificar de acceso> <tipoRetorno> nombreMetodo (<parametros>){
	 * 
	 * 		<cuerpo de la funcion instrucciones>
	 * 		instrucciones;
	 */
	
	/**
	 * Suma dos numeros enteros y envia el resultado en consola.
	 * @param a sumando 1
	 * @param b sumando 2
	 */
	void sumaEnterosSinRetorno( int a, int b) { // sino se agrega public por default es default pero no se escribe 
		System.out.println("La suma de "+a+" y " +b+" : "+(a+b));
	}
	
	/**
	 * Suma dos números enteros y retorna el resultado
	 * @param a sumando 1
	 * @param b sumando 2
	 * @return resultado de a + b
	 */
	 int sumaEnteros(int a, int b) {
		 sumaEnterosSinRetorno(a,b); //una funcion dentro otra funcion 
		return a+b; //realizamos un cast de tipo int (int)(a+b)
	 }
	 
	 /**
	  * Valor de PI por 2
	  * @return PI*2
	  */
	 double  piPorDos() {
		 return Math.PI*2; //la clase Math pertenece añ paquete lang porque es el paquete basico de java , por lo que no es necesario importarlo
	 }
	
	 /**
	  * Valor de PI entre 2
	  * @return PI/2
	  */
	 static double piEntreDos() {
		 return Math.PI/2;
	 }
}
