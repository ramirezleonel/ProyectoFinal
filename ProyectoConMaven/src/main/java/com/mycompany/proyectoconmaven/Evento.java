package com.mycompany.proyectoconmaven;

import java.util.Map;
import java.util.Objects;

public class Evento {

    private String titulo;
    private String descripcion;
    private Fecha fechaIni;
    private Fecha fechaFin;
    private Tiempo horaInicio;
    private Tiempo horaFin;
    private ColoresEventos color;
    private Usuario invitado;

    public Usuario getInvitado() {
        return invitado;
    }

    public void setInvitado(Usuario invitado) {
      
        for (Usuario usuario : UsuarioController.getLista()) {
            if (usuario.getNombreDeUsuario()
                    .equalsIgnoreCase(invitado.getNombreDeUsuario())) {
                //la contraseña siempre será nula
                invitado.setContraseña(null);
                this.invitado = invitado;

            }

        }

    }

    public ColoresEventos getColor() {

        if (color == null) {

            color = ColoresEventos.Ninguno;
        }

        return color;
    }

    public void setColor(ColoresEventos color) {

        this.color = color;

    }

    public Tiempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tiempo horaInicio) {
        if (horaInicio != null) {
            this.horaInicio = horaInicio;
        } else {

            throw new NullPointerException("el campo hora es obligatorio,No puede estar vacio!!");
        }

    }

    public Tiempo getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Tiempo horaFin) {

        if (horaFin != null) {
            this.horaFin = horaFin;
        } else {
            throw new NullPointerException("el campo hora es obligatorio,No puede estar vacio!!");
        }

    }

    public Fecha getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Fecha fechaIni) {
        if (fechaIni.getMes() != null && fechaIni.getDia() != 0 && fechaIni.getAño() != 0) {

            this.fechaIni = new Fecha(fechaIni.getDia(), fechaIni.getMes(), fechaIni.getAño());
        } else {
            throw new NullPointerException("la fecha del evento es obligatorio,no puede estar vacio!!");
        }

    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        if (fechaFin.getMes() != null
                && fechaFin.getDia() != 0
                && fechaFin.getAño() != 0) {

            this.fechaFin = fechaFin;

        } else {
            throw new NullPointerException("la fecha del evento es obligatorio,no puede estar vacio!!");
        }

    }

    public Evento() {

    }

    public Evento(String nombre, String descripcion, Fecha fechaIni,
            Fecha fechaFin, Tiempo horaIni, Tiempo horaFin,Usuario invitado) {
        this.titulo = nombre;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.horaInicio = horaIni;
        this.horaFin = horaFin;
        this.invitado=invitado;
    }

    @Override
    public String toString() {
        return "Evento: " + "titulo: " + titulo + " descripcion: "
                + descripcion + " fechaIni: " + fechaIni + " fechaFin:"
                + fechaFin + "horainicio" + horaInicio + "hasta" + horaFin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.titulo);
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
        if (!Objects.equals(this.titulo, otroEvento.titulo)) {
            return false;
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        } else {
            throw new NullPointerException("el titulo del evento es obligatorio"
                    + ",no puede estar vacio!!");
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
