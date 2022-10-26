package org.generation.fiesta.entity;
/**
 * Una interfaz es una declaracion formal de un contrato en la cual los metodos no contiene implementación alguna, es similar a los metodos abstractos.
 * 
 * Una clase puede implementar muchas interfaces, aunque no tengan relación.
 * 
 * Las clases abstractas se debe utilizar para objetos que esten estrechamente relacionados, mientras que las interfaces son mas adecuadas para proporcionar una 
 * funcionalidad común a clases que no esten relacionados entre si.
 * 
 * Para los patrones de diseño se suelen utilizar interfaces.
 * @author eduar
 *
 */
//Es un contracto//Estan enfocados para utilizarlas en clases hijas que no tenga relacion
public interface Fiesta {
	
	/**
	 * Los metodos de una interfaz ya son de tipo public y abstract 
	 * 
	 * y los atributos son de tipo final.
	 */
	
	String invitar();
	String parquearseBotanas();
	String comprarBedidas();
	String terminarFiesta();
	String resumenFiesta();

}
