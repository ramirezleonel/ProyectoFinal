package com.mycompany.proyectoconmaven;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Eventos")
@RestController
public class EventosController extends Calendario implements IGestionDeCalendarios {

    Evento ejemploEvento = new Evento("Ejemplo", "descripcion",
            new Fecha(3, Mes.Mayo, 2013), new Fecha(5, Mes.Mayo, 2014),
            new Tiempo(2, 31), new Tiempo(3, 21), new Usuario("roberto", "fabricio"));

    @RequestMapping(method = RequestMethod.GET)
    @Override
    public List<Evento> verEvento() {
        if (listaEventos.isEmpty()) {
            //es un evento de prueba
            listaEventos.add(ejemploEvento);
        } else {
            //si existe algun elemento elimino el evento de ejemplo
            listaEventos.remove(ejemploEvento);
        }
        return listaEventos;
    }

    @RequestMapping(method = RequestMethod.POST)

    public List<Evento> crearEventos(@RequestBody Evento evento) throws ErrorDiaException {
        int diaIni =evento.getFechaIni().getMes().getDia();
        int diaFin =evento.getFechaFin().getMes().getDia();
        //inicializo las variables con la cantidad de dias disponibles de ese mes
        if(diaIni>=evento.getFechaIni().getDia()
                &&diaFin>=evento.getFechaFin().getDia()){
         listaEventos.add(evento);
        }else{
        throw new ErrorDiaException();
        }
       

        return getListaEventos();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public List<Evento> eliminarEvento(@RequestBody Evento evento) {
        //elimina si la busqueda los nombres son iguales
        listaEventos.remove(evento);
        return listaEventos;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public List<Evento> editarEvento(@RequestBody Evento evento) {
        for (Evento l : listaEventos) {
            //si el titulo es igual al evento que se desea editar se elimina el anterior
            //y se agrega el evento cambiado
            if (l.getTitulo().equalsIgnoreCase(evento.getTitulo())) {
                listaEventos.remove(l);
                listaEventos.add(evento);
            }
        }
        return listaEventos;
    }

}
