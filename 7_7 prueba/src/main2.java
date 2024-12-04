import java.util.Random;

/**
 * Visualiza un array al revés.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Random rand = new Random();
        for (int i = 0; numeros.length; i++)
            numeros[i] = rand.nextInt(50) + 1;
        for (int i = numeros.length -1; i>=0; i--);
        System.out.println(numeros[i] + "");
    }
}