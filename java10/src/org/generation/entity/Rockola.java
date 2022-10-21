package org.generation.entity;

import java.util.HashMap;

public class Rockola {
	private int idCancion; //Ya es parte de la instancio (de la rockola)
	private String nombre;
	private int creditosDisponibles;
	private HashMap<Integer,Cancion> canciones ; //String es la clave y valor cancion//cambio  Integer para tener el id en la rockola

	{
		this.idCancion=0;
		this.nombre ="";
		this.creditosDisponibles=0;
		this.canciones= new HashMap<Integer,Cancion>();
	}
	/**
	static {
		id=0;
	}
	*/
	
	public Rockola(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCanciones(Cancion cancion) {
		canciones.put(++idCancion, cancion);
	}
	
	public HashMap<Integer, Cancion> getCanciones(){ //Regresa toda lo colecion 
		return canciones;
	}
	
	//Para entregar la lista de canciones
	public String listaCompletaCanciones() {
		StringBuilder builder = new StringBuilder();
		for(int idCancion : canciones.keySet()) 
			//builder.append("\n\t"); //1: Sapito (3.50)
			builder.append(String.format("%n%03d:%n%s", idCancion, canciones.get(idCancion))); //Se retorna el objeto %s es para valor string
		return builder.toString(); //Retorno de tipo String
	}
}
