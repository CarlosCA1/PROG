package org.example;
import java.util.Scanner;

/**
 * Recibe como dato de entrada o valor dunha temperatura expresada en graos centígrados e calcula o seu equivalente en graos Fahrenheit e graos Kelvin.
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin_2_extra_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura (ºC): ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit + "ºF");
        System.out.println("Temperatura en Kelvin: " + kelvin + "K");
        scanner.close();
    }
}
