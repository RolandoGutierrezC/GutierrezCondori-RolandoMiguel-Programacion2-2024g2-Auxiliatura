import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del personaje: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa el nivel del personaje: ");
        int nivel = scanner.nextInt();
        
        System.out.print("Ingresa los puntos de vida del personaje: ");
        int puntosVida = scanner.nextInt();

        System.out.print("Elige el tipo de personaje (1: Mago, 2: Arquero, 3: Guerrero): ");
        int tipo = scanner.nextInt();

        Personaje personaje = null;
        switch (tipo) {
            case 1:
                System.out.print("Ingresa el mana del mago: ");
                int mana = scanner.nextInt();
                personaje = new Mago(nombre, nivel, puntosVida, mana);
                break;
            case 2:
                System.out.print("Ingresa la destreza del arquero: ");
                int destreza = scanner.nextInt();
                personaje = new Arquero(nombre, nivel, puntosVida, destreza);
                break;
            case 3:
                System.out.print("Ingresa la fuerza del guerrero: ");
                int fuerza = scanner.nextInt();
                personaje = new Guerrero(nombre, nivel, puntosVida, fuerza);
                break;
            default:
                System.out.println("Tipo de personaje no válido.");
        }

        personaje.mostrarEstado();
System.out.print("¿Cuántos ítems deseas agregar al inventario? ");
        int cantidadItems = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidadItems; i++) {
            System.out.print("Ingresa el nombre del ítem " + (i + 1) + ": ");
            String item = scanner.nextLine();
            personaje.getInventario().agregarItem(item);
        }

        personaje.getInventario().mostrarItems();

        scanner.close();
    }
}


