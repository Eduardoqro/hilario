package org.generation;

class MiHilo extends Thread{ // es necesario la extencio Thread para multihilo
	public MiHilo(String nombreHilo) {
		super(nombreHilo);	
	}
	@Override //Dentro de este metodo se realiza la sincronia
	public void run() { //metodo run sobreescrito
		System.out.printf("%nHilo iniciado: %s - ID: %d", this.getName(),this.getId());//con ..tf utiliza la misma clase forma 
		
			try {
				for (int i = 0; i < 6; i++) {
				Thread.sleep(1000); //estamos suspendiendo el hilo por un tiempo//para este metodo necesita try/catch
				System.out.printf("%nEl %s cuenta %d " ,this.getName(),i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%nHilo finalizado: %s -ID: %d", this.getName(), this.getId());
		
		
	} 
	
}

public class ThreadWithExtend {
 public static void main(String[] args) {
	System.out.println("Multihilo con herencia");
	System.out.println("Númerico de ID del metodo main: "+Thread.currentThread().getId());
	/*
	System.out.println("Proceso 1");
	System.out.println("Proceso 2");
	System.out.println("Proceso 3");
	*/
	
	MiHilo hilo01 = new MiHilo("#1");
	MiHilo hilo02 = new MiHilo("#2");
	MiHilo hilo03 = new MiHilo("#3");
	
	hilo01.start();
	hilo02.start();
	hilo03.start();
	
}
}
