package com.mycompany.proyectoconmaven;

public class Reloj {
    private int[] hora=new int[25];
    private int[] min=new int[61];
    
    private void crearReloj(){
        for (int i = 0; i < hora.length; i++) {
           hora[i]=i;
        }
        for (int i = 0; i < min.length; i++) {
           min[i]=i;
        }
    
    }
    public void verReloj(){
        crearReloj();
        for (int i = 0; i < hora.length; i++) {
            System.out.println("hora"+hora[i]);
        }
        for (int i = 0; i < min.length; i++) {
            System.out.println("min"+min[i]);
        }
    
    
    }

    
  

    @Override
    public String toString() {
        return  hora + ":" + min ;
    }
}
