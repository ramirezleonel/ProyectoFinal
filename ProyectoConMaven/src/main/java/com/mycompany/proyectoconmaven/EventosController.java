package com.mycompany.proyectoconmaven;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Eventos")
@RestController
public class EventosController implements IGestionDeCalendarios {

    private List<Evento> listaEventos = new ArrayList<Evento>();

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @RequestMapping(method = RequestMethod.GET)
    @Override
    public List<Evento> verEvento() {
      listaEventos.add(new Evento("nombre", "descripcion", new Fecha(02, Mes.Mayo, 2010), new Fecha(02, Mes.Mayo, 2011)));
        return listaEventos;
    }

    @RequestMapping(method = RequestMethod.POST)
    @Override
    public List<Evento> crearEventos(@RequestBody Evento evento) {
        listaEventos.add(new Evento("nombre", "descripcion", new Fecha(02, Mes.Mayo, 2010), new Fecha(02, Mes.Mayo, 2011)));
        return getListaEventos();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public List<Evento> eliminarEvento(@RequestBody Evento evento) {
        //elimina si la busqueda los nombres son iguales
        listaEventos.remove(evento);
        return listaEventos;
    }

    @Override
    public Evento buscarEventoNombre(String nombreEvento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento buscarEventoFecha(Fecha fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
