/**
 * Solicita un número e, visualiza a táboa de multiplicar dese número. O programa remata cando prememos o cero.
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);{
            int numero = 0;
            do {
                System.out.println("Introduce un número (0 para salir): ");
                numero = sc.nextInt();
                if (numero != 0) {
                    System.out.println("La tabla del " + numero + " es: ");
                    System.out.println(numero + " x 1 = " + numero*1);
                    System.out.println(numero + " x 2 = " + numero*2);
                    System.out.println(numero + " x 3 = " + numero*3);
                    System.out.println(numero + " x 4 = " + numero*4);
                    System.out.println(numero + " x 5 = " + numero*5);
                    System.out.println(numero + " x 6 = " + numero*6);
                    System.out.println(numero + " x 7 = " + numero*7);
                    System.out.println(numero + " x 8 = " + numero*8);
                    System.out.println(numero + " x 9 = " + numero*9);
                    System.out.println(numero + " x 10 = " + numero*10);
                }
            } while (numero != 0);
            System.out.println("Fin");

        }
    }
}
