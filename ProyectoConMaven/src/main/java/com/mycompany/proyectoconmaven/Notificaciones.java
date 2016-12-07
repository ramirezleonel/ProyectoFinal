package com.mycompany.proyectoconmaven;

public class Notificaciones {
    boolean estado;
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Notificaciones" + estado + "";
    }

    
}
