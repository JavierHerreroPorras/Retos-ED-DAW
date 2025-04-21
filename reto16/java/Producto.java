package reto16.java;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    public String toJson() {
        return String.format("{\"nombre\":\"%s\",\"precio\":%.2f,\"stock\":%d}", nombre, precio, stock);
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + " € - stock: " + stock;
    }
}
