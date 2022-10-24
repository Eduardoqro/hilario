package org.generation.tacos.entity;

import java.util.ArrayList;

public class Taco {
	private String nombreTaco;
	private String tipoTortilla;
	private ArrayList <String> proteina;
	private boolean tieneQueso;
	private double costo;
	private ArrayList <String>  condimentos;
	
	{
		this.nombreTaco ="Taco";
		this.tipoTortilla ="maiz";
		this.proteina =new ArrayList<String>();
		this.tieneQueso = false;
		this.costo =0;
		this.condimentos=new ArrayList<String>();
	}
	
	public Taco(String nombreTaco, String tipoTortilla) {
		this.nombreTaco = nombreTaco;
		this.tipoTortilla = tipoTortilla;
	}

	//Podemos generar los getter y setters con click derecho Source
	public String getTipoTortilla() {
		return tipoTortilla;
	}

	public void setTipoTortilla(String tipoTortilla) {
		this.tipoTortilla = tipoTortilla;
	}

	public ArrayList<String> getProteina() {
		return proteina;
	}

	public void setProteina(ArrayList<String> proteina) {
		this.proteina = proteina;
	}

	public boolean isTieneQueso() {
		return tieneQueso;
	}

	public void setTieneQueso(boolean tieneQueso) {
		this.tieneQueso = tieneQueso;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public ArrayList<String> getCondimentos() {
		return condimentos;
	}

	public void setCondimentos(ArrayList<String> condimentos) {
		this.condimentos = condimentos;
	}

	public String getNombreTaco() {
		return nombreTaco;
	}
	//Aqui termina los getters y setters
	
	public String oferta() {
		return "no exite oferta para este taco";
	}
	
	//Ejemplo de metodo sobrecargado //se vefirica el tipo de datos //No puede tener los mismos argumentos
	public String oferta(String tiempo) {
		return "No exite oferta por el dia de " +tiempo;
	}
	
	
	
	//Tambien se puede generar el String con Source
	/*
	@Override
	public String toString() {
		return "Taco [nombreTaco=" + nombreTaco + ", tipoTortilla=" + tipoTortilla + ", proteina=" + proteina
				+ ", tieneQueso=" + tieneQueso + ", costo=" + costo + ", condimentos=" + condimentos + "]";
	}
	*/
	@Override//esto es para herencia pero no se ocupa//se puede borrar//La herencia se usa para hereda
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taco [nombreTaco=");
		builder.append(nombreTaco);
		builder.append(", tipoTortilla=");
		builder.append(tipoTortilla);
		builder.append(", proteina=");
		builder.append(proteina);
		builder.append(", tieneQueso=");
		builder.append(tieneQueso);
		builder.append(", costo=");
		builder.append(costo);
		builder.append(", condimentos=");
		builder.append(condimentos);
		builder.append("]");
		return builder.toString();
	}
	
	
}
