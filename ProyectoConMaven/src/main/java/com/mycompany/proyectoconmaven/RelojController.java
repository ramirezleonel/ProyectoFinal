package com.mycompany.proyectoconmaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/reloj")
public class RelojController {
     @RequestMapping(method = RequestMethod.GET)
    public Reloj crearReloj1(){
       Reloj nuevoR= new Reloj();
       nuevoR.crearReloj2();
      
    return nuevoR;
    }
    
}
