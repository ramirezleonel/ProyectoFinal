package com.mycompany.proyectoconmaven;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Set;
import javax.validation.Valid;
import jdk.nashorn.internal.runtime.ListAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/listaUsuario")
@RestController
public class UsuarioController implements IGestionDeUsuarios {

    Usuario usuarioPrueba = new Usuario("Leonel", "123456");
    private Set<Usuario> lista = new LinkedHashSet<Usuario>();

    public Set<Usuario> getLista() {
        if (lista.isEmpty()) {
            lista.add(usuarioPrueba);
        }

        return lista;
    }

    public void setLista(Set<Usuario> lista) {
        this.lista = lista;
    }
//agrega un usuario que no exista
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public Set<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        lista.add(usuario);
        return getLista();
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public Set<Usuario> EliminarUsuario(@RequestBody Usuario usuario) {
        if(lista.contains(usuario)){
        lista.remove(usuario);
        }
         return getLista();
    }


    @RequestMapping(method = RequestMethod.GET)
    @Override
    public Set<Usuario> verUsuarios() {
        return getLista();
    }
}
