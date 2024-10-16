package org.example;
import java.util.Scanner;

/**
 * De 3 números, imprime el mayor
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin__3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce outro número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introduce outro número: ");
        double num3 = scanner.nextDouble();

        if (num1>num2) {
            if (num1>num3)
                System.out.println("O maior é " + num1);
        }

        if (num2>num1) {
            if (num2>num3)
                System.out.println("O maior é " + num2);
        }

        if (num3>num2) {
            if (num3>num1)
                System.out.println("O maior é " + num3);
        }
        scanner.close();
    }
}