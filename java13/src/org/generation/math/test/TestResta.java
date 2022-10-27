package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestResta {
	Resta resta;
	@BeforeEach // con esto se corre primero
	void inicializar() {
		resta = new Resta();
	}
	
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Resta de número positivos")//para idicar que error tenemos es display
	void  testrestaEnteros() {
		assertEquals(0,resta.restaEnteros(5, 5));// invocamos
	}
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Resta con un numero negativo")//para idicar que error tenemos es display
	void  testRestaUnNegativo() {
		assertEquals(-8,resta.restaEnteros(-5, 8));// invocamos
	} 
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	//@Disabled //desavilita esta prueba 
	@DisplayName("Resta con numero flotante")//para idicar que error tenemos es display
	void  testRestaFlotante() {
		assertEquals(0.1,(double)resta.restaEnteros(5.3F, 5.2F),0.01);// invocamos// el 0.01 es la delta
	}
	
	@Test //Funcion para hacer pruebas y ser importa del paquete test
	@DisplayName("Verifica si la resta es positiva")//para idicar que error tenemos es display
	void isPositive() {
		assertTrue(resta.restaEnteros(4, 3)>0);// invocamos
		// o  assertEquals(true,suma.sumaEnteros(3, 4)>0);
	} 
}
