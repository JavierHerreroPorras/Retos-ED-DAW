package reto6.java;

public class Cliente {
    // encapsular atributos estaban en public y lo he puesto en private
    private String nombre;
    private int numeroCuenta;

    // revisamos y mejoramos el contructor
    public Cliente(String nombre, int numeroCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // aqui hemos creado un metodo toString
    @Override
    public String toString() {
        String cadena = ("Cliente: " + nombre + " - Cuenta: " + numeroCuenta);
        return cadena;
    }
}
