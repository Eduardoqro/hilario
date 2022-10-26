package org.generation.fiesta.entity;

public class FiestaDespedidaSoltera implements Fiesta{

	@Override
	public String invitar() {
		// TODO Auto-generated method stub
		return "Invitar a las que griten solteras";
	}

	@Override
	public String parquearseBotanas() {
		// TODO Auto-generated method stub
		return "Jicamas con Chamoy";
	}

	@Override
	public String comprarBedidas() {
		// TODO Auto-generated method stub
		return "Cockteles";
	}

	@Override
	public String terminarFiesta() {
		// TODO Auto-generated method stub
		return "¿Se puede terminar?";
	}
	
	//Se agrega un metodo
		@Override
		public final String resumenFiesta() { //se agregan final para que no puedan sobreescribir el metodo
			return String.format("Resumen: %n%s %n%s %n%s %n%s",
					this.invitar(),
					this.parquearseBotanas(),
					this.comprarBedidas(),
					this.terminarFiesta()
					);
		}

}
