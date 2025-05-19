import java.util.*;

public class boletin13_3 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Inserir 100 números aleatorios entre 1 e 10
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1); // (0-9) + 1 = 1 a 10
        }

        // Mostrar a colección orixinal
        System.out.println("Colección orixinal:");
        System.out.println(numeros);

        // Eliminar os elementos con valor 5 ou 7 usando un iterador
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int valor = it.next();
            if (valor == 5 || valor == 7) {
                it.remove(); // eliminar usando o iterador
            }
        }

        // Mostrar a colección despois da eliminación
        System.out.println("\nColección despois de eliminar 5 e 7:");
        System.out.println(numeros);
    }
}

