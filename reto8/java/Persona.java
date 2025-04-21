package reto8.java;

public class Persona {
    public String nombre;
    public String tipo; // "administrador", "empleado", "visitante"
    public boolean tarjetaActiva;

    public Persona(String n, String t, boolean ta) {
        nombre = n;
        tipo = t;
        tarjetaActiva = ta;
    }
}
