package reto9.java;

public class Prog {
    public String n1;
    public int[] pts;

    public Prog(String n, int[] p) {
        n1 = n;
        pts = p;
    }

    public void ver() {
        System.out.println("Nombre: " + n1);
        for (int i = 0; i < pts.length; i++) {
            System.out.println("Punto " + i + ": " + pts[i]);
        }
    }
}

