import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class boletin13_9 {

    private static List<Double> temperaturas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarDatos();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcion) {
                case 1 -> novoRexistro();
                case 2 -> listarRexistros();
                case 3 -> mostrarEstatistica();
                case 4 -> {
                    gardarDatos();
                    System.out.println("Saíndo... Datos gardados.");
                }
                default -> System.out.println("Opción inválida, intenta de novo.");
            }

        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Novo rexistro");
        System.out.println("2. Listar rexistros");
        System.out.println("3. Mostrar estatística");
        System.out.println("4. Saír");
        System.out.print("Elixe opción: ");
    }

    private static void novoRexistro() {
        System.out.print("Introduce temperatura (ºC): ");
        try {
            double temp = Double.parseDouble(sc.nextLine());
            temperaturas.add(temp);
            System.out.println("Temperatura engadida.");
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido, intenta de novo.");
        }
    }

    private static void listarRexistros() {
        if (temperaturas.isEmpty()) {
            System.out.println("Non hai rexistros.");
            return;
        }
        System.out.println("Rexistros de temperaturas:");
        for (int i = 0; i < temperaturas.size(); i++) {
            System.out.printf("Rexistro %d: %.2f ºC%n", i + 1, temperaturas.get(i));
        }
    }

    private static void mostrarEstatistica() {
        if (temperaturas.isEmpty()) {
            System.out.println("Non hai datos para calcular estatísticas.");
            return;
        }
        double max = Collections.max(temperaturas);
        double min = Collections.min(temperaturas);
        double suma = 0;
        for (double t : temperaturas) {
            suma += t;
        }
        double media = suma / temperaturas.size();

        System.out.printf("Máximo: %.2f ºC%n", max);
        System.out.printf("Mínimo: %.2f ºC%n", min);
        System.out.printf("Promedio: %.2f ºC%n", media);
    }

    private static void gardarDatos() {
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nomeFicheiro = "rexistros" + data + ".dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFicheiro))) {
            oos.writeObject(temperaturas);
        } catch (IOException e) {
            System.out.println("Erro ao gardar os datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarDatos() {
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nomeFicheiro = "rexistros" + data + ".dat";

        File ficheiro = new File(nomeFicheiro);
        if (ficheiro.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro))) {
                temperaturas = (List<Double>) ois.readObject();
                System.out.println("Datos cargados do ficheiro " + nomeFicheiro);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao cargar datos: " + e.getMessage());
            }
        }
    }
}
