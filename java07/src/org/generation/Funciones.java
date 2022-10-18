package org.generation;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesMath operaciones =new OperacionesMath(); //aqui instanciamos la clase importando un objeto //operaciones es un objeto que se intancio
		operaciones.sumaEnterosSinRetorno(10, 50);
		
		int resultado = operaciones.sumaEnteros(50, 8);
		System.out.println("50+8= "+resultado); // con la varaible resultado
		
		
		//System.out.println("20+9= "+operaciones.sumaEnteros(20, 9)); // llamado directamente a la funcion si utilizar una varaible , se aplica esto cuando lo trabajamos una vez
		//System.out.println("Valor de PI*2= "+operaciones.piPorDos()); //Este no espera argumento
		
		
		//System.out.println("pi * 2 = "+OperacionesMath.piEntreDos()); //lo podemos llamar directamente sin tener que instanciarlo(crear una clase) //atravez de la clase //es mejor de esta forma en todo que sea tipo static
		//System.out.println("pi/2= "+ operaciones.piEntreDos());//atraves del objeto podemos acceder al metodo static
		//	NO se requiere instanciar la clase Math por se Static // Tiene que se static para poder utilizarlo si instanciarlo
		//Los siguiente no es posible se requiere instanciar la clase.
		//System.out.println("pi 2 2 = " OperacionesMath.piPorDos);
		
		
		
		//Con entrada de usuario
		
		EntradaUsuario entradaUsuario =new EntradaUsuario();
		while( entradaUsuario.entradaTeclado("¿Quieres continuar (s/n) ?") == 's' ) {
            System.out.println("====Estás dentro del ciclo while====");
        }
        System.out.println("Termina la ejecución");
	}

}
