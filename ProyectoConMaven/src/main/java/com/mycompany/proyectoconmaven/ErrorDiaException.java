package com.mycompany.proyectoconmaven;

public class ErrorDiaException extends Exception{

    public ErrorDiaException() {
        super("el dia es incorrecto,ingrese un valor dentro "
                + "de los limites del mes");
    }
    
}
