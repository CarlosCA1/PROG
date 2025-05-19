import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List <Integer> listaEnteiros = new ArrayList<>();
        listaEnteiros.add(3);
        listaEnteiros.add(3);
        listaEnteiros.add(9);
        listaEnteiros.add(4);
        listaEnteiros.add(2);
        listaEnteiros.add(13);
        System.out.println(listaEnteiros);

        listaEnteiros.set(3,4000);
        listaEnteiros.add(3,44);
        listaEnteiros.addAll(5, listaEnteiros);
        System.out.println(listaEnteiros.remove(1));
        System.out.println(listaEnteiros);
        System.out.println(listaEnteiros.get(3));
    }
}
