import java.io.*;

public class CreacionFicheiroBinarioParesImpares {
        public CreacionFicheiroBinarioParesImpares (String rutaFicheiro){
            ObjectInputStream fluxoEntrada = null;
            ObjectOutputStream fluxoSaidaPares = null, fluxoSaidaImpares=null;
            try {
                fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
                fluxoSaidaPares = new ObjectOutputStream(new FileOutputStream("numerosPares.dat"));
                fluxoSaidaImpares = new ObjectOutputStream(new FileOutputStream("numerosImpares.dat"));
                int num;
                while (fluxoEntrada.available()>0) {
                    num = fluxoEntrada.readInt();
                    System.out.println(num);
                    if (num % 2 == 0) fluxoSaidaPares.writeInt(num);
                    else fluxoSaidaImpares.writeInt(num);
                }
                System.out.println("Non hai máis números para ler");
            } catch (FileNotFoundException e ) {
                System.out.println("Erro: Ficheiro non encontrado" + e.getMessage());
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
                if(fluxoSaidaPares!=null) {
                    try{
                        fluxoSaidaPares.close();
                    } catch (IOException e){
                        System.out.println("Erro: pechando o ficheiro");
                    }
                }
                if(fluxoSaidaImpares!=null) {
                    try{
                        fluxoSaidaImpares.close();
                    } catch (IOException e){
                        System.out.println("Erro: pechando o ficheiro");
                    }
                }
            }
        }}


