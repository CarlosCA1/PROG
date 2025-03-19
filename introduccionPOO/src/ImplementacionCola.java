public class ImplementacionCola extends Lista2 implements Cola {
    public ImplementacionCola(Nodo nodoInicial){
        super();
    }
    public void encolar (int nuevoValor) {
        super.añadirUltimo(nuevoValor);
    }

    public int desencolar (){
        int valor = getNodo(0);
        eliminarPrimero();
        return valor;
    }
}
