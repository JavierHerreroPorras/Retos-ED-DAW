package reto18.java;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fecha;

    public Reserva(Cliente cliente, Habitacion habitacion, String fecha) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
    }

    public Cliente getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public String getFecha() { return fecha; }

    public String toJson() {
        return String.format(
            "{\"cliente\":\"%s\",\"dni\":\"%s\",\"habitacion\":%d,\"tipo\":\"%s\",\"fecha\":\"%s\"}",
            cliente.getNombre(), cliente.getDni(), habitacion.getNumero(), habitacion.getTipo(), fecha);
    }

    @Override
    public String toString() {
        return cliente + " - " + habitacion + " - Fecha: " + fecha;
    }
}
