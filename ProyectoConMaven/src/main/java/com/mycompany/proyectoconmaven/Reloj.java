package com.mycompany.proyectoconmaven;

public class Reloj {

    private int[] hora = new int[25];
    private int[] min = new int[61];

    public int[] getHora() {
        return hora;
    }

    public void setHora(int[] hora) {
        this.hora = hora;
    }

    public int[] getMin() {
        return min;
    }

    public void setMin(int[] min) {
        this.min = min;
    }

    public void crearReloj2() {
        for (int i = 0; i < hora.length; i++) {
            hora[i] = i;
        }
        for (int i = 0; i < min.length; i++) {
            min[i] = i;
        }

    }

   

    @Override
    public String toString() {
        return hora + ":" + min;
    }
}
