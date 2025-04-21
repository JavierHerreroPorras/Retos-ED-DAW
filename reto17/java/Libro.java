package reto17.java;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return titulo + " de " + autor + " - " + precio + " €";
    }

    public String toJson() {
        return String.format("{\"titulo\":\"%s\",\"autor\":\"%s\",\"precio\":%.2f}", titulo, autor, precio);
    }
}
