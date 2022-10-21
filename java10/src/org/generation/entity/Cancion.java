package org.generation.entity;


import java.util.HashMap;

public class Cancion {
	//con private encapsulo mis atributos
	private String nombre;
	private String album;
	private String genero;
	private double duracion; 
	private HashMap<String,Autor> autores; //colecion clave valor //en autor va tener los datos de la clase autor//autor es una coleccion de autores//Para agregar autores
	
	{
		this.nombre="";
		this.album="";
		this.genero="";
		this.duracion=0;
		autores = new HashMap<String,Autor>();//intanciamos el hashmap
	}
	
	public Cancion(){
		
	}
	
	public Cancion(String nombre, String album, String genero){
		this.nombre = nombre;
		this.album = album;
		this.genero = genero;
		
	}
	
	//con set y get accedemos al atributo y leemos el atributo de un encapsulado
	public void setDuracion(double duracion) { //void para que no tenga retorno //establecer un nuevo dato al atributo//tambien nos sirve para modificar el valor con private
		this.duracion=duracion;
		
	}
	
	public double getDuracion() { //get para leer el dato del atributo
		return this.duracion;
	}
	
	public void addAutor(Autor autor) {
		autores.put(autor.nombreCompleto(), autor); //traemos datos de la otra clase para no poner dobles datos
	}
	
	//Para la rockola //solo para el nombre de la canciones
	public String getNombre() {
		return this.nombre;
	}
	
	
	
	//Para imprimir--> Generalmente se deja al final
	public String toString() {//Metodo to String y sin parametros//RECUERDA que los string son objetos inmutrables
		//return this.nombre+" " +this.album+ "etc";
		//Aqio construimos un solo string de todo esto:
		StringBuilder builder=new StringBuilder();//Instanciamos un objeto de tipo String //De esta forma es mutable y mejoramos el uso de memoria //sobre la misma localidad de memoria
		builder.append("Nombre: ");
		builder.append(this.nombre);
		builder.append(", \nAlbum:");
		builder.append(this.album);
		builder.append(", \nGenero:");
		builder.append(this.genero);
		builder.append(", \nDuración");
		builder.append(this.duracion);
		if(autores.size()>1)builder.append(",\nAutores:");
		else builder.append(", \nAutor:"); 
		for (Autor autor : autores.values()) {
			builder.append("\n\t");
			builder.append(autor.nombreCompleto());
		}
		return builder.toString();
	}
}
