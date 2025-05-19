import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MediaSumaEscaner {
    public MediaSumaEscaner(String rutaFicheiro) {
        Scanner scanner = null;
        try {
            int suma = 0, cantidade = 0;
            scanner = new Scanner(new File(rutaFicheiro));

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    suma += num;
                    cantidade++;
                } else {
                    scanner.next(); // saltar tokens non numéricos
                }
            }

            System.out.println("Suma: " + suma);
            if (cantidade > 0) {
                System.out.println("Media: " + (double) suma / cantidade);
            } else {
                System.out.println("Non hai números para calcular a media.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro non encontrado: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
