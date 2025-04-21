package reto11.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Votacion {
    public static void main(String[] args) {
        ArrayList<Votante> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce número de votantes:");
        int total = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < total; i++) {
            System.out.println("Nombre:");
            String nombre = sc.nextLine();

            System.out.println("Voto (A/B/C):");
            String voto = sc.nextLine();

            l.add(new Votante(nombre, voto));
        }

        int a = 0, b = 0, c = 0;

        for (Votante v : l) {
            if (v.op.equals("A")) a++;
            else if (v.op.equals("B")) b++;
            else if (v.op.equals("C")) c++;
        }

        System.out.println("Votos A: " + a);
        System.out.println("Votos B: " + b);
        System.out.println("Votos C: " + c);
    }
}

