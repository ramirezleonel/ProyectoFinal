package com.mycompany.proyectoconmaven;

public interface IGestionDeCalendarios {

    public Evento crearEventos();

    public void verEvento();

    public void eliminarEvento(String nombreEvento);

    public Evento buscarEvento(String nombreEvento);

    public Evento buscarEvento(Fechas fecha);

}
