package org.generation.fiesta.test;

class Automovil{ //clase abuelo
	{	//INICIALIZACION DE INSTANCIA
		System.out.println("D");
		
	}
	public Automovil(){
		System.out.println("E");
		
	}
}

class Sedan extends Automovil{ //clase padre
	static {
		//inicializacion de clase
		System.out.println("A");
	}
	
	//Metodo constructor
	public Sedan() {
		System.out.println("G");
	}
	{
		System.out.println("F");
	}
	static {
		System.out.println("B");
	}
}






public class Vocho  extends Sedan{
	public static void main(String[] args) {
		System.out.println("C");
		new Vocho();
		System.out.println("H");
		/**
		 * Imprimir en consola , en los lugares de system.out.println
		 * la secuencia :
		 * A
		 * B
		 * C
		 * D
		 * E
		 * F
		 * G
		 * H
		 */
	}
}

