package reto3.java;

public class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String n, double s) {
        nombre = n;
        salarioBase = s;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
