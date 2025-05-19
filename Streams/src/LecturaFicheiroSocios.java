import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaFicheiroSocios {
    public LecturaFicheiroSocios(String ruta) {
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("socios.dat"));
            System.out.println(fluxoEntrada.available());
            while (true) {
                Socio s = (Socio) fluxoEntrada.readObject();
                System.out.println(s.nome);
                System.out.println(s.toString());
            }
        } catch (EOFException e){
            System.out.println("Non hai máis rexistros para ler");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
