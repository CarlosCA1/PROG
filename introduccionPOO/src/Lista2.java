/*
nodoInicial nodo
tamaño int
estaVacia boolean
getTamaño int
añadirUltimo(valor:int) void
"Primero
listar void recorrer elementos e imprimir el valor
obtenerUltimo int
"Primero
*/

public class Lista2 {
    private Nodo nodoInicial;
    private int tamaño;

    public Lista2 (){
        this.nodoInicial = null;
        tamaño = 0;
    }

    public Lista2(Nodo nodoInicial){
        this.nodoInicial = nodoInicial;
        tamaño = 1;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return nodoInicial == null;
    }

    public void añadirUltimo(int valor) {
        Nodo nuevoNodo = new Nodo(valor, null);


        if (estaVacia()) {
            nodoInicial = nuevoNodo;
        } else {
            Nodo nodoActual = nodoInicial;

            while (nodoActual.getNodoSiguiente() != null) {
                nodoActual = nodoActual.getNodoSiguiente();
            }

            nodoActual.setNodoSiguiente(nuevoNodo);
        }

        tamaño++;
    }
}

