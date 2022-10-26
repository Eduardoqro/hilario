package org.generation.fiesta.entity;

public class FiestaTematica extends FiestaDespedidaSoltera{
	//para sobreescribir 
	@Override
	public String comprarBedidas(){
		return "Se dan bebidas sorpresas y de bromas";
	}
	
	//No se puede sobreescribir este metodo, porque la clase padre lo tienen definida coo final.
	/**
	 * @Override
	 * public String resumenFiesta(){
	 * 	return null;
	 * }
	 */

}
