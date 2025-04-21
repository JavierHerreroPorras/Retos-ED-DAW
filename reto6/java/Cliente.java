package reto6.java;

public class Cliente {
    public String nombre;
    public int numeroCuenta;

    public Cliente(String n, int c) {
        nombre = n;
        numeroCuenta = c;
    }

    public void mostrar() {
        System.out.println("Cliente: " + nombre + " - Cuenta: " + numeroCuenta);
    }
}
