import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferedReader {
    public ExemploBufferedReader(String rutaFicheiro) {
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader("/home/dam/PROGRAMACIÓN/Streams/src/FicheiroTexto"));
            String liña = entrada.readLine();
            while (liña != null) {
                System.out.println(liña);
                liña = entrada.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada do ficheiro: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }}
