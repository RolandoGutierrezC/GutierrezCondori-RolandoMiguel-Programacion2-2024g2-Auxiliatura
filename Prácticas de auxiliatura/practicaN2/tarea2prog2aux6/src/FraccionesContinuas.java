import java.util.Scanner;

public class FraccionesContinuas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();

        if (N < 0) {
            System.out.println("N debe ser un entero no negativo.");
            return;
        }

        int numerador = calcularNumerador(N);
        System.out.println("El numerador de P_" + N + " es: " + numerador);
    }

    public static int calcularNumerador(int N) {
        if (N == 0) return 1; 

        int numerador = 1; 
        int denominador = 1; 

        for (int i = 1; i < N; i++) {
            int temp = denominador;
            denominador = numerador + denominador;
            numerador = temp;
        }

        return numerador;
    }
}

