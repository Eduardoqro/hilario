package org.generation;

public class TestTacos {

	public static void main(String[] args) {
		System.out.println("===========================================");
		Tacos pastor =new Tacos("Pastor","mucha",10,true);
		System.out.println("El menu es "+ pastor.orden());
		System.out.println("N. De orden: "+ Tacos.numTacos);
		System.out.println("===========================================");
		Tacos bistec =new Tacos("Bistec",5);
		System.out.println("El menu es "+ bistec.orden());
		System.out.println("N. De orden: "+ Tacos.numTacos);
		System.out.println("===========================================");
		Tacos surtido =new Tacos();
		System.out.println("El menu es "+ surtido.ordenPorDefault() );
		System.out.println("N. De orden: "+ Tacos.numTacos);
	}

}
