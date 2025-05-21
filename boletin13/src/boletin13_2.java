import java.util.*;

public class boletin13_2 {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Inserir 100 números aleatorios entre 1 e 10
        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(10) + 1);
        }

        System.out.println("Antes da eliminación: " + numeros);

        // Eliminar todos os 5 e 7
        numeros.removeIf(n -> n == 5 || n == 7);

        System.out.println("Despois da eliminación: " + numeros);
    }
}

