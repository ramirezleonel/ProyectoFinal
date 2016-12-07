package com.mycompany.proyectoconmaven;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FechaTest {

    static Fecha fecha;

    public FechaTest() {

    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass");
        fecha = new Fecha();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test(expected = ErrorDiaException.class)
    public void testSetDia() throws ErrorDiaException {
        System.out.println("setDia");
        int dia = 0;

        fecha.setDia(dia);
        
    }
 @Test(expected = ErrorDiaException.class)
    public void testSetDia1() throws ErrorDiaException {
        System.out.println("setDia1");
        int dia = -1;

        fecha.setDia(dia);
        
    }
     @Test(expected = ErrorDiaException.class)
    public void testSetDia2() throws ErrorDiaException {
        System.out.println("setDia2");
        int dia = 31;

        fecha.setDia(dia);
        
    }
   
 
   


    @Test(expected = ErrorAñoException.class)
    public void testSetAño() throws Exception {
        System.out.println("setAño");
        int año = 0;

        fecha.setAño(año);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test(expected = ErrorAñoException.class)
    public void testSetAño1() throws Exception {
        System.out.println("setAño");
        int año = 4003;

        fecha.setAño(año);
       
    }



}
