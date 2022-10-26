package org.generation.fiesta.entity;

public final class FiestaXV implements Fiesta, Vals { //implements Fiesta para interfaces // con final la clase no puede hereradar mas 
	
	private int numInvitados; //Modificador de instancia
	final static int EDAD_PERSONA =15; //Mayuscula para indicar que es constante// si es final sera de tipo static para dejarlo en la clase 

	@Override
	public String invitar() {
		// TODO Auto-generated method stub
		return "Se invita a la cahvisa de la secu";
	}

	@Override
	public String parquearseBotanas() {
		// TODO Auto-generated method stub
		return "Se arma de chetos y paketazos";
	}

	@Override
	public String comprarBedidas() {
		// TODO Auto-generated method stub
		return "Juguitos y aguas semilokas";
	}

	@Override
	public String terminarFiesta() {
		// TODO Auto-generated method stub
		return "Se llaman a los papás para que recogen a las bendis";
	}
	
	//Se agrega un metodo
	@Override
	public String resumenFiesta() { //Imprimir todos los metodos 
		return String.format("Resumen: %n%s %n%s %n%s %n%s %n%s %n%s %n%s ", 
				this.invitar(), 
				this.parquearseBotanas(),
				this.comprarBedidas(),
				this.escogerChambelanes(),
				this.escogerMusica(),
				this.seleccionarVestuarioVals(),				
				this.terminarFiesta()
				);
	}

	
	
	@Override
	public String escogerChambelanes() {
		// TODO Auto-generated method stub
		return "Se escogen alos chambelanes de los compis";
	}

	@Override
	public String escogerMusica() {
		// TODO Auto-generated method stub
		return "Se escoge la musica que suene en tiktok";
	}

	@Override
	public String seleccionarVestuarioVals() {
		// TODO Auto-generated method stub
		return "La quinceñera escoge el vestido para vals";
	}

}
