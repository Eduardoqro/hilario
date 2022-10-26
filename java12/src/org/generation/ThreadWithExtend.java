package org.generation;

class MiHilo extends Thread{
	public MiHilo(String nombreHilo) {
		super(nombreHilo);	
	}
	@Override //Dentro de este metodo se realiza la sincronia
	public void run() {
		System.out.printf("Hilo iniciado: %s - ID %d", this.getName(),this.getId());//con ..tf utiliza la misma clase forma 
		
	}
	
}

public class ThreadWithExtend {
 public static void main(String[] args) {
	System.out.println("Multihilo con herencia");
	System.out.println("Númerico de ID del metodo main: "+Thread.currentThread().getId());
	System.out.println("Proceso 1");
	System.out.println("Proceso 2");
	System.out.println("Proceso 3");
	
	MiHilo hilo01 = new MiHilo("#1");
	MiHilo hilo02 = new MiHilo("#2");
	MiHilo hilo03 = new MiHilo("#3");
	
	hilo01.start();
	hilo02.start();
	hilo03.start();
	
}
}
