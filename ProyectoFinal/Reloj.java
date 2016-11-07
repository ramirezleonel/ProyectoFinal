package ProyectoFinal;

public class Reloj {
    private int hora=00;
    private int min=0;

    public Reloj(int hora,int min) {
        this.hora=hora;
        this.min= min;
    }

    @Override
    public String toString() {
        return  hora + ":" + min ;
    }
}
