package com.mycompany.proyectoconmaven;

import java.util.List;

public interface IVistasEventos {

    public List<Evento> verPorDia(int dia);

    public List<Evento> verPorMes(Mes mes);

    public List<Evento> verPor4Dias(int dias);
}
