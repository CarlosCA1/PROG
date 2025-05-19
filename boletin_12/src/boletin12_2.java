import java.io.*;
import java.util.*;

public class boletin12_2 {

    private static final String FILE_NAME = "/home/dam/PROGRAMACIÓN/boletin_12/src/notas.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ XESTOR DE NOTAS ---");
            System.out.println("1. Engadir nova nota");
            System.out.println("2. Listar todas as notas");
            System.out.println("3. Buscar por palabra clave");
            System.out.println("0. Saír");
            System.out.print("Elixe unha opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcion) {
                case 1 -> engadirNota(sc);
                case 2 -> listarNotas();
                case 3 -> buscarNotas(sc);
                case 0 -> System.out.println("Ata logo!");
                default -> System.out.println("Opción non válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void engadirNota(Scanner sc) {
        System.out.print("Escribe a nota: ");
        String nota = sc.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nota);
            bw.newLine();
            System.out.println("Nota gardada correctamente.");
        } catch (IOException e) {
            System.out.println("Erro ao gardar a nota: " + e.getMessage());
        }
    }

    private static void listarNotas() {
        System.out.println("\n--- NOTAS GARDADAS ---");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String liña;
            int contador = 1;
            while ((liña = br.readLine()) != null) {
                System.out.println(contador + ". " + liña);
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Aínda non hai notas gardadas.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }

    private static void buscarNotas(Scanner sc) {
        System.out.print("Introduce a palabra clave: ");
        String palabra = sc.nextLine().toLowerCase();

        System.out.println("\n--- RESULTADOS DA BUSCA ---");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String liña;
            int contador = 1;
            boolean atopado = false;
            while ((liña = br.readLine()) != null) {
                if (liña.toLowerCase().contains(palabra)) {
                    System.out.println(contador + ". " + liña);
                    atopado = true;
                }
                contador++;
            }
            if (!atopado) {
                System.out.println("Non se atoparon notas con esa palabra.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Aínda non hai notas gardadas.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
