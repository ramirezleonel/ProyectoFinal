package com.mycompany.proyectoconmaven;

public class Fecha {

    private int dia;
    private Mes mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, Mes mes, int año) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws ErrorDiaException {

        if (dia <= 0||dia>=31) {
            throw new ErrorDiaException();

        } else {
            this.dia = dia;
        }

    }

    public Mes getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) throws ErrorAñoException {
        if (año <= 0 || año >= 4000) {
            throw new ErrorAñoException();
        } else {
            this.año = año;
        }

    }

    @Override
    public String toString() {
        return mes + "/" + dia + "/" + año + " ";
    }
}
