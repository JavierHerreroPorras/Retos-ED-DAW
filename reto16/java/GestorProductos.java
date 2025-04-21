package reto16.java;

import java.io.*;
import java.util.*;

public class GestorProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("productos.json"))) {
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
                String nombre = campos[0].split(":")[1];
                double precio = Double.parseDouble(campos[1].split(":")[1]);
                int stock = Integer.parseInt(campos[2].split(":")[1]);
                productos.add(new Producto(nombre, precio, stock));
            }

        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }

        System.out.println("¿Qué producto quieres modificar? (número):");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        if (index >= 0 && index < productos.size()) {
            System.out.println("Nuevo precio:");
            double nuevoPrecio = Double.parseDouble(sc.nextLine());
            System.out.println("Nuevo stock:");
            int nuevoStock = Integer.parseInt(sc.nextLine());

            productos.get(index).setPrecio(nuevoPrecio);
            productos.get(index).setStock(nuevoStock);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos_actualizados.json"))) {
            bw.write("[\n");
            for (int i = 0; i < productos.size(); i++) {
                bw.write("  " + productos.get(i).toJson());
                if (i < productos.size() - 1) bw.write(",");
                bw.newLine();
            }
            bw.write("]");
        } catch (IOException e) {
            System.out.println("Error escribiendo archivo: " + e.getMessage());
        }
    }
}