package org.example;
import java.util.Scanner;

/**
 * Si el número es positivo, imprime ese mismo número + "é positivo".
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = scanner.nextDouble();
        if (num1 > 0) {
            System.out.println(num1 + " é positivo");
        }
    }
}