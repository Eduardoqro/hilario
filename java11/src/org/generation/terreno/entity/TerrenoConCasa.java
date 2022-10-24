package org.generation.terreno.entity;

public class TerrenoConCasa extends Terreno{

	public TerrenoConCasa(String nombreTerreno, double largo, double ancho, String propietario) {
		super(nombreTerreno, largo, ancho, propietario);
		// TODO Auto-generated constructor stub
	} // extends Terreno para la herencia

	@Override
	public String formaDeObtenerlo() {
		// TODO Auto-generated method stub
		return "Heredado en vida como regalo";
	}
	
	
}
