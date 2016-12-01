package com.mycompany.proyectoconmaven;

public class Fecha {

    private int dia;
    private Mes mes;
    private int año;

    public Fecha(int dia, Mes mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(int mes) throws ErrorDiaException {
        if (mes == 1) {
            this.mes = Mes.Enero;
        } else if (mes == 2) {
            this.mes = Mes.Febrero;
        } else if (mes == 3) {
            this.mes = Mes.Marzo;
        } else if (mes == 4) {
            this.mes = Mes.Abril;
        } else if (mes == 5) {
            this.mes = Mes.Mayo;
        } else if (mes == 6) {
            this.mes = Mes.Junio;
        } else if (mes == 7) {
            this.mes = Mes.Julio;
        } else if (mes == 8) {
            this.mes = Mes.Agosto;
        } else if (mes == 9) {
            this.mes = Mes.Septiembre;
        } else if (mes == 10) {
            this.mes = Mes.Octubre;
        } else if (mes == 11) {
            this.mes = Mes.Noviembre;
        } else if (mes == 12) {
            this.mes = Mes.Diciembre;
        } else {
            throw new ErrorDiaException();

        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
  @Override
    public String toString() {
        return mes + "/" + dia + "/" + año + " ";
    }
}
