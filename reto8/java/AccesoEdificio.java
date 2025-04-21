package reto8.java;

public class AccesoEdificio {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Luis", "empleado", true),
            new Persona("Ana", "visitante", false),
            new Persona("Carlos", "administrador", false)
        };

        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            if (p.tipo.equals("administrador")) {
                System.out.println(p.nombre + " tiene acceso total.");
            } else if (p.tipo.equals("empleado") && p.tarjetaActiva) {
                System.out.println(p.nombre + " tiene acceso.");
            } else if (p.tipo.equals("visitante")) {
                System.out.println(p.nombre + " necesita autorización.");
            } else {
                System.out.println(p.nombre + " acceso denegado.");
            }
        }
    }
}
