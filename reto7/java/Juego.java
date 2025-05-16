package reto7.java;

public class Juego {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Arthas", 100, 30, 10);
        Jugador jugador2 = new Jugador("Thrall", 100, 25, 15);

        if (jugador1.ataque > jugador2.defensa) {
            jugador2.vida -= (jugador1.ataque - jugador2.defensa);
        } else {
            jugador1.vida -= 5;
        }

        jugador1.mostrar();
        jugador2.mostrar();
    }
}
