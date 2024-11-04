/**
 * Solicita ao usuario un número n e debuxa un triángulo de base e altura n.
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

