package com.mycompany.proyectoconmaven;

import java.util.ArrayList;
import java.util.List;
import javax.security.auth.message.callback.PrivateKeyCallback;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Eventos")
@RestController
public class EventosController implements IGestionDeCalendarios {

    private List<Evento> listaEventos = new ArrayList<Evento>();
    Evento ejemploEvento = new Evento("Ejemplo:evento", "descripcion",
            new Fecha(3, Mes.Mayo, 2013), new Fecha(5, Mes.Mayo, 2014),
            new Tiempo(2, 31), new Tiempo(3, 21));

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {

        this.listaEventos = listaEventos;
    }

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
    @Override
    public List<Evento> crearEventos(@RequestBody Evento evento) {

        listaEventos.add(evento);

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
    public Evento buscarEventoNombre(@RequestParam (value= "titulo")String nombreEvento) {

        Evento nuevo = new Evento(nombreEvento, "descripcion", new Fecha(), new Fecha(), new Tiempo(), new Tiempo());
        for (Evento l : listaEventos) {
            if(l.getTitulo().equalsIgnoreCase(nombreEvento)){
            return l;
            
            }
        }
        return null;
    }

    

}
