import java.io.*;
import java.util.*;

public class boletin12_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o nome do ficheiro (.txt): ");
        String nomeFicheiro = sc.nextLine();

        Map<String, Integer> frecuencias = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeFicheiro))) {
            String liña;
            while ((liña = br.readLine()) != null) {
                // Limpar liña: eliminar puntuación, pasar a minúsculas
                liña = liña.replaceAll("[^a-zA-ZáéíóúüñÁÉÍÓÚÜÑ0-9\\s]", "").toLowerCase();
                String[] palabras = liña.split("\\s+");

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            // Mostrar por pantalla
            System.out.println("\n--- FRECUENCIA DE PALABRAS ---");
            for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }

            // Gardar no ficheiro resumo
            try (PrintWriter pw = new PrintWriter("/home/dam/PROGRAMACIÓN/boletin_12/src/resumo_palabras.txt")) {
                for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
                    pw.println(entrada.getKey() + ": " + entrada.getValue());
                }
            }

            System.out.println("\nResumo gardado en '/home/dam/PROGRAMACIÓN/boletin_12/src/resumo_palabras.txt'.");

        } catch (FileNotFoundException e) {
            System.out.println("O ficheiro non existe.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
