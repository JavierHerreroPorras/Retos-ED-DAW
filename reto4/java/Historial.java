package reto4.java;

import java.util.Stack;

public class Historial {
    Stack<Navegador> pila = new Stack<>();

    public void visitar(Navegador n) {
        pila.push(n);
    }

    public void atras() {
        if (!pila.isEmpty()) {
            pila.pop();
        }
        if (!pila.isEmpty()) {
            pila.peek().mostrar();
        } else {
            System.out.println("No hay páginas.");
        }
    }

    public void mostrarHistorial() {
        for (Navegador n : pila) {
            n.mostrar();
        }
    }
}

