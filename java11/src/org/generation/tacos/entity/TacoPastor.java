package org.generation.tacos.entity;
//extends Taco para hererdar la clase taco
public class TacoPastor extends Taco{
	boolean conPinia;
	int nivelAdobo;
	boolean esDeTrompo;
	
	//Generamos el constructor con Source
	public TacoPastor(String nombreTaco, String tipoTortilla, boolean conPinia, int nivelAdobo, boolean esDeTrompo) {
		//con super hago referencia a mi clase superior Taco
		super(nombreTaco, tipoTortilla); //Siempre tiene que ser super la primera linea
		this.conPinia = conPinia;
		this.nivelAdobo = nivelAdobo;
		this.esDeTrompo = esDeTrompo;
	}

	@Override//Es una notacion de java //Este metodo existe en la clase padre y lo estamos sobreescribiendo --> aplicamos polimorfismo
	public String toString() { //Este metodo esta SOBRE ESCRIBIENDO LOS METODOS cuando se tiene --> public String toString() de esta forma e igual en las otras
		StringBuilder builder = new StringBuilder();
		builder.append("TacoPastor [conPinia=");
		builder.append(conPinia);
		builder.append(", nivelAdobo=");
		builder.append(nivelAdobo);
		builder.append(", esDeTrompo=");
		builder.append(esDeTrompo);
		builder.append("]");
		builder.append(super.toString());//Para ser referencia a la clase padre tambien //Asi imprimios los atributos de la clase padre e hija
		return builder.toString();
	}
	@Override //Nos ayuda a ver que tambien tenga el nombre adecuado para sobreescribirlo correctamente//Recuerda que debe ser la misma firma(el mismo identificador, metodo y clase)
	public String oferta() { 
		return "Tacos al paster al 2x1";
	}
	@Override
	public String oferta(String tiempoOferta) { //la sobrecarga de metodos y realiza tambien sobreescritura
		return "Tacos al pastor al 2x1 el dia de" +tiempoOferta;
	}
	
	
}
