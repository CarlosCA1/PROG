import java.util.*;

public class boletin13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Double> positivos = new ArrayList<>();
        Collection<Double> negativos = new ArrayList<>();

        System.out.println("Introduce números reais (0 para rematar):");
        double n;
        while ((n = sc.nextDouble()) != 0) {
            if (n > 0) positivos.add(n);
            else negativos.add(n);
        }

        System.out.println("\nPositivos: " + positivos);
        System.out.println("Suma positivos: " + suma(positivos));
        System.out.println("Negativos: " + negativos);
        System.out.println("Suma negativos: " + suma(negativos));

        // Eliminar > 10 e < -10
        positivos.removeIf(x -> x > 10);
        negativos.removeIf(x -> x < -10);

        System.out.println("\nPositivos (filtrados): " + positivos);
        System.out.println("Negativos (filtrados): " + negativos);
    }

    public static double suma(Collection<Double> col) {
        double suma = 0;
        for (double x : col) suma += x;
        return suma;
    }
}

