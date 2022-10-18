package org.generation;

public class DatosInMutables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Eduardo";
		nombre = "Erick";
		String participante ="Eduardo";
		
		String personaCH18 = new String("Eduardo");
		
		if(participante.equals(personaCH18))//.equals() con conpara la referecnia no el contenido
			System.out.println("Es la misma persona");
		else
			System.out.println("La persona es diferente");
	}

}
// el operador == no se utiliza para comparar valores string