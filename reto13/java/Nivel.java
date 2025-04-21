package reto13.java;

public import java.util.Scanner;

public class Nivel {
    private String descripcion;
    private int puntosCorrecto;
    private int puntosIncorrecto;

    public Nivel(String descripcion, int puntosCorrecto, int puntosIncorrecto) {
        this.descripcion = descripcion;
        this.puntosCorrecto = puntosCorrecto;
        this.puntosIncorrecto = puntosIncorrecto;
    }

    public int jugar(Scanner scanner) {
        System.out.println(descripcion);
        System.out.println("¿Qué decides? (A/B)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("A")) {
            System.out.println("Buena decisión.");
            return puntosCorrecto;
        } else {
            System.out.println("Decisión arriesgada...");
            return puntosIncorrecto;
        }
    }
}
 {
    
}
