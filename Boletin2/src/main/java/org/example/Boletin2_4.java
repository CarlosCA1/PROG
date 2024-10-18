package org.example;
import java.util.Scanner;

/**
 * Le 2 números e calcula : 1º a suma , despois a resta, a continuación o producto e por último o cociente. Amosa o resultado de cada operación.
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);

        scanner.close();
    }
}