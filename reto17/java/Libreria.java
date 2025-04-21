package reto17.java;

import java.io.*;
import java.util.*;

public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void cargar(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            StringBuilder json = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                json.append(linea);
            }
            String contenido = json.toString().replace("[", "").replace("]", "").trim();
            String[] objetos = contenido.split("},\\s*\\{");
            for (String obj : objetos) {
                String limpio = obj.replace("{", "").replace("}", "").replace("\"", "");
                String[] campos = limpio.split(",");
                String titulo = campos[0].split(":")[1];
                String autor = campos[1].split(":")[1];
                double precio = Double.parseDouble(campos[2].split(":")[1]);
                libros.add(new Libro(titulo, autor, precio));
            }
        } catch (IOException e) {
            System.out.println("Error al leer libros: " + e.getMessage());
        }
    }

    public void guardar(String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write("[\n");
            for (int i = 0; i < libros.size(); i++) {
                bw.write("  " + libros.get(i).toJson());
                if (i < libros.size() - 1) bw.write(",");
                bw.newLine();
            }
            bw.write("]");
        } catch (IOException e) {
            System.out.println("Error al guardar libros: " + e.getMessage());
        }
    }

    // Métodos públicos para listar, buscar, añadir, eliminar, modificar...
}
