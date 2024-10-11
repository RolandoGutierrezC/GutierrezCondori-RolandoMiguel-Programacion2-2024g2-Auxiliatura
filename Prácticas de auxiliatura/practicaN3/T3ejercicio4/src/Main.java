import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el nombre del Mago: ");
        String nombreMago = scanner.nextLine();
        int nivelMago = random.nextInt(10) + 1; 
        Mago mago = new Mago(nombreMago, nivelMago, 100, random.nextInt(100) + 1);

        System.out.print("Ingresa el nombre del Guerrero: ");
        String nombreGuerrero = scanner.nextLine();
        int nivelGuerrero = random.nextInt(10) + 1;
        Guerrero guerrero = new Guerrero(nombreGuerrero, nivelGuerrero, 100, random.nextInt(100) + 1);

        System.out.println("\n¡Comienza la batalla entre " + mago.nombre + " y " + guerrero.nombre + "!");
        
        while (mago.puntosVida > 0 && guerrero.puntosVida > 0) {
            if (random.nextBoolean()) {
                int danioMago = random.nextInt(11) + 10;
                guerrero.recibirDanio(danioMago);
                System.out.println(mago.nombre + " lanza un hechizo y hace " + danioMago + " de daño a " + guerrero.nombre + "!");
                mago.lanzarHechizo();
                guerrero.mostrarEstado();

                if (guerrero.puntosVida <= 0) {
                    System.out.println(guerrero.nombre + " ha caído. " + mago.nombre + " gana la batalla!");
                    break;
                }
            } else {
                int danioGuerrero = random.nextInt(11) + 10;
                mago.recibirDanio(danioGuerrero);
                System.out.println(guerrero.nombre + " ataca y hace " + danioGuerrero + " de daño a " + mago.nombre + "!");
                guerrero.atacar();
                mago.mostrarEstado();

                if (mago.puntosVida <= 0) {
                    System.out.println(mago.nombre + " ha caído. " + guerrero.nombre + " gana la batalla!");
                    break;
                }
            }
        }

        scanner.close();
    }
}

