package org.generation;
/**
 * Hacer una clase de lo que gusten y hacer las pruebas de esa clase
 * Debe tener como mínimo:
 *  - 3 atributos de instancia.
 *  - 1 atributo de clase.
 *  - 2 constructores.
 *  - 2 métodos.
 *  
 * Pruebas:
 * - Creación de 3 objetos.
 * - Imprimir los datos completos (atributos de instancia).
 * - Llevar la contabilidad de los objetos creados.
 * Terminamos a las 12
 */
public class Tacos {
	//Inicializacion de atributos
	String name;
	String cantidadDeSalsa;
	int numeroDeTacos;
	boolean conCebolla;
	
	//Atributos de clase
	static int numTacos; //contador de tacos

	//Bloque de inicializacion
	{ 
		this.name="Surtido"; 
		this.cantidadDeSalsa="poca";
		this.numeroDeTacos=3;
		this.conCebolla=false;
		numTacos++;  
	}
	//bloque de inicializacion estatico
	static { 
		numTacos=0;
	}

	//Metodos constructores
	Tacos(String name, String cantidadDeSalsa , int numeroDeTacos,boolean conCebolla){ // tambien se ponen parametos de entrada (..) si lo requiere
		this.name=name;
		this.cantidadDeSalsa = cantidadDeSalsa;
		this.numeroDeTacos=numeroDeTacos;
		this.conCebolla= conCebolla;
		System.out.println("Se crea un objeto de tipo Tacos");
	}
	//Metodos constructores vacio
	Tacos(){
		//Orden por Default
	}
	//OTRO METODO SOBRECARGADO
	Tacos(String name,int numeroDeTacos ){
				//this.name="super"+name;
				this();//HACI podemos llamar a otro constructor y solo los construcores pueden invocar un solo constructor//Este es el cosntructor vacio
				this.name=name;
				this.numeroDeTacos=numeroDeTacos;
	} 
	//Métodos de la clase 1
	String orden() {
		return 
				"Tipo de taco: " +this.name+
				" ,cantidad de salsa: "+this.cantidadDeSalsa+
				" , numero de tacos: "+this.numeroDeTacos+
				" ,con cebolla(true/false): "+this.conCebolla;
				
	} 
	//Métodos de la clase 2 //para constructor vacio
		String ordenPorDefault() {
			return 
					"Tipo de taco: " +this.name+
					" ,cantidad de salsa: "+this.cantidadDeSalsa+
					" , numero de tacos: "+this.numeroDeTacos+
					" ,con cebolla(true/false): "+this.conCebolla;
		}
	
}
