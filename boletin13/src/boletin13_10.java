import java.io.*;
import java.util.*;

public class boletin13_10 {

    private static Map<String, Integer> inventario = new HashMap<>();
    private static final String FICHEIRO = "/home/dam/PROGRAMACIÓN/boletin13/src/inventario.dat";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarDatos();

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcion) {
                case 1 -> darDeAlta();
                case 2 -> darDeBaixa();
                case 3 -> actualizarCantidade();
                case 4 -> visualizarProdutos();
                case 5 -> {
                    gardarDatos();
                    System.out.println("Saíndo... Datos gardados.");
                }
                default -> System.out.println("Opción inválida, intenta de novo.");
            }

        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Xestor Repostos ---");
        System.out.println("1. Dar de alta produto");
        System.out.println("2. Dar de baixa produto");
        System.out.println("3. Actualizar cantidade");
        System.out.println("4. Visualizar produtos e cantidades");
        System.out.println("5. Saír");
        System.out.print("Elixe opción: ");
    }

    private static void darDeAlta() {
        System.out.print("Código produto: ");
        String codigo = sc.nextLine().trim();

        if (inventario.containsKey(codigo)) {
            System.out.println("O produto xa existe. Usa actualizar cantidade.");
            return;
        }

        System.out.print("Cantidade inicial: ");
        try {
            int cant = Integer.parseInt(sc.nextLine());
            if (cant < 0) {
                System.out.println("Cantidade non pode ser negativa.");
                return;
            }
            inventario.put(codigo, cant);
            System.out.println("Produto engadido.");
        } catch (NumberFormatException e) {
            System.out.println("Cantidade inválida.");
        }
    }

    private static void darDeBaixa() {
        System.out.print("Código produto a eliminar: ");
        String codigo = sc.nextLine().trim();

        if (inventario.remove(codigo) != null) {
            System.out.println("Produto eliminado.");
        } else {
            System.out.println("Produto non existe.");
        }
    }

    private static void actualizarCantidade() {
        System.out.print("Código produto: ");
        String codigo = sc.nextLine().trim();

        if (!inventario.containsKey(codigo)) {
            System.out.println("Produto non existe.");
            return;
        }

        System.out.print("Nova cantidade: ");
        try {
            int cant = Integer.parseInt(sc.nextLine());
            if (cant < 0) {
                System.out.println("Cantidade non pode ser negativa.");
                return;
            }
            inventario.put(codigo, cant);
            System.out.println("Cantidade actualizada.");
        } catch (NumberFormatException e) {
            System.out.println("Cantidade inválida.");
        }
    }

    private static void visualizarProdutos() {
        if (inventario.isEmpty()) {
            System.out.println("Non hai produtos rexistrados.");
            return;
        }
        System.out.println("\nProdutos e cantidades:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.printf("Código: %s, Cantidade: %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void gardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            oos.writeObject(inventario);
        } catch (IOException e) {
            System.out.println("Erro ao gardar datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarDatos() {
        File ficheiro = new File(FICHEIRO);
        if (!ficheiro.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro))) {
            inventario = (Map<String, Integer>) ois.readObject();
            System.out.println("Datos cargados do ficheiro.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao cargar datos: " + e.getMessage());
        }
    }
}
