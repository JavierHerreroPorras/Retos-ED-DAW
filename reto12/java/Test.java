package reto12.java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pregunta[] preguntas = {
            new Q("¿Prefieres resolver problemas matemáticos o dibujar?", "A", "B", "C"),
            new Q("¿Te gusta planificar o improvisar?", "A", "B", "C"),
            new Q("¿Prefieres lógica o intuición?", "A", "B", "C")
        };

        int a = 0, b = 0, c = 0;

        for (Pregunta q : preguntas) {
            System.out.println(q.t + " (" + q.respuesta1 + "/" + q.respuesta2 + "/" + q.respuesta3 + ")");
            String resp = s.nextLine();
            if (resp.equalsIgnoreCase("A")) a++;
            else if (resp.equalsIgnoreCase("B")) b++;
            else if (resp.equalsIgnoreCase("C")) c++;
        }

        if (a > b && a > c) System.out.println("Perfil lógico");
        else if (b > a && b > c) System.out.println("Perfil creativo");
        else if (c > a && c > b) System.out.println("Perfil intuitivo");  
        else System.out.println("Perfil equilibrado");
    }
}
