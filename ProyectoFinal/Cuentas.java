package ProyectoFinal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cuentas implements IGestionDeUsuarios {
    Scanner tec=new Scanner(System.in);
    //necesito un set de usuarios por que no debe admitir elementos duplicados 
    //en la lista
    private Set<Usuario> listaDeUsuarios = new HashSet<Usuario>();
    //cada cuenta tiene un calendario

    @Override
    public void crearUsuario(String nombre, String contraseña) {
        if (listaDeUsuarios.isEmpty()) {
            listaDeUsuarios.add(new Usuario(nombre, contraseña));

        } else {
            for (Usuario l : listaDeUsuarios) {
                if (!(l.getNombreDeUsuario().equals(nombre))) {
                    listaDeUsuarios.add(new Usuario(nombre, contraseña));
                    return;
                } else {
                    System.out.println("El nombre de usuario ya existe");
                    return;
                }
            }
        }

    }

    @Override
    public void EliminarUsuario(String nombre) {
        for (Usuario l : listaDeUsuarios) {
            if (!(l.getNombreDeUsuario().equals(nombre))) {
                listaDeUsuarios.remove(l);
            }
        }
    }

    @Override
    public void buscarUsuario(String nombre, String contraseña) {
        Usuario aux = new Usuario(nombre, contraseña);
        if (listaDeUsuarios.contains(aux)) {

            System.out.println("El usuario buscado fue encontrado");
        } else {
            System.out.println("No existe el usuario buscado, intente nuevamente");;
        }
    }

    @Override
    public void verUsuarios() {
        //imprime toda la lista de usuarios
        System.out.println(listaDeUsuarios);
    }

    

}
