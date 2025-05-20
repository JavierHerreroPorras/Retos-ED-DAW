/**
 * 
 * @author Darío
 * @version 1.0
 * @since 2025-05-20
 * 
 */

package reto7.java;

public class Jugador {
    /**
     * Nombre del o de los jugadores
     */
    private String nombre;

    /**
     * puntos de vida
     */
    private int vida;
    /**
     * Puntos de ataque
     */
    private int ataque;
    /**
     * Puntos de defensa
     */
    private int defensa;
    /**
     * Crea un jugador con nombre, vida, ataque y defensa
     * @param nombre
     * @param vida
     * @param ataque
     * @param defensa
     */


    public Jugador(String nombre, int vida, int ataque, int defensa) { 
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getAtaque() {
        return ataque;
    }


    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public int getDefensa() {
        return defensa;
    }


    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    
    public void mostrar() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

}

