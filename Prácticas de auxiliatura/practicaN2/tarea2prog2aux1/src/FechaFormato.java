import java.util.*;

public class FechaFormato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir la fecha como el siguiente ejemplo: '4 de agosto, 2004': ");
        String entrada = scanner.nextLine();

        procesarFecha(entrada);

        scanner.close();
    }

    public static void procesarFecha(String entrada) {
        String[] partes = entrada.split(" de ");
        if (partes.length != 2) {
            System.out.println("Formato de entrada incorrecto.");
            return;
        }

        String diaStr = partes[0].trim();
        String resto = partes[1].trim();
        
        String[] restoPartes = resto.split(", ");
        if (restoPartes.length != 2) {
            System.out.println("Formato de entrada incorrecto.");
            return;
        }

        String mesStr = restoPartes[0].trim();
        String anioStr = restoPartes[1].trim();

        int dia, anio;
        try {
            dia = Integer.parseInt(diaStr);
            anio = Integer.parseInt(anioStr);
        } catch (NumberFormatException e) {
            System.out.println("Día o año no válidos.");
            return;
        }

        int mes = convertirMesAEntero(mesStr);
        if (mes == -1) {
            System.out.println("Nombre del mes no válido.");
            return;
        }

        if (esFechaValida(dia, mes, anio)) {
            System.out.printf("Fecha válida: %d/%02d/%04d\n", dia, mes, anio);
            System.out.printf("finalizar programa para ingresar otra fecha");
        } else {
            System.out.println("Fecha no válida.");
        }
    }

    public static int convertirMesAEntero(String mes) {
        switch (mes.toLowerCase()) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: return -1;
        }
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > diasEnMes(mes, anio)) return false;
        return true;
    }

    public static int diasEnMes(int mes, int anio) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (esAnioBisiesto(anio)) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean esAnioBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return (anio % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

