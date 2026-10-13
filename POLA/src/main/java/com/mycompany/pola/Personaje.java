package com.mycompany.pola;

public class Personaje {

    private String nombre;
    private int vida;
    private int fuerza;

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void atacar(Personaje objetivo) {
        objetivo.vida -= fuerza;

        if (objetivo.vida < 0) {
            objetivo.vida = 0;
        }

        System.out.println(nombre + " ataco a " + objetivo.nombre);
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Vida: " + vida);
    }
}
