import java.util.Scanner;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public double sumar(double a, double escalar) {
        return a + escalar;
    }

    public double restar(double a, double escalar) {
        return a - escalar;
    }

    public double multiplicar(double a, double escalar) {
        return a * escalar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Ingrese dos números para operaciones básicas:");

        System.out.print("Número 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Número 2: ");
        double num2 = scanner.nextDouble();

        double suma = calc.sumar(num1, num2);
        double resta = calc.restar(num1, num2);
        double multiplicacion = calc.multiplicar(num1, num2);
        double division = calc.dividir(num1, num2);

        System.out.println("\nOperaciones básicas con números:");
        System.out.println(num1 + " y " + num2);
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);

        double escalar = suma;
    
        System.out.println("\nOperaciones escalares con número: " + num1 + " y escalar derivado: " + escalar);

        double sumaEscalar = calc.sumar(num1, escalar);
        double restaEscalar = calc.restar(num1, escalar);
        double multiplicacionEscalar = calc.multiplicar(num1, escalar);

        System.out.println("Suma escalar: " + num1 + " + " + escalar + " = " + sumaEscalar);
        System.out.println("Resta escalar: " + num1 + " - " + escalar + " = " + restaEscalar);
        System.out.println("Multiplicación escalar: " + num1 + " * " + escalar + " = " + multiplicacionEscalar);

        scanner.close();
    }
}

