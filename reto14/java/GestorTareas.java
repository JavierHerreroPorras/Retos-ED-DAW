package reto14.java;

import java.io.*;
import java.util.*;

public class GestorTareas {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();

        // Leer tareas desde archivo
        try (BufferedReader br = new BufferedReader(new FileReader("java\\tareas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    tareas.add(new Tarea(partes[0], Boolean.parseBoolean(partes[1])));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Lista de tareas ---");
            mostrarTareas(tareas);

            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar tareas");
            System.out.println("2. Marcar tarea como hecha");
            System.out.println("3.Salir");
            System.out.print("Elige una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":

                    System.out.println("\n--- Lista de tareas ---");
                    mostrarTareas(tareas);

                case "2":
                    System.out.print("Número de tarea a marcar como hecha: ");
                    try {
                        int num = Integer.parseInt(scanner.nextLine()) - 1;
                        tareas.get(num).completar();
                        System.out.println("Tarea marcada como hecha.");

                    } catch (NumberFormatException e) {
                        System.out.println("Por favor ingresa un número válido.");
                    }
                    break;

                case "3":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        tareas.sort(Comparator.comparing(Tarea::isCompletada));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tareas_actualizadas.txt"))) {
            for (Tarea t : tareas) {
                bw.write(t.aLineaArchivo());
                bw.newLine();
            }
            System.out.println("Archivo actualizado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    private static void mostrarTareas(List<Tarea> tareas) {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }
}
