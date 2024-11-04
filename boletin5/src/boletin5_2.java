/**
 * Realiza un programa que calcula a suma e o produto dos números comprendidos entre 10 e 90.
 * @version 1.0
 * @author Carlos Costas
 */

public class boletin5_2 {
    public static void main(String[] args) {
        int suma = 0;
        long produto = 1;

        for (int i = 10; i <= 90; i++) {
            suma += i;
            produto *= i;
        }

        System.out.println("A suma dos números entre 10 e 90 é: " + suma);
        System.out.println("O produto dos números entre 10 e 90 é: " + produto);
    }
}

