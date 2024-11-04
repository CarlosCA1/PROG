/**
 * Pide un número e como resultado nos dá o factorial no número (n!).
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

