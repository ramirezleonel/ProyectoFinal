package ProyectoFinal;

public class Evento {
  private String nombre;
  private String descripcion;
  private Fechas fechaIni;
  private Fechas fechaFin;

    public Evento(String nombre, String descripcion, Fechas fechaIni, Fechas fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Evento: " + "titulo: " + nombre + "/n descripcion: " 
                + descripcion + "/n fechaIni: " + fechaIni + "/n fechaFin:" +
                fechaFin + "/n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fechas getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Fechas fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Fechas getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fechas fechaFin) {
        this.fechaFin = fechaFin;
    }
}
