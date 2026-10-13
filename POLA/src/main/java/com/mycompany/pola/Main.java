
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personaje kirby = new Personaje("Kirby", 100, 15);
        Personaje snoopy = new Personaje("Snoopy", 100, 10);

        int opcion;

        do {
            System.out.println("\n=== RPG ===");

            // "Estado" no explica qué información verá el usuario.
            System.out.println("1. Estado");

            // "Acción ofensiva" no indica quién atacará ni a quién.
            System.out.println("2. Accion ofensiva");

            // Se presenta una opción como disponible, aunque no funciona.
            System.out.println("3. Accion defensiva");

            System.out.println("0. Terminar");
            System.out.print("Selecciona: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    kirby.mostrarEstado();
                    snoopy.mostrarEstado();
                    break;

                case 2:
                    // La confirmación usa un término ambiguo:
                    // "maniobra" no aclara que se atacará a Snoopy.
                    System.out.println(
                        "¿Deseas iniciar una maniobra?"
                    );
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    if (scanner.nextInt() == 1) {
                        kirby.atacar(snoopy);
                    }
                    break;

                case 3:
                    // La opción parecía estar disponible,
                    // pero el usuario descubre que no puede utilizarla.
                    System.out.println(
                        "Esta opcion no esta disponible."
                    );
                    break;

                case 0:
                    System.out.println("Fin del juego.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
