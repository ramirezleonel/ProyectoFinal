package com.mycompany.proyectoconmaven;

import java.util.List;

public interface IGestionDeCalendarios {

   public List<Evento> crearEventos(Evento evento);

    public List<Evento> verEvento();

    public void eliminarEvento(Evento evento);

    public Evento buscarEventoNombre(String nombreEvento);

    public Evento buscarEventoFecha(Fechas fecha);

}
