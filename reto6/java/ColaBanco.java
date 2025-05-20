package reto6.java;

import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco {
    Queue<Cliente> cola = new LinkedList<>();

    // Agrega un nuevo cliente a la cola con un nombre de variable mas intuitivo
    public void nuevoCliente(Cliente nuevoCliente) {
        cola.add(nuevoCliente);
    }

    /**
     * Atiende al primer cliente de la cola.
     * Si no hay clientes, se muestra un mensaje.
     */

    public void atender() {
        if (!cola.isEmpty()) {
            Cliente clientenuevo = cola.poll();
            clientenuevo.mostrar();
        } else {
            System.out.println("No hay clientes.");
        }
    }

    public void mostrarCola() {
        for (Cliente clientenuevo : cola) {
            clientenuevo.mostrar();
        }
    }
}
