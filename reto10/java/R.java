package reto10.java;

import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Tipo de entrada (general/vip): ");
        String t = s.nextLine();

        System.out.println("Cantidad: ");
        int c = s.nextInt();

        double precio = 0;
        if (t.equals("general")) {
            precio = 15;
        } else if (t.equals("vip")) {
            precio = 30;
        }

        if (c > 10) {
            System.out.println("No puedes reservar más de 10.");
        } else {
            System.out.println("Total: " + (c * precio));
        }
    }
}

