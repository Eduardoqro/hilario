package org.generation;

import java.util.Scanner;
import java.util.InputMismatchException;
public class menu {

	public static void main(String[] args) {
		
		/**
		 * Ejercicio:
		 * 
		 *   * Comenzar con $10,000
     * 
     * Hacer un menú telefónico
     *  Opción 1: retirar dinero (restar la cantidad)
     *  Opción 2: hacer depósitos
     *              ¿Dónde deseo depositar?
     *              opción 1: cuenta de cheques (sumar la cantidad)
     *              opcion 2: tarjeta de crédito (restar la cantidad)
     *              opción 3: cuenta de terceros (restar la cantidad)
     *  Opción 3: estado de cuenta (indicar la cantidad)
     *  Opción 4: quejas (No te contestas y te cuesga la llamada)
     *  opción 7: hablar con un asesor
     *  Opción 9: salir del cajero
     *  Opción desconocida: indica el error y vuelve a preguntar,
     *                      Si se equivoca 3 veces seguidas, se cuelga la llamada.
     *  
     *  Indicar la cantidad final del cliente
		 */

		int inicio = 10000;
		int error=0;
		boolean salir= false;
		Scanner sn = new Scanner(System.in);
		while (!salir){
			System.out.println("=====Menu Telefonico=====");
			System.out.println("Escribe: 1 . Para retirar dinero ");
			System.out.println("Escribe: 2 . Hacer depósitos ");
			System.out.println("Escribe: 3 . Estado de cuenta");
			System.out.println("Escribe: 4 . Quejas");
			System.out.println("Escribe: 5 . Hablar con un asesor ");
			System.out.println("Escribe: 6 . Salir del cajero ");
			System.out.println("=========================");
			//int deposito= sn.nextInt();
			try {
				System.out.println("Escribe tu opcion: ");
				int opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Has selecionado la opcion 1");
					System.out.println("Cantidad a retirar");
					break;
				case 2:
					System.out.println("Has selecionado la opcion 2");
					System.out.println("=====Menu de Depositos=====");
					System.out.println("Escribe: 1 . Cuenta de cheques");
					System.out.println("Escribe: 2 . Tarjeta de crédito");
					System.out.println("Escribe: 3 . Cuenta de terceros");
					System.out.println("===========================");
					System.out.println("¿Donde desea depositar");
					int opcion2 =sn.nextInt();
						switch (opcion2) {
						case 1: 
							System.out.println("Cuenta de cheques");
							System.out.println("Ingresa la cantidad a depositar");
							int deposito= sn.nextInt();
							System.out.println("Cantidad depositada: " +deposito+ " Total en cuenta: "+(deposito + inicio));
							break;
						case 2:
							System.out.println("Tarjeta de crédito");
							System.out.println("Ingresa la cantidad a depositar");
							int deposito2= sn.nextInt();
							System.out.println("Cantidad depositada: " +deposito2+ " Total en cuenta: "+(inicio - deposito2));
							break;
						case 3:
							System.out.println("Cuenta de terceros ");
							System.out.println("Ingresa la cantidad a depositar");
							int deposito3= sn.nextInt();
							System.out.println("Cantidad depositada: " +deposito3+ " Total en cuenta: "+(inicio -deposito3));
							break;
						default:
							System.out.println("no a escogido ninguna opcion");
							break;
						}
					break;
				case 3:
					System.out.println("Has selecionado la opcion 3");
					System.out.println("Estado de cuenta "+inicio);
					break;
				case 4:
					System.out.println("Has selecionado la opcion 4");
					System.out.println("Su queja esta en proceso");
					break;
				case 5:
					System.out.println("Has selecionado la opcion 5");
					System.out.println("El asesor se esta comunicando");
					break;
				case 6: 
					System.out.println("Has selecionado la opcion 6");
					System.out.println("saliendo del cajero");
					break;
				default: 
					System.out.println("Solo hay de 1 al 6");
					break;
					}
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Debes insertar un número");
                sn.next();
			}
			
		}
	}
}
