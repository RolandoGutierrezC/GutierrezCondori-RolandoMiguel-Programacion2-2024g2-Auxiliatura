import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorPalabras {

    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        char letraMinuscula = Character.toLowerCase(letra);

        for (String palabra : palabras) {
            if (Character.toLowerCase(palabra.charAt(0)) == letraMinuscula) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaDePalabras = new ArrayList<>();
        System.out.println("PARA TERMINAR DE INGRESAR LAS LETRAS ESCRIBIR: fin");
        System.out.println("Ingresa las palabras:");
        while (true) {
            String palabra = scanner.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            listaDePalabras.add(palabra);
        }

        System.out.println("Ingresa la letra a buscar:");
        char letraABuscar = scanner.nextLine().charAt(0);

        int resultado = contarPalabrasConLetra(listaDePalabras, letraABuscar);
        System.out.println("Cantidad de palabras que comienzan con '" + letraABuscar + "': " + resultado);
        
        scanner.close();
    }
}

