import java.util.*;

public class boletin13_2 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Xeramos 100 números aleatorios entre 1 e 10
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1); // (0-9) + 1 => 1 a 10
        }

        // Mostramos a colección orixinal
        System.out.println("Colección orixinal (100 números aleatorios):");
        System.out.println(numeros);

        // Eliminamos todos os 5 e 7
        numeros.removeIf(n -> n == 5 || n == 7);

        // Mostramos a colección despois da eliminación
        System.out.println("\nColección despois de eliminar 5 e 7:");
        System.out.println(numeros);
    }
}
