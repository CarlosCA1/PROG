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

    public void añadirPrimero (int nValor) {
        Nodo nuevoNodo = new Nodo(nValor, this.nodoInicial);
        this.nodoInicial = nuevoNodo;
        this.tamaño++;
    }

    public void eliminarPrimero (){
        if (!estaVacia()){
            nodoInicial = nodoInicial.getNodoSiguiente();
            tamaño--;
        }
    }
    public void eliminarUltimo (){
        if (!estaVacia()){
            Nodo nodoAnterior =null;
            if (tamaño != 1) {
                Nodo nodoActual = nodoInicial;
                while(nodoActual.getNodoSiguiente()!=null){
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getNodoSiguiente();
                }
                nodoAnterior.setNodoSiguiente(null);
            } else {
                nodoInicial=null;
                }
            tamaño--;
            }
        }

        public void mostrarValoresLista(){
            if (!estaVacia()){
                if(tamaño!=1){
                    Nodo nodoActual = nodoInicial;
                    while(nodoActual.getNodoSiguiente()!=null){
                        System.out.println(nodoActual.getValor());
                        nodoActual=nodoActual.getNodoSiguiente();
                    }
                    System.out.println(nodoActual.getValor());
                } else System.out.println(nodoInicial.getValor());
            }
    }
    public int getNodo(int indice){
        if (indice>tamaño-1 || indice < 0){
            System.out.println("Índice incorrecto, retornamos -1");
            return -1;
        } else{
            Nodo nodo= nodoInicial;
            for (int i =0; i<indice; i++){
                nodo = nodo.getNodoSiguiente();
            }
            return nodo.getValor();
        }
    }
}

