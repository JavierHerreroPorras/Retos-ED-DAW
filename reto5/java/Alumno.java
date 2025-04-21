package reto5.java;

public class Alumno {
    public String nombre;
    public double nota1;
    public double nota2;

    public Alumno(String n, double n1, double n2) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
    }

    public void imprimir() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota media: " + (nota1 + nota2) / 2);
    }
}

