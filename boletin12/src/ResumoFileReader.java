import java.io.*;

public class ResumoFileReader {
    public ResumoFileReader(String rutaFicheiro) {
        BufferedReader fluxoEntrada = null;
        try {
            fluxoEntrada = new BufferedReader(new FileReader(rutaFicheiro));
            String linea;
            while ((linea = fluxoEntrada.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    System.out.println(palabra);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Ficheiro non encontrado - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro: Entrada/Saída - " + e.getMessage());
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println("Erro ao pechar o ficheiro.");
                }
            }
        }
    }
}


