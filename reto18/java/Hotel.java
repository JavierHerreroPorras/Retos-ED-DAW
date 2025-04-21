package reto18.java;

import java.io.*;
import java.util.*;

public class Hotel {
    private List<Reserva> reservas = new ArrayList<>();

    public void cargar(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.replace("{", "").replace("}", "").replace("\"", "");
                String[] partes = linea.split(",");
                String nombre = partes[0].split(":")[1];
                String dni = partes[1].split(":")[1];
                int numHab = Integer.parseInt(partes[2].split(":")[1]);
                String tipo = partes[3].split(":")[1];
                String fecha = partes[4].split(":")[1];
                reservas.add(new Reserva(new Cliente(nombre, dni), new Habitacion(numHab, tipo), fecha));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar archivo: " + e.getMessage());
        }
    }

    public void guardar(String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Reserva r : reservas) {
                bw.write(r.toJson());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public void mostrarDisponibles(String fecha) {
        List<Integer> ocupadas = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getFecha().equals(fecha)) {
                ocupadas.add(r.getHabitacion().getNumero());
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (!ocupadas.contains(i)) {
                System.out.println("Habitación " + i + " disponible");
            }
        }
    }

    public void nuevaReserva(Scanner sc) {
        System.out.println("Nombre cliente:");
        String nombre = sc.nextLine();
        System.out.println("DNI cliente:");
        String dni = sc.nextLine();
        System.out.println("Número habitación:");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Tipo habitación:");
        String tipo = sc.nextLine();
        System.out.println("Fecha (yyyy-mm-dd):");
        String fecha = sc.nextLine();

        for (Reserva r : reservas) {
            if (r.getHabitacion().getNumero() == num && r.getFecha().equals(fecha)) {
                System.out.println("Esa habitación ya está reservada ese día.");
                return;
            }
        }
        reservas.add(new Reserva(new Cliente(nombre, dni), new Habitacion(num, tipo), fecha));
        System.out.println("Reserva registrada.");
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        hotel.cargar("reservas.json");

        boolean salir = false;
        while (!salir) {
            System.out.println("1. Ver disponibilidad\n2. Nueva reserva\n3. Ver reservas\n4. Guardar y salir");
            String opc = sc.nextLine();
            switch (opc) {
                case "1":
                    System.out.println("Fecha (yyyy-mm-dd):");
                    String fecha = sc.nextLine();
                    hotel.mostrarDisponibles(fecha);
                    break;
                case "2":
                    hotel.nuevaReserva(sc);
                    break;
                case "3":
                    hotel.mostrarReservas();
                    break;
                case "4":
                    hotel.guardar("reservas_actualizadas.json");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
