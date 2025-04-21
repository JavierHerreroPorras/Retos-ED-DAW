package reto14.java;

import java.io.*;
import java.util.*;

public class GestorTareas {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("tareas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                tareas.add(new Tarea(partes[0], Boolean.parseBoolean(partes[1])));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.println("¿Qué tarea quieres marcar como hecha? (Número): ");
        int seleccion = Integer.parseInt(sc.nextLine()) - 1;
        if (seleccion >= 0 && seleccion < tareas.size()) {
            tareas.get(seleccion).completar();
        }

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
}
