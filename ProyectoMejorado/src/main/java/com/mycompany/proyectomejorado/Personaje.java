
package com.mycompany.ProyectoMejorado;

public class Personaje {

    private String nombre;
    private int vida;
    private int fuerza;
    private boolean defendiendo;

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.defendiendo = false;
    }

    public void atacar(Personaje objetivo) {
        objetivo.recibirDanio(fuerza);
        System.out.println(nombre + " ataco a " + objetivo.nombre + "!");
    }

    public void defender() {
        defendiendo = true;
        System.out.println(nombre + " se prepara para defenderse!");
    }

    private void recibirDanio(int danio) {

        if (defendiendo) {
            danio = danio / 2;
            defendiendo = false;
            System.out.println("La defensa amortiguo el dano causado!");
        }

        vida = vida - danio;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void mostrarEstado() {
        System.out.println("\nEstado de " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Defensa: "
                + (defendiendo ? "Activa" : "Inactiva"));
    }
}
