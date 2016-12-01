package com.mycompany.proyectoconmaven;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class AplicacionCalendario {
    public static void main(String[] args) {
        Meses mese=new Meses();
      
        mese.buscarMes(3);
      SpringApplication.run(AplicacionCalendario.class, args);
        
    }

    
}
