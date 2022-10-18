package org.generation;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ciclosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Sintaxis:
		 * 	while(condicion) instruccion;
		 * 
		 * while(condicion){
		 * 		instrucciones;
		 * 	}
		 */
		/*
		int contador=0;
		//boolean comerPan= true;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n¿Quieres comer pan (simon/nel)?");
		String respuesta = (sc.next()).toLowerCase();
		while (respuesta.equals("simon")) {
			System.out.println("Llevas comiendo" + ++contador+" panes");
			
			if(contador >6)System.out.println("Ya dejale a los demas");
			System.out.println("\n¿Quieres comer oan (simon/nell)? ");
			respuesta =(sc.next()).toLowerCase();
		}
		
		System.out.println("Termina la oferta");
		*/
		
		
		/*
		 * Sintaxis DO WHILE
		 * 
		 * do{
		 * } while(condición);
		 */
		/*
			int contador=0;
			Scanner sc= new Scanner(System.in);
			//String respuesta = (sc.next()).toLowerCase();
			String respuesta;
			do {
				System.out.println("Llevas comiendo "+ ++contador +" panes");
				if(contador>6) System.out.println("(Ya dejale a los demas)");
				System.out.print("\nQuieres comer pan?");
				respuesta = (sc.next()).toLowerCase();
			}while(respuesta.equals("simon"));
			System.out.println("Se termino la oferta");
			// break y continue
			boolean bandera = true;
			int niteraciones = 10;
			while(bandera) {
			System.out.println(niteraciones--);
			if(niteraciones == 5) break;
			}
		*/
			
			
	}
}




