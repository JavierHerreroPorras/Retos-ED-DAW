package reto1.java;

public class Tarea {
    public String descripcion;
    public boolean completada;
    public int prioridad;

    public Tarea(String d, int p) {
        descripcion = d;
        prioridad = p;
        completada = false;
    }

    public void marcarCompletada() {
        completada = true;
    }

    public void imprimir() {
        System.out.println(descripcion + " - Prioridad: " + prioridad + " - Completada: " + completada);
    }
}

