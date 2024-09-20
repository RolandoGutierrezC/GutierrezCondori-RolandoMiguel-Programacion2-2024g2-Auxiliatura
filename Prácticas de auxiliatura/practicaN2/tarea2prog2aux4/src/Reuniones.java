import java.util.Scanner;

public class Reuniones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de directores:");
        int N = scanner.nextInt();
        
        System.out.println("Ingrese la duración de la reunión:");
        int K = scanner.nextInt();
        int T = (K - (N - 1)) / N;
        if (T < 0) {
            System.out.println("No es posible realizar la reunión dentro del tiempo de reunión.");
        } else {
            System.out.println("La duración de cada discurso es de : " + T + " minutos.");
        }
        
        scanner.close();
    }
}

