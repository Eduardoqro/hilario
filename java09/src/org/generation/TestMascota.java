package org.generation;

public class TestMascota {

	public static void main(String[] args) {//Parametros de la funcion del metodo--> String[] argsb
		//aqui es variable y no atributo porque esta main (dentro de un metodo y todo lo que esta dentro de un metodo es una varible)
		
		/**Mascota hilario; //Este es el contenedor(hilario) de tipo Mascota //se declara la variable hilario de tipo Mascota(contenedor)
		hilario = new Mascota();//instanciomos la clase mascota//Aqui tiene vida//Tambien llamamos al metodo constructor//hilario tiene un id asignado
		
		hilario.name = "Hilario"; //estos serian los atributos
		*/
		//Mascota hilario = new Mascota("Hilario",1,30); //esta es la forma de recortar las anterios 3 codigos//nos podemos mas
		/*
		hilario.ageInYears = 1;
		hilario.SizeInCm = 30;
		*/
		//hilario.type = "Felino";
		
		//tambien al variable tipo var pero aqui no es necesario poner el tipo de dacto, se le acciona se forma automatica cuando le damos el valor a la varible," nos ahorra poner
		//de que tipo es" //como un comidin //NO podemos cambiar el tipo de dato
		//var edad =18;
		//var variableGenerica = new Mascota(); //tambien es valido hacer esto pero se pone en vez de var Mascota para poner el claro el tipo 
		
		//System.out.println("La mascota de Fer se llama: "+hilario.name);
		//System.out.println("===========================================");
	
		System.out.println("N. De mascotas: "+ Mascota.numPets);
		System.out.println("===========================================");
		Mascota hilario = new Mascota("Hilario",1,30);
		hilario.type = "Felino";
		Mascota periquita = new Mascota("Periquina",.5,6);
		System.out.println("===========================================");
		System.out.println("N. De mascotas: "+ Mascota.numPets);
		System.out.println("La mascota de Fer se llama: "+hilario.information());
		System.out.println("La mascota de Guadalupe se llama: "+periquita.information());

		System.out.println("===========================================");
		//para construtores 
		Mascota alf = new Mascota();//instancias pero sin datos de inicio
		System.out.println("Las casi mascota de Anahi es "+alf.information());
		System.out.println("N. De mascotas: "+ Mascota.numPets);
		System.out.println("===========================================");
		Mascota tommy =new Mascota("Tommy");
		System.out.println("Las mascota de Lalo es "+ tommy.information());
		System.out.println("N. De mascotas: "+ Mascota.numPets);
		
	}

}
