package ProyectoFinal;

import java.util.Scanner;

public class VistaPrincipal implements IDatosPorConsola {


    Scanner tec = new Scanner(System.in);
    Cuentas c = new Cuentas();

    public void mostrarVista() {
        int num1;
        boolean seguir = true;

        do {
            System.out.println("--------------------------");
            System.out.println("INGRESE UN USUARIO Y CONTRASEÑA");
            System.out.println("--------------------------");
            System.out.println("presionar 1 para crear,2 para buscar,3 eliminar,4 salir");
            num1 = tec.nextInt();
            switch (num1) {
                case 1:
                  ingresarUsuario();
                    c.crearUsuario(ingresarUsuario(), ingresarContraseña());
                    break;
                case 2:
                   
                   c.buscarUsuario(ingresarUsuario(), ingresarContraseña());
                    break;
                case 3:
                  c.EliminarUsuario(ingresarUsuario());  
                    break;
                case 4:
                    seguir=false;
                    break;
            }
        } while (seguir == true);
    }

    @Override
    public String ingresarUsuario() {
        String usu; 
        System.out.println("usuario: ");
         usu = tec.next();
         return usu;
    }

    @Override
    public String ingresarContraseña() {
        String contra; 
        System.out.println("contraseña: ");
          contra= tec.next();
          return contra;
    }

}
