import java.util.*;

public class bol12ex6 {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>();
        for (int i=0; i<20; i++){
            lista.add((int) (Math.random()*10)+1);
        }
        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println(lista);

        Set<Integer> senRepeticions = new HashSet<>();
        senRepeticions.addAll(lista);
        System.out.println("Sen repeticións:");
        System.out.println(senRepeticions);

        Set<Integer> repetidos = new HashSet<>();
        for (Integer n: senRepeticions){
            lista.remove(n);
        }
        repetidos.addAll(lista);
        System.out.println("Repetidos:");
        System.out.println(repetidos);
        Set<Integer> unicos = new HashSet<>();
        unicos.addAll(senRepeticions);
        unicos.removeAll(repetidos);
        System.out.println("Únicos: ");
        System.out.println(unicos);
    }
}
