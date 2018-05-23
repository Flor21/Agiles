package com.UnitTestingNro;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
  private static App obj_prueba;
  
  @Test
    public void compararTest () {
	 
	 assertTrue ("El primer numero es menor que el segundo", obj_prueba.comparar( 78 ,9)); 
	 }
  
}
