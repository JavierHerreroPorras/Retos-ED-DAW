package reto9.java;

import java.util.ArrayList;

public class Puntuacion {
    ArrayList<Prog> lista = new ArrayList<>();

    public void a(Prog p) {
        lista.add(p);
    }

    public void b() {
        for (Prog p : lista) {
            p.ver();
        }
    }
}

