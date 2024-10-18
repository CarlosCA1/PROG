package org.example;
import java.util.Scanner;

/**
 * Si el número 1 uno es mayor que el 2, imprime la resta y la suma de los dos números, sino solo la suma.
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin__3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        short num1 = Short.reverseBytes(scanner.nextShort());
        System.out.println("Introduce outro número: ");
        short num2 = Short.reverseBytes(scanner.nextShort());

        if (num1 >= num2) {
            System.out.println(num1 - num2);
        }
        System.out.println(num1 + num2);
        scanner.close();
    }
}