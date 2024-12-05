import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {
        /**
         * Hace una copia de un array.
         * @version 1.0
         * @author Carlos Costas
         */

        public class boletin7_7 {
            public static void main(String[] args) {
                int lista[] = new int[10];
                for (int i = 0; i < lista.length; i++) {
                    lista[i] = i * 2;
                }
                int[] novaLista = copiaLista(lista);
                for (int elemento : novaLista) {
                    System.out.println(elemento);
                }
                int[] listaP = listaPares(lista);
                for (int elemento : listaP) {
                    System.out.println(elemento);
                }

                int[] tabla2 = {2, 4, 4, 2, 5, 6, 9, , 2, 3, 4};
                for (int elemento : sinRepetidos(tabla2))
                    System.out.println(tabla2);
            }

                public static int[] copiaLista ( int[] listaACopiar){
                    int[] novaLista;
                    novaLista = new int[listaACopiar.length];
                    for (int i = 0; i < novaLista.length; i++)
                        novaLista[i] = listaACopiar[i];
                }
                return novaLista;
            }

            public static int[] listaPares ( int[] listaAAnalizar){
                int numPares = 0;
                for(int numero: listaAAnalizar){
                    if (numero%2 == 0) numPares;
                }
                int [] listaPares = new int [numPares];
                for (int i = 0, iPares = 0; i< listaPares.length; i++){
                    if (listaAAnalizar[i]%2 == 0) {
                        listaPares[iPares] = listaAAnalizar[i];
                        iPares++;
                    }
                }
                return listaPares;

                public static int [] sinRepetidos (int[] tabla){
                    int[]temporal=new int [0];
                    temporal [0]= tabla[0];
                    for (int elemento:tabla){
                        if (binarySearch (temporal, elemento) < 0);
                        int [] nuevo = int [temporal.length+1];
                        for (int i=0; i<temporal.length; i++) {
                            nuevo[i] = temporal[i];
                        }
                        nuevo [temporal.length] = elemento;
                        temporal = nuevo;
                        return temporal;
                    }
                }
            }
        }
    }
}