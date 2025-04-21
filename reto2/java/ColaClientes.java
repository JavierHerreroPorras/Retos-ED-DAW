package reto2.java;

import java.util.LinkedList;

public class ColaClientes {
    LinkedList<Cliente> cola = new LinkedList<>();

    public void añadirCliente(Cliente c) {
        cola.add(c);
    }

    public void atenderCliente() {
        if (!cola.isEmpty()) {
            Cliente c = cola.remove();
            c.imprimir();
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    public void mostrarCola() {
        for (Cliente c : cola) {
            c.imprimir();
        }
    }
}
