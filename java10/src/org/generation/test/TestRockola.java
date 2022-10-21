package org.generation.test;
import org.generation.entity.*;
/**
 * Hicimos una rockola, necesitamos una lista de canciones, una lista de autores con sus propiedades y despues una lista de autoress
 * @author eduar
 *
 */
public class TestRockola {

	public static void main(String[] args) {
		Rockola cantinera = new Rockola("La Cantinera");
		
		Cancion sapito = new Cancion("Sapito", "Complices","Infantil");
		//configuramos la cancion
		sapito.addAutor(new Autor("Cristina", "Abaroa"));
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		sapito.setDuracion(3.50);
		//Se agrega a la rockola
		//cantinera.setCanciones(sapito);
		
		//Otra Cancion
		Cancion boneless = new Cancion("Boneless","Dim Mark 20th Anniversary","Electrónica");
		boneless.addAutor(new Autor("Chris","Lake"));
		boneless.addAutor(new Autor ("Aid", "Vllasaliu"));
		boneless.setDuracion(2.60);
		
		//Otra Cancion
		Cancion orpheus = new Cancion("Orpheus","The dark and the light","rock");
		orpheus .addAutor(new Autor("Shawn","James"));
		orpheus .addAutor(new Autor ("Jimmy", "Messer"));
		orpheus .setDuracion(3.58);
		
		//Otra Cancion
		Cancion rosaPastel = new Cancion("Rosa Pastel","Dulce Beat","Pop");
		rosaPastel.addAutor(new Autor("Denisse","Guerrero"));
		rosaPastel.addAutor(new Autor ("Edgar", "Huerta"));
		rosaPastel.setDuracion(3.00);
		
		//Otra Cancion
		Cancion cadaQue = new Cancion("Cada Que","Fantasia Pop","Pop");
		rosaPastel.addAutor(new Autor("Denisse","Guerrero"));
		rosaPastel.addAutor(new Autor ("Edgar", "Huerta"));
		rosaPastel.setDuracion(3.00);
		
		cantinera.setCanciones(sapito);
		cantinera.setCanciones(boneless);
		cantinera.setCanciones(orpheus);
		cantinera.setCanciones(rosaPastel);
		cantinera.setCanciones(cadaQue);
		System.out.println(cantinera.listaCompletaCanciones()); //Mostrar la lista de canciones completar
		
		//Imprimir todas las canciones donde apreza "Denisse Guerrero"
		//Espero que aparezca la canción rosaPastel y cadaQue

	}

}
