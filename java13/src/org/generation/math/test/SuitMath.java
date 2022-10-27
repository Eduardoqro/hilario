package org.generation.math.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Pruebas del maquete math")
@SelectClasses({TestSuma.class, TestResta.class})
public class SuitMath {

}
