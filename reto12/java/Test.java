package reto12.java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Q[] preguntas = {
            new Q("¿Prefieres resolver problemas matemáticos o dibujar?", "A", "B"),
            new Q("¿Te gusta planificar o improvisar?", "A", "B"),
            new Q("¿Prefieres lógica o intuición?", "A", "B")
        };

        int a = 0, b = 0;

        for (Q q : preguntas) {
            System.out.println(q.t + " (" + q.r1 + "/" + q.r2 + ")");
            String resp = s.nextLine();
            if (resp.equalsIgnoreCase("A")) a++;
            else if (resp.equalsIgnoreCase("B")) b++;
        }

        if (a > b) System.out.println("Perfil lógico");
        else if (b > a) System.out.println("Perfil creativo");
        else System.out.println("Perfil equilibrado");
    }
}
