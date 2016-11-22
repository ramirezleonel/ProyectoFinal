package com.mycompany.proyectoconmaven;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/listaUsuario")
@RestController
public class UsuarioController {

    private Set<Usuario> lista = new LinkedHashSet<Usuario>();

    public Set<Usuario> getLista() {
        return lista;
    }

    public void setLista(Set<Usuario> lista) {
        this.lista = lista;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Set<Usuario> listaUsuarios() {

        return getLista();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Set<Usuario> listaUsuarios1(@RequestBody Usuario usuario) {

        lista.add(usuario);
        return getLista();
    }

}
