import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario (String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            int num;
            while (true) {
                num = fluxoEntrada.readInt();
                System.out.println(num);
            }
            } catch (FileNotFoundException e ) {
            System.out.println("Erro: Ficheiro non encontrado" + e.getMessage());
        } catch (EOFException e){
                System.out.println("Non hai máis números a ler, chegouse á fin do ficheiro");
            } catch (IOException e){
                System.out.println("Erro: Entrada/Saída" + e.getMessage());
            } finally{
            if(fluxoEntrada!=null) {
                try{
                fluxoEntrada.close();
            } catch (IOException e){
                    System.out.println("Erro: pechando o ficheiro");
                }
        }
    }
}}
