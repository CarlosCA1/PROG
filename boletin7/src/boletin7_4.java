/**
 * Calcula la letra del NIF.
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin7_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el número de DNI: ");
        int numero = scanner.nextInt();
        int letra = numero % 23;
        String[] nombres = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        for (int a = 0; a < nombres.length; a++) {
            String letra2 = nombres[letra];
            System.out.println("La letra de tu DNI es la " + letra2);
        }
}
}

