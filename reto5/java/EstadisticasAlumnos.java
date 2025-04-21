package reto5.java;

import java.util.ArrayList;

public class EstadisticasAlumnos {
    ArrayList<Alumno> lista = new ArrayList<>();

    public void añadir(Alumno a) {
        lista.add(a);
    }

    public void mostrar() {
        for (Alumno a : lista) {
            a.imprimir();
        }
    }
}
