package ProyectoFinal;

public interface IGestionDeUsuarios {
    //definicion de los comportamientos que se van
    //a ver reflejado en la lista definido en cuentas
    public void crearUsuario(String nombre,String contraseña);
    //compara el usuario
    public void EliminarUsuario(String nombre);
    
    public void buscarUsuario(String nombre,String contraseña);
          
    public void verUsuarios();
   //para ingresar por teclado
    public Usuario nuevoUsuario();
   //para ingresar por teclado
    public String ingresarContraseña();
}
