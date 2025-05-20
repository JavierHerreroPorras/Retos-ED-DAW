package reto7.java;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Juego {
    public static void main(String[] args) {
        /**
         * Juagadores antes de tener nuevas funciones
         */
        Jugador jugador1 = new Jugador("Arthas", 100, 30, 10);
        Jugador jugador2 = new Jugador("Thrall", 100, 25, 30);

        int vida_perdida = jugador1.getAtaque() - jugador2.getDefensa();

        jugador1.mostrar();
        
        jugador2.mostrar();
        
        if (jugador1.getAtaque() > jugador2.getDefensa()) {
            System.out.println("\n El ataque ha acertado y el rival a perdido: " +vida_perdida +" puntos de vida");

        }else{
            System.out.println("\n El ataque no ha surtido efecto");
        }

       
    



    }

       
}
