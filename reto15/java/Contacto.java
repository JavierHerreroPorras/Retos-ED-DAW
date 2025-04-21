package reto15.java;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return nombre + " - " + telefono + " - " + email;
    }

    public String aJson() {
        return String.format("{\"nombre\":\"%s\",\"telefono\":\"%s\",\"email\":\"%s\"}", nombre, telefono, email);
    }
}

