package com.mycompany.proyectoconmaven;

public class Calendario {

  private static Calendario calendario;

    private Calendario() {

    }

    public static Calendario getInstancia() {
        if (calendario == null) {
            calendario = new Calendario();
           
        }
        return calendario;
    }

  
    
}
