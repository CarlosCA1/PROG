//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

/**
 * Calcula la cantidad de números positivos, negativos y ceros que hay en un grupo de 10 números enteros.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteiros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        scanner.close();
    }
}
