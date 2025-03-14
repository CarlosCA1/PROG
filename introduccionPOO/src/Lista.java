/*
Constructor con tabla con 0 elementos
Obtener número de elementos
Insertar número al final de la lista
Insertar número al principio de la lista
Insertar número en un lugar de la lista especificado por un índice
Obtener un elemento especificado por un índice
Buscar un número en la lista, devolviendo el índice del primer lugar en que se encuentre
Devolverá -1 si no lo encuentra
Muestra elementos de la lista por consola
 */

import java.util.Arrays;

public class Lista {
    private int lista[];

    public Lista () {
        this.lista = new int[0];
    }

    public int numeroElementos() {
        return lista.length;
    }

    public void insertarFinal(int nuevo) {
        int[] nuevaLista = new int[numeroElementos() + 1];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[nuevaLista.length - 1] = nuevo;
        lista = nuevaLista;
    }

    public int retirarElementoFinal() {
        if (numeroElementos() == 0) {
            System.out.println("No hay elementos para retirar");
            return -1;
        } else {
            int valorElemento = lista[numeroElementos() - 1];
            lista = Arrays.copyOf(lista, numeroElementos() - 1);
            return valorElemento;
        }
    }
}

