package reto1.java;

import java.util.ArrayList;

public class GestorTareas {
    ArrayList<Tarea> lista = new ArrayList<>();

    public void agregar(Tarea t) {
        lista.add(t);
    }

    public void mostrar() {
        for (Tarea t : lista) {
            t.imprimir();
        }
    }
}

