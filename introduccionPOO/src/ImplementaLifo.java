public class ImplementaLifo extends Lista2 implements Lifo {
    public ImplementaLifo(){
        super();
    }
    public void apilar (int nuevoNumero){
        añadirUltimo(nuevoNumero);
    }

    public int desapilar(){
        int valor = getNodo(getTamaño()-1);
        eliminarUltimo();
        return valor;
    }
}
