package org.generation.entity;

public class Autor {
	//por default //Encapsulacion 
	private String nombre;
	private String apellido;
	private String nacionalidad;
	{
		this.nombre="";
		this.apellido="";
		this.nacionalidad="";
	}
	
	Autor(){
		
	}
	
	public Autor(String nombre, String apellido){ // haci tambien podemos obrigar a la persona en meter los datos
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Para poner el nombre completo
	public String nombreCompleto() {
		return this.nombre+" "+this.apellido;
	}

}
