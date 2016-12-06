package com.mycompany.proyectoconmaven;

import java.util.List;

public interface IGestionDeCalendarios {

   // public List<Evento> crearEventos(Evento evento);

    public List<Evento> verEvento();

    public List<Evento> eliminarEvento(Evento evento);

    public List<Evento> editarEvento(Evento evento);

  

}
