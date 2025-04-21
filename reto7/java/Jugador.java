package reto7.java;

public class Jugador {
    public String nombre;
    public int vida;
    public int ataque;
    public int defensa;

    public Jugador(String n, int v, int a, int d) {
        nombre = n;
        vida = v;
        ataque = a;
        defensa = d;
    }

    public void mostrar() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }
}

