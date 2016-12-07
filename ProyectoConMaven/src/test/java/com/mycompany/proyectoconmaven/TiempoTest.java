
package com.mycompany.proyectoconmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TiempoTest {

    static Tiempo tiempo;
    int hora;
    int min;

    public TiempoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass");
        tiempo = new Tiempo();

    }

    @AfterClass
    public static void tearDownClass() throws TiempoException {
       tiempo.setHora(0);
       tiempo.setMin(0);
    }

    

    @Test(expected = TiempoException.class)
    public void testSetMin1() throws TiempoException {
        System.out.println("setHora");
        min = 655;
        tiempo.setMin(min);

    }
      @Test(expected = TiempoException.class)
    public void testSetMin2() throws TiempoException {
        System.out.println("setHora");
        min = -23;
        tiempo.setMin(min);

    }

   
    @Test(expected = TiempoException.class)
    public void testSetHora1() throws TiempoException {
        System.out.println("setHora");
        hora = 25;
        tiempo.setHora(hora);

    }

    @Test(expected = TiempoException.class)
    public void testSetHora2() throws TiempoException {
        System.out.println("setHora");
        hora = -1;
        tiempo.setHora(hora);

    }
    /**
     * Test of getMin method, of class Tiempo.
     */
//    @Test
//    public void testGetMin() {
//        System.out.println("getMin");
//        Tiempo instance = new Tiempo();
//        int expResult = 0;
//        int result = instance.getMin();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setMin method, of class Tiempo.
     */
}
