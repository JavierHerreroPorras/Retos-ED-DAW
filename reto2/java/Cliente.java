package reto2.java;

public class Cliente {
    String nombre;
    int edad;

    public Cliente(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void imprimir() {
        System.out.println("Cliente: " + nombre + ", Edad: " + edad);
    }
}

