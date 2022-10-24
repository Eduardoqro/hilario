package org.generation.terreno.entity;

public abstract class Terreno { //la clase tiene que ser abstracta para poder utilizar el metodo abstracto //Una clase abstract no se puede instancias 
	private String nombreTerreno;
	private double largo;
	private double ancho;
	private String propietario;
	
	//Constructor --> Generado con Source
	public Terreno(String nombreTerreno, double largo, double ancho, String propietario) {
		super();
		this.nombreTerreno = nombreTerreno;
		this.largo = largo;
		this.ancho = ancho;
		this.propietario = propietario;
	}
	//Metodo abstracto
	/**
	 * Los metodos abstractos no tienen cuerpo, termina con punto y coma.
	 * 
	 * Debido a qu el metodo abstracto el padre no ha definido el comportamiento,
	 * se dice que la clase hija implementará el comportamiento, es decir, las subclases, son responsables de la implementacion.
	 * @return
	 */
	public abstract String formaDeObtenerlo(); //NO tien cuerpo porque es astracto
	
	//GET y SET
	public String getNombreTerreno() {
		return nombreTerreno;
	}

	public void setNombreTerreno(String nombreTerreno) {
		this.nombreTerreno = nombreTerreno;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Terreno [nombreTerreno=");
		builder.append(nombreTerreno);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", propietario=");
		builder.append(propietario);
		builder.append("]");
		return builder.toString();
	}

}
