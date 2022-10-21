package org.generation.entity;

public class Division {
	public double divisionByCero(int a) {
		double div =0;
		try {
			 div = a/0;
		} catch (ArithmeticException e) {
			System.out.println("Estoy en la exception ArrayStoreException");
			System.out.println(e.toString());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estoy en la exception ArrayIndexOutOfBoundsException");
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println("Estoy en la excepción Exception");
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		return div;	
	}
}
