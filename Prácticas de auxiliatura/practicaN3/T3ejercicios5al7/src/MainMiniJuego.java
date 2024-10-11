import java.util.Scanner;
import java.util.Random;

public class MainMiniJuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el nombre del Mago: ");
        String nombreMago = scanner.nextLine();
        Mago mago = new Mago(nombreMago, 1, 100, random.nextInt(100) + 1);

        System.out.print("Ingresa el nombre del Guerrero: ");
        String nombreGuerrero = scanner.nextLine();
        Guerrero guerrero = new Guerrero(nombreGuerrero, 1, 100, random.nextInt(100) + 1);


        System.out.print("Ingresa el nombre del Zombie: ");
        String nombreZombie = scanner.nextLine();
        System.out.print("Ingresa los puntos de vida del Zombie: ");
        int puntosVidaZombie = scanner.nextInt();
        System.out.print("Ingresa el daño base del Zombie: ");
        int dañoBaseZombie = scanner.nextInt();
        Zombie zombie = new Zombie(nombreZombie, puntosVidaZombie, dañoBaseZombie);

        scanner.nextLine(); 
        System.out.print("Ingresa el nombre del Vampiro: ");
        String nombreVampiro = scanner.nextLine();
        System.out.print("Ingresa los puntos de vida del Vampiro: ");
        int puntosVidaVampiro = scanner.nextInt();
        System.out.print("Ingresa el daño base del Vampiro: ");
        int dañoBaseVampiro = scanner.nextInt();
        Vampiro vampiro = new Vampiro(nombreVampiro, puntosVidaVampiro, dañoBaseVampiro);

        scanner.nextLine(); 
        System.out.print("Ingresa el nombre del Jefe: ");
        String nombreJefe = scanner.nextLine();
        System.out.print("Ingresa los puntos de vida del Jefe: ");
        int puntosVidaJefe = scanner.nextInt();
        System.out.print("Ingresa el daño base del Jefe: ");
        int dañoBaseJefe = scanner.nextInt();
        System.out.print("Ingresa el multiplicador de daño del Jefe: ");
        double multiplicadorJefe = scanner.nextDouble();
        Jefe jefe = new Jefe(nombreJefe, puntosVidaJefe, dañoBaseJefe, multiplicadorJefe);

        boolean jugando = true;

        while (jugando) {
            System.out.println("\nElige una acción:");
            System.out.println("1. Atacar al Zombie");
            System.out.println("2. Atacar al Vampiro");
            System.out.println("3. Atacar al Jefe");
            System.out.println("4. Hablar con el Jefe");
            System.out.println("5. Salir del juego");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // Atacar al Zombie
                    while (mago.puntosVida > 0 && zombie.estaVivo()) {
                        int dañoMago = random.nextInt(11) + 10; 
                        zombie.recibirDanio(dañoMago);
                        System.out.println(mago.nombre + " lanza un hechizo y hace " + dañoMago + " de daño a " + zombie.getNombre() + "!");
                        zombie.mostrarEstado();

                        if (!zombie.estaVivo()) {
                            System.out.println(zombie.getNombre() + " ha caído.");
                            break;
                        }

                        int dañoZombie = zombie.atacar();
                        mago.recibirDanio(dañoZombie);
                        System.out.println(zombie.getNombre() + " ataca y hace " + dañoZombie + " de daño a " + mago.nombre + "!");
                        mago.mostrarEstado();
                    }
                    break;

                case 2: 
                    while (mago.puntosVida > 0 && vampiro.estaVivo()) {
                        int dañoMago = random.nextInt(11) + 10; 
                        vampiro.recibirDanio(dañoMago);
                        System.out.println(mago.nombre + " lanza un hechizo y hace " + dañoMago + " de daño a " + vampiro.getNombre() + "!");
                        vampiro.mostrarEstado();

                        if (!vampiro.estaVivo()) {
                            System.out.println(vampiro.getNombre() + " ha caído.");
                            break;
                        }

                        int dañoVampiro = vampiro.atacar();
                        mago.recibirDanio(dañoVampiro);
                        System.out.println(vampiro.getNombre() + " ataca y hace " + dañoVampiro + " de daño a " + mago.nombre + "!");
                        mago.mostrarEstado();
                    }
                    break;

                case 3: 
                    jefe.hablar();
                    while (mago.puntosVida > 0 && jefe.estaVivo()) {
                        int dañoMago = random.nextInt(11) + 10; 
                        jefe.recibirDanio(dañoMago);
                        System.out.println(mago.nombre + " lanza un hechizo y hace " + dañoMago + " de daño a " + jefe.getNombre() + "!");
                        jefe.mostrarEstado();

                        if (!jefe.estaVivo()) {
                            System.out.println(jefe.getNombre() + " ha caído. ¡Has ganado!");
                            break;
                        }

                        int dañoJefe = jefe.atacar();
                        mago.recibirDanio(dañoJefe);
                        System.out.println(jefe.getNombre() + " ataca y hace " + dañoJefe + " de daño a " + mago.nombre + "!");
                        mago.mostrarEstado();
                    }
                    break;

                case 4: 
                    jefe.hablar();
                    break;

                case 5:
                    jugando = false;
                    System.out.println("Gracias por jugar!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige otra acción.");
            }

            if (mago.puntosVida <= 0) {
                System.out.println(mago.nombre + " ha caído. ¡Juego terminado!");
                jugando = false;
            }
        }

        scanner.close();
    }
}

