package com.mycompany.proyectoconmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {

    static Evento evento;
    static Usuario ejemplo;

    public EventoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        evento = new Evento();
        Usuario ejemplo = new Usuario("roberto", "12345");

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetColor() {
        System.out.println("getColor");
        //si el color es nulo el resultado es ninguno
        ColoresEventos expResult = evento.getColor();
        ColoresEventos result = ColoresEventos.Ninguno;
        assertEquals(expResult, result);

    }

    @Test
    public void testGetColor1() {
        System.out.println("getColor");
        //si el color esta inicializado devuelve el color asignado
        evento.setColor(ColoresEventos.Rojo);
        ColoresEventos expResult = evento.getColor();
        ColoresEventos result = ColoresEventos.Rojo;
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        Tiempo horaInicio = null;

        evento.setHoraInicio(horaInicio);
    }

    @Test(expected = NullPointerException.class)
    public void testSetHoraFin() {
        System.out.println("setHoraFin");
        Tiempo horaFin = null;

        evento.setHoraFin(horaFin);
    }

    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        evento.setTitulo(null);
        String expResult = null;
        String result = evento.getTitulo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");

        String expResult = null;
        String result = evento.getDescripcion();
        assertEquals(expResult, result);

    }

}
