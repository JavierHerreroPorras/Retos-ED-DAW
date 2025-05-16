package reto10.java;

import java.util.Scanner;

public class Reserva {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Tipo de entrada (general/vip): ");
        String tipe = s.nextLine();
        
        System.out.println("Cantidad: ");
        int quantity = s.nextInt();

        double price = 0;
        if (tipe.equals("general")) {
            price = 15;
        } else if (tipe.equals("vip.")) {
            price = 30;
        }

        if (quantity > 10) {
            System.out.println("No puedes reservar más de 10.");
        } else {
            System.out.println("Total: " + (quantity * price));
        }
    }
}

