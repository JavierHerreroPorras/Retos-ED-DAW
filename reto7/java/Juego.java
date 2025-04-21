package reto7.java;

public class Juego {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Arthas", 100, 30, 10);
        Jugador j2 = new Jugador("Thrall", 100, 25, 15);

        if (j1.ataque > j2.defensa) {
            j2.vida -= (j1.ataque - j2.defensa);
        } else {
            j1.vida -= 5;
        }

        j1.mostrar();
        j2.mostrar();
    }
}
