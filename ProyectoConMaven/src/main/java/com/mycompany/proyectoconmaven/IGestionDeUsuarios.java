package com.mycompany.proyectoconmaven;

import java.util.Set;

public interface IGestionDeUsuarios {
    //definicion de los comportamientos que se van
    //a ver reflejado en la lista definido en cuentas
    public Set<Usuario> crearUsuario(Usuario usuario);
    //compara el usuario si son iguales para eliminar
    public Set<Usuario> EliminarUsuario(Usuario usuario);
   
          
    public Set<Usuario> verUsuarios();

   
}
