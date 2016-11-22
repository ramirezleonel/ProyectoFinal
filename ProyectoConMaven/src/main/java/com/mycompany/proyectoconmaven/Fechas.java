package com.mycompany.proyectoconmaven;

import java.util.List;

public class Fechas {
   private List<Meses> mes;

    public List<Meses> getMes() {
        return mes;
    }

    public void setMes(List<Meses> mes) {
        this.mes = mes;
    }

    public List<Dias> getDias() {
        return dias;
    }

    public void setDias(List<Dias> dias) {
        this.dias = dias;
    }

    public List<Integer> getAños() {
        return años;
    }

    public void setAños(List<Integer> años) {
        this.años = años;
    }
   private List<Dias> dias;
   private List<Integer> años;
    
}
