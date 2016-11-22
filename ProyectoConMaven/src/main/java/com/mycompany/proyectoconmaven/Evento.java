package com.mycompany.proyectoconmaven;

public class Evento {
  private String nombre;
  private String descripcion;
  private int fechaIni;
  private int fechaFin;

    public Evento() { 
        
    }

    public Evento(String nombre, String descripcion, int fechaIni, int fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Evento: " + "titulo: " + nombre + " descripcion: " 
                + descripcion + "/n fechaIni: " + fechaIni + "/n fechaFin:" +
                fechaFin + "/n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }
}
