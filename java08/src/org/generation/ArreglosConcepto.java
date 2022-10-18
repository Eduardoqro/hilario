package org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes[]
		 * Los corchetes pueden ir antes o despues de la variable
		 * int[] myArray; int myArray[];
		 * 
		 * Se debe asignar la cantidad de elementos que contendra el arreglo
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		//Recuerda los arrays son objetos
		int[] codigoColores = new int[3];
		String[] nombreColores = new String[3];
		//System.out.println(codigoColores); //numero hexadecimal es un gash y es referencia de la localidad de memoria donde se guarda el objeto
		//System.out.println(nombreColores);
		
		//Para accerder a un elemento , indicamos dentro del corchete
		//el indice del dato, el primer elemento es el indice 0.
		
		nombreColores[0] ="Azul";
		codigoColores[0]=0x0000ff; //RGB 0,0,255--> 00 00 ff (en hexadecimal)
		//System.out.println("El color fav de Caro es: "+nombreColores[0]);
		//System.out.println("Y su codigo RGB es "+codigoColores[0]);
		
		nombreColores[1]="Amarillo";
		codigoColores[1]=0xffff00;
		
		nombreColores[2]="Negro";
		codigoColores[2]=0x000000;
		
		//Iteramos los datos de un arreglo
		
		for (int i = 0; i < nombreColores.length; i++) {
			
			System.out.println("El color fav de Caro es: "+nombreColores[i]);
			System.out.println("Y su codigo RGB es "+Integer.toHexString(codigoColores[i]));
			
		}
		
		//nombreColores[3] = "Verde"; //Se creaa un error en el tiempo de ejecución //ya no entra en nuetro array definido
		
		//Otra forma de inicializar un arreglo
		String frutas[] = {"Naranja", "Uva","Papaya","Manzana"}; //ya se inicializa que es un arreglo de 4 elementos
		
		//Para crear una matriz , se indica con doble[]
		String pasteles[][]=new String[4][5]; //primero filas y despues columnas
		
		pasteles[0][1]= "Moka";
		//para accerder a la matriz
		for (int i = 0; i < pasteles.length; i++) {
			 for (int j = 0; j < pasteles[i].length; j++) {
				System.out.println("fila" +i+ "columna"+j+":"+pasteles[i][j]);
			}
		
		}

	}

}
