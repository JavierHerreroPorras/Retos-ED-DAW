package reto4.java;

public class Navegador {
    public String url;

    public Navegador(String u) {
        url = u;
    }

    public void mostrar() {
        System.out.println("Página actual: " + url);
    }
}

