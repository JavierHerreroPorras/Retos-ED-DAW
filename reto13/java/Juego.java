package reto13.java;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();

        Jugador jugador = new Jugador(nombre);

        Nivel[] niveles = {
            new Nivel("Nivel 1: Te enfrentas a una bifurcación.", 10, 5),
            new Nivel("Nivel 2: Hay un monstruo dormido. ¿Avanzas?", 20, -10),
            new Nivel("Nivel 3: Encuentras un cofre cerrado. ¿Lo abres?", 30, -5)
        };

        for (Nivel n : niveles) {
            int puntos = n.jugar(scanner);
            jugador.sumarPuntos(puntos);
        }

        System.out.println("Puntos finales: " + jugador.getPuntos());

        if (jugador.getPuntos() > 70) {
            System.out.println("¡Nivel experto!");
        } else if (jugador.getPuntos() >= 40) {
            System.out.println("¡Buen trabajo!");
        } else {
            System.out.println("¡Sigue practicando!");
        }
    }
}

