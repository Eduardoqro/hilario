package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSuma {
	Suma suma;
	@BeforeEach // con esto se corre primero
	void inicializar() {
		suma = new Suma();
	}
	
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Sumatoria de número positivos")//para idicar que error tenemos es display
	void  testSumaEnteros() {
		assertEquals(10,suma.sumaEnteros(5, 5));// invocamos
	}
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Sumatoria con un numero negativo")//para idicar que error tenemos es display
	void  testSumaUnNegativo() {
		assertEquals(8,suma.sumaEnteros(-5, 8));// invocamos
	} 
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	//@Disabled //desavilita esta prueba 
	@DisplayName("Sumatoria con numero flotante")//para idicar que error tenemos es display
	void  testSumaFlotante() {
		assertEquals(10.5,(double)suma.sumaEnteros(5.3F, 5.2F),0.01);// invocamos// el 0.01 es la delta
	}
	
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Verifica si la sumatoria es positiva")//para idicar que error tenemos es display
	void isPositive() {
		assertTrue(suma.sumaEnteros(3, 4)>0);// invocamos
		// o  assertEquals(true,suma.sumaEnteros(3, 4)>0);
	} 
}
