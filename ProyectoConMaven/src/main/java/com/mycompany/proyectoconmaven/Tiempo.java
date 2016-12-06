package com.mycompany.proyectoconmaven;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.IllegalFormatException;

public class Tiempo {

    private int hora;
    private int min;

    public Tiempo() {
    }

    public Tiempo(int hora, int min) {

        this.hora = hora;
        this.min = min;

    }

    public int getHora() {

        return hora;
    }

    public void setHora(int hora) throws TiempoException {
        if (hora <= 24 && hora >= 0) {
            try {
                this.hora = hora;
            } catch (Exception e) {
                System.out.println("error aritmetico");
            }

        } else {
            throw new TiempoException("error en la hora");
        }

    }

    public int getMin() {

        return min;
    }

    public void setMin(int min) throws TiempoException {
        if (min <= 60 && min >= 0) {
            this.min = min;
        } else {
            throw new TiempoException("error en el minuto fuera de rango");
        }

    }

    @Override
    public String toString() {
        return hora + ":" + min + "";
    }
}
