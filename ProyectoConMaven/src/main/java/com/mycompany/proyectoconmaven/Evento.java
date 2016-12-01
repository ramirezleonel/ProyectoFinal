package com.mycompany.proyectoconmaven;

import java.util.Map;
import java.util.Objects;

public class Evento {
  private String nombre;
  private String descripcion;
 private Fecha fechaIni;
  private Fecha fechaFin;
    public Fecha getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Fecha fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }
 

    public Evento() { 
        
    }

    public Evento(String nombre, String descripcion, Fecha fechaIni, Fecha fechaFin) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Evento otroEvento = (Evento) obj;
        if (!Objects.equals(this.nombre, otroEvento.nombre)) {
            return false;
        }
        return true;
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

  
}
