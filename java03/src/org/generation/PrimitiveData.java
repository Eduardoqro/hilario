package org.generation;

public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este es un comentario de linea
		/**
		 *Comentario de bloque
		 *En esta sesión veremos los datos primitivos que existen en Java 
		  */
		//La variable de tipo "byte" almacena valores de -128 al +127
		//Si pones 150 ya marca error
		byte datoTipoByte = 10;
		System.out.println("Tipo byte:" + datoTipoByte);
		
		//La varible tipo short almacena valores del -32,768 al +32.767
		//Si pones 32800 va marcar error
		short datoTipoShort=150;
		System.out.println("Short Max value:" +Short.MAX_VALUE); //Por medio del atributo podemos ver el numero maximo
		System.out.println("Short Max value:" +Short.MIN_VALUE); 
		
		//La variable de tipo int almacena , valores del -2^31 al (2^31-1), el -1 es por que se resta el 0
		System.out.println("Int Max value:" +Integer.MAX_VALUE);
		System.out.println("Int Max value:" +Integer.MIN_VALUE);
		
		//La varaible de tipo long almacena
		//valores de -2^63 al +(2^63-1)
		//9223372036854775807 va marcar error debido a que es un dato literal por defecto es INT
		long datoTipoLong =9223372036854775807L; //se agrega L al final para indicar que es un long
		System.out.println("Long Max values: "+Long.MAX_VALUE);
		System.out.println("Long Max values: "+Long.MIN_VALUE);
		//byte, short, int y long es para valores enteros, float y double son para valores de punto flotante.
		
		//La varaible de tipo float almacena valores de punto flotante de 32 bits.
		//con 2.58 ocurre el mismo caso de dato literal
		float datoTipoFloat=2.58f; //Se agrega f al final para convertirlo en dato float
		System.out.println("Float Max value:" +Float.MAX_VALUE);
		System.out.println("Float Min value:" +Float.MIN_VALUE);
		
		//La variable de tipo double almacena valores de punto flotante de 64 bits
		double datoTipoDouble=3.254;
		System.out.println("Double Max value: "+Double.MAX_VALUE);
		System.out.println("Double Min value:"+Double.MIN_VALUE);
		
		//La variable de tipo boolean solo puede contener el valor de true o false
		boolean datoTipoBoolean =true;
		
		//La variable de tipo char almacena un caracter el dato de tipo char es de 16 bits.
		char datoTipoChar='a'; // Solo acepta un caracter entre comillas  y puede ser espacio tambien
		System.out.println("");
		
		//Los datos de tipo String son considerados objetos // podiamos decir que string es un arreglo de char
		String datoTipoString ="Ya mero nos vamos a la conferencia";
		//Generalmente no se trabaja con valores string debido al peso que generan. Normalmente se trabaja con solo datos numericos
		
		//El valor null se puede establecer oara los objetos.
		
		//Las literales numericas se pueden separar por un guión bajo
		int miValor=120_101_252;
		double miValorDouble=12_254.34_22D; //El _ no se pone al principio o al final y el . no se pone antes de _ . //La D es por double
		
		//Representación de literales numéricas en hexadecimal 0x1a;
		int miValHex = 0x1a; //26 decimal
		System.out.println("Valor de 0x1a: "+miValHex);
		
		//Binarios 0b11010
		int miValBinary = 0b0001_1010;
		System.out.println("Valor de 0b0001_1010: "+ miValBinary);
		
		//Conversion de tipos
		byte coquita127ml = 100;
		int coca1LT = coquita127ml; //Int max 2147483647
		System.out.println("Cantidad de líquido en coca 1 litro: "+ coca1LT);
		
		coca1LT=256;  //Java no lo pone como error devido al ejemplo de la circuferencia
		coquita127ml=(byte) coca1LT; //esto es "cast", convertir un dato mayor que no puede contener la variable
		System.out.println("Cantidad de liquido de coquita 127ml: "+ coquita127ml);
		
		//int edadGato = 100; //300 se desborda 
		//byte edadMosca=(byte)edadGato; //poniendo de lado (tipodedato)realizamos la conversion
		//System.out.println("La variable despues del cast:" + edadMosca);
		
		/*
		 * Se usa camel case para la convención del nombre de variables
		 * Ejemplo:
		 * 		int datoAlmacenado
		 * 
		 * Para el nombre de las variables, podemos user dígitos o letras, también el signo de $ y _
		 * Ejemplo:
		 * 		int_miTiempoVida:
		 * 
		 * Se recomienda no usar $ y _ porque eso los usa Java. No se puede comenzar el nombre de la variable con número.
		 * Ejemplo:
		 * 		int 18amigos; ES INCORRECTO.
		 * 
		 * Para las variables que son constantes, se puede usar el nombre en mayusculas pero es otra combecioc no camelCase, es snakeCase. 
		 * Ejemplo:
		 * 		final int NUM_COHORTE =18;
		 * 
		 * Los operadores que pueden usar en java, los operadores solo son para compara con solo numeros, los de logical son solo para operadores
		 * booleanos (aqui no aplica lo de corto circuito)
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 */
		
		//Ejemplo de caso boolean:
		int edad=22;
		boolean bandera =true && false; //es valido
		bandera= edad>18 && edad<30; //es valido 
		//bandera edad && edad<30 // no es valido
		//bandera = edad>"18" && edad<30; //no es valido
		
		/*
		 *La conversión de strings númericos a númericos se realiza con las instrucciones parseInt, parseFloat y parseDouble.
		 */
		String edadString="22";
		edad = Integer.parseInt(edadString); //edadString solo va mandar error porque es un dato tipo string , con Integer.parseInt podemos hacer la conversion
		System.out.println("La edad promedio es de: " +edad);
		
		/**
		 *Los operadores lógicos && , || y ! se usan en valores boolanos. 
		 */
		int numMascotas = 2;
		boolean tieneMichis =true;
		boolean supMaxMascotas = numMascotas > 10 || tieneMichis!=false; //False 11 true = true
		System.out.println("Supera Max de Mascotas: "+supMaxMascotas);
		
		//Suponiendo que:
		
		boolean X=true;
		boolean Y= false;
		boolean Z=true;
		System.out.println("El resultado de x||y||x&&!z&&!y: "+(!X || !Y || Z && X && !Y));//primer hacemos lo negados de izq a der
		
		int a=8;
		int b=3;
		int c=-5;
		System.out.println("El resultado de x||y||x&&!z&&!y: "+( 2 * b + 3 * (a - c)));//primer hacemos lo negados de izq a der
		
		//Los datos primitivos no tienen propiedades , ni metodos por eseo se utilizan datos envolventes.
		
		// Integra
	}

}
