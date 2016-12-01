package com.mycompany.proyectoconmaven;

import java.util.HashMap;

public enum Mes  {
       
    Enero(31),Febrero(28),Marzo(31),Abril(30),Mayo(31),
    Junio(30),Julio(31),Agosto(31),Septiembre(30),
    Octubre(31),Noviembre(30),Diciembre(31);

    private Mes(int dia) {
        this.dia = dia;
    }
   
    private final int dia;

    public int getDia() {
        return dia;
    }
}
