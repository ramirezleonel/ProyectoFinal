package com.mycompany.proyectoconmaven;

import java.util.ArrayList;
import java.util.HashMap;



public class Meses {

    private HashMap<Integer, Mes> meses = new HashMap<Integer, Mes>();
    
    public Meses() {
        meses.put(1, Mes.Enero);
        meses.put(2, Mes.Febrero);
        meses.put(3, Mes.Marzo);
        meses.put(4, Mes.Abril);
        meses.put(5, Mes.Mayo);
        meses.put(6, Mes.Junio);
        meses.put(7, Mes.Julio);
        meses.put(8, Mes.Agosto);
        meses.put(9, Mes.Septiembre);
        meses.put(10, Mes.Octubre);
        meses.put(11, Mes.Noviembre);
        meses.put(12, Mes.Diciembre);
    }
    //le paso como parametro un entero del mes,me retorna un mes
    public Mes buscarMes(Integer mes){
     Mes auxMes= meses.get(mes);
        return auxMes;
    }
    public HashMap<Integer, Mes> getMeses() {
        
        return meses;
    }
    
  

}
