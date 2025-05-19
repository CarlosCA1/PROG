import java.util.*;

public class boletin13_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> positivos = new ArrayList<>();
        List<Double> negativos = new ArrayList<>();

        double num;

        System.out.println("Introduce números reais (0 para rematar):");

        // Entrada de datos
        do {
            System.out.print("Número: ");
            num = sc.nextDouble();

            if (num > 0) {
                positivos.add(num);
            } else if (num < 0) {
                negativos.add(num);
            }

        } while (num != 0);

        // Mostrar coleccións e sumas
        System.out.println("\nPositivos: " + positivos);
        System.out.println("Suma positivos: " + suma(positivos));

        System.out.println("\nNegativos: " + negativos);
        System.out.println("Suma negativos: " + suma(negativos));

        // Eliminar valores extremos
        eliminarExtremos(positivos, 10.0, true);
        eliminarExtremos(negativos, -10.0, false);

        // Mostrar coleccións despois da eliminación
        System.out.println("\nPositivos tras eliminar maiores de 10: " + positivos);
        System.out.println("Negativos tras eliminar menores de -10: " + negativos);

        sc.close();
    }

    // Método para calcular a suma dunha lista de Doubles
    public static double suma(List<Double> lista) {
        double total = 0;
        for (double n : lista) {
            total += n;
        }
        return total;
    }

    // Método para eliminar valores segundo a condición
    public static void eliminarExtremos(List<Double> lista, double limiar, boolean maiorQue) {
        Iterator<Double> it = lista.iterator();
        while (it.hasNext()) {
            double valor = it.next();
            if (maiorQue && valor > limiar) {
                it.remove();
            } else if (!maiorQue && valor < limiar) {
                it.remove();
            }
        }
    }
}
