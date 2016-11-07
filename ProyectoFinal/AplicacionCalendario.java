package ProyectoFinal;

import java.util.Scanner;

public class AplicacionCalendario {
    public static void main(String[] args) {
        Cuentas cuen=new Cuentas();
        
        VistaPrincipal vista = new VistaPrincipal();
        vista.mostrarVista();
        
        cuen.crearUsuario("nombre", "facundo");
        cuen.crearUsuario("facua", "fao");
        cuen.crearUsuario("dsadsa", "facun");
        cuen.crearUsuario("dsadsa", "facun");
        cuen.crearUsuario("leoramirez@gmail.com","prueba");
        cuen.verUsuarios();
        cuen.buscarUsuario("nombre", "facundo");
    }
    
}
