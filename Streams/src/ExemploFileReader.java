import java.io.FileReader;
import java.io.IOException;

public class ExemploFileReader {
        public ExemploFileReader(String ruta){
        String texto = "";
        FileReader entrada=null;
        try{
            entrada = new FileReader(ruta);
            int caracter;
            caracter = entrada.read();
            while (caracter != -1) {
                texto = texto + (char) caracter;
                caracter = entrada.read();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        } finally {
            if(entrada!= null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("O texto do ficheiro é: \n" + texto);
    }
}
