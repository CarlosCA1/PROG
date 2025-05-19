import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MediaSumaFicheiroNumeros {
    public MediaSumaFicheiroNumeros(String rutaFicheiro) {
        BufferedReader entrada = null; // Declarar aquí para que esté accesible en finally
        try {
            int suma = 0, cantidade = 0;
            entrada = new BufferedReader(new FileReader(rutaFicheiro));
            String liña = entrada.readLine();
            while (liña != null) {
                String[] numeros = liña.split(" ");
                for (String num : numeros) {
                    if (!num.isEmpty()) { // Asegurarse de que no hay cadenas vacías
                        suma += Integer.parseInt(num);
                        cantidade++;
                    }
                }
                liña = entrada.readLine(); // leer la siguiente línea
            }
            System.out.println("Suma: " + suma);
            if (cantidade > 0) {
                System.out.println("Media: " + (double) suma / cantidade);
            } else {
                System.out.println("Non hai números para calcular a media.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro non encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Erro ao pechar o ficheiro: " + e.getMessage());
                }
            }
        }
    }
}

