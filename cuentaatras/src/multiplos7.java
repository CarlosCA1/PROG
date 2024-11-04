/**
 * Imprime los múltiplos de 7 del 1 al 100.
 * @version 1.0
 * @author Carlos Costas
 */

public class multiplos7 {
        public static void main(String[] args) {
            for (int i = 1; i <= 14; i++) {
                int multiplo = 7 * i;
                System.out.println(multiplo);
            }
            for (int i = 1; 7*i<100; i++) {
                int multiplo = 7 * i;
                System.out.println(multiplo);
            }
        }
    }

