/**
 * Calcula a área dun rectángulo cuxa base e altura pides por teclado. Asegúrase de que estes valores sexan positivos.
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base (m): ");
        double base = scanner.nextDouble();
        System.out.print("Introduzca la altura (m): ");
        double altura = scanner.nextDouble();
        double area= base*altura/2;
        if (base>0) {
            if (altura>0)
            System.out.println("El área es de " + area + " m");
        }
        else {
                System.out.println("Los dos valores han de ser positivos");
            }
    }
}
