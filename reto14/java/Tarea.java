package reto14.java;

public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return descripcion + " [" + (completada ? "Hecha" : "Pendiente") + "]";
    }

    public String aLineaArchivo() {
        return descripcion + "," + completada;
    }
}
