import java.util.Arrays;
import java.util.Scanner;

public class MemoriaDeUnDispositivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] resultado = x(numeros);
        
        System.out.println("Lista máxima lexicográficamente:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] x(int[] numeros) {
        int n = numeros.length;
        int maxBits = Integer.toBinaryString(Arrays.stream(numeros).max().getAsInt()).length();
        int[][] bits = new int[maxBits][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < maxBits; j++) {
                bits[j][i] = (numeros[i] >> j) & 1;
            }
        }

        for (int j = maxBits - 1; j >= 0; j--) {
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }

            final int currentBitIndex = j;
            Arrays.sort(indices, (a, b) -> bits[currentBitIndex][b] - bits[currentBitIndex][a]);
            for (int i = 0; i < n; i++) {
                bits[currentBitIndex][indices[i]] = (i < (n - 1 - currentBitIndex)) ? 0 : 1; // Asegúrate de usar la lógica correcta
            }
        }
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < maxBits; j++) {
                resultado[i] |= (bits[j][i] << j);
            }
        }
        return resultado;
    }
}




