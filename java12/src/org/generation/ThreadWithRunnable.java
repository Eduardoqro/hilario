package org.generation;

class MyThread2  implements Runnable{ // se implementa el contracto Runnable (interfaz)

	private String name; //Donde seva guardar el nombre del hilo
	private long id;
	
	public MyThread2(String name) {
		this.name = name;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public long getId() { //Nos devuelve el hilo donde se ejecuta
		return this.id = Thread.currentThread().getId(); //Thread.currentThread().getId() esto devuelbe el id del hilo;
	}
	
	@Override
	public void run() {
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

public class ThreadWithRunnable { //Esta clase lo va a ejecutar y tiene el main para la implementacion 
	public static void main(String[] args) {
		Thread hilo01 = new Thread(new MyThread2("#1")); //instanciomos los objettos y lo asignamos a esta clase //y pasamos un instancia de la clase que creamos
		Thread hilo02 = new Thread(new MyThread2("#2"));
		Thread hilo03 = new Thread(new MyThread2("#3"));
		
		//para iniciar los hilos
		hilo01.start(); //Metodo start inicia run
		hilo02.start();
		hilo03.start();
	}

}