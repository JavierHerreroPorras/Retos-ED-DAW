package reto15.java;

import java.io.*;
import java.util.*;

public class Agenda {
    private List<Contacto> contactos = new ArrayList<>();

    public void cargar(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    String[] partes = linea.replace("{", "").replace("}", "").replace("\"", "").split(",");
                    String nombre = partes[0].split(":")[1];
                    String telefono = partes[1].split(":")[1];
                    String email = partes[2].split(":")[1];
                    contactos.add(new Contacto(nombre, telefono, email));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar contactos: " + e.getMessage());
        }
    }

    public void guardar(String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Contacto c : contactos) {
                bw.write(c.aJson());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar contactos: " + e.getMessage());
        }
    }

    // Métodos públicos para listar, añadir, buscar, eliminar...
}

