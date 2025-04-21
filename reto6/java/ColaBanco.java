package reto6.java;

import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco {
    Queue<Cliente> cola = new LinkedList<>();

    public void nuevoCliente(Cliente c) {
        cola.add(c);
    }

    public void atender() {
        if (!cola.isEmpty()) {
            Cliente c = cola.poll();
            c.mostrar();
        } else {
            System.out.println("No hay clientes.");
        }
    }

    public void mostrarCola() {
        for (Cliente c : cola) {
            c.mostrar();
        }
    }
}

