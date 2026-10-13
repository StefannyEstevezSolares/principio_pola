
package com.mycompany.ProyectoMejorado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personaje kirby = new Personaje("Kirby", 100, 15);
        Personaje snoopy = new Personaje("Snoopy", 100, 10);

        int opcion;

        do {
            System.out.println("\n=== RPG ===");
            System.out.println("1. Consultar vida y fuerza de Kirby y Snoopy");
            System.out.println("2. Atacar a Snoopy con Kirby");
            System.out.println("3. Defender a Kirby del ataque de Snoopy");
            System.out.println("0. Salir del juego");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    kirby.mostrarEstado();
                    snoopy.mostrarEstado();
                    break;

                case 2:
                    kirby.atacar(snoopy);
                    break;

                case 3:
                    kirby.defender();
                    snoopy.atacar(kirby);
                    break;

                case 0:
                    System.out.println("Fin del juego!");
                    break;

                default:
                    System.out.println("Opcion invalida!");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
