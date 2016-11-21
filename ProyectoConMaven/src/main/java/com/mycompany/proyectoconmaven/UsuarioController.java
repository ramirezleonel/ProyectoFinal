package com.mycompany.proyectoconmaven;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UsuarioController {

    public String nombre = "usuarioleo";
    public String contraseña = "contrase";
    public List<Usuario>lista=new ArrayList<Usuario>();
    

  @RequestMapping("/listaUsuario")
    public List<Usuario> listaUsuarios() {
lista.add(new Usuario(nombre, contraseña));
        return lista;
    }

   
}
