import java.util.*;

public class boletin13_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> positivos = new ArrayList<>();
        int num;

        System.out.println("Introduce números enteiros positivos (-1 para rematar):");

        // Entrada de datos
        do {
            System.out.print("Número: ");
            num = sc.nextInt();

            if (num >= 0) {
                positivos.add(num);
            }

        } while (num != -1);

        // Mostrar os valores en índices pares multiplicados por 100
        System.out.println("\nValores en índices pares multiplicados por 100:");
        for (int i = 0; i < positivos.size(); i += 2) {
            int valor = positivos.get(i);
            System.out.println("Índice " + i + ": " + valor + " × 100 = " + (valor * 100));
        }

        sc.close();
    }
}
