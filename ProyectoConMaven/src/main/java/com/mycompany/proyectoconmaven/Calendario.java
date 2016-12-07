package com.mycompany.proyectoconmaven;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Calendario implements IVistasEventos {

    protected List<Evento> listaEventos = new ArrayList<Evento>();
    protected Usuario invitado;
    protected Notificaciones estado;

    public Notificaciones getEstado() {
        return estado;
    }

    public void setEstado(Notificaciones estado) {
        this.estado = estado;
    }
    public Calendario() {
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {

        this.listaEventos = listaEventos;
    }

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

    @Override
    public List<Evento> verPorMes(Mes mes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Evento> verPorDia(int dia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Evento> verPor4Dias(int dias) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
