import java.util.Scanner;

public class Joyero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("tamaño:");
        int N = scanner.nextInt();
        
        int[][] matrizActual = new int[N][N];
        System.out.println("elementos:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizActual[i][j] = scanner.nextInt();
            }
        }
        
        int[][] matrizOriginal = generarMatrizOriginal(N);
        
        int rotaciones = determinarRotaciones(matrizOriginal, matrizActual, N);
        
        System.out.println("Número de rotaciones antihorarias necesarias: " + rotaciones);
        scanner.close();
    }

    private static int[][] generarMatrizOriginal(int N) {
        int[][] matriz = new int[N][N];
        int valor = 1;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }
    
    private static int determinarRotaciones(int[][] original, int[][] actual, int N) {
        for (int rotaciones = 0; rotaciones < 4; rotaciones++) {
            if (sonMatricesIguales(original, actual, N)) {
                return rotaciones;
            }
            actual = rotarAntihorario(actual, N);
        }
        return -1;
    }
    
    private static int[][] rotarAntihorario(int[][] matriz, int N) {
        int[][] nuevaMatriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nuevaMatriz[N - 1 - j][i] = matriz[i][j];
            }
        }
        return nuevaMatriz;
    }
    
    private static boolean sonMatricesIguales(int[][] matriz1, int[][] matriz2, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


