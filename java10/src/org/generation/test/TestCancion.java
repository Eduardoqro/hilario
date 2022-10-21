package org.generation.test;
//import org.generation.entity.Cancion;
import org.generation.entity.*;

public class TestCancion {

	public static void main(String[] args) {
		Cancion sapito = new Cancion("Sapito", "Complices","Infantil");
		Autor cristinaAboraio = new Autor("Crsitina", "Abaroa");
		sapito.addAutor(cristinaAboraio);
		//podemos hacer la instacion directamente si crear una variable//es necesario la variable si se usa en varios lugares pero en este caso solo es aqui
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		//sapito.duracion =3.50;//esto funciona pero no es lo correcto por que accedor directamente atributo// debe ser de foma pribada para encapsulacion
		sapito.setDuracion(3.50);
		System.out.println(sapito);
	}

}
