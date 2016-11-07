package ProyectoFinal;

import java.util.Objects;

public class Usuario {

    private String nombreDeUsuario;
    private String contraseña;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombreDeUsuario);
        hash = 17 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario otroUsu = (Usuario) obj;
        if (!Objects.equals(this.nombreDeUsuario, otroUsu.nombreDeUsuario)) {
            return false;
        } else if (!Objects.equals(this.contraseña, otroUsu.contraseña)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + nombreDeUsuario + " ";
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(String nombreDeUsuario, String contraseña) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
    }

}
