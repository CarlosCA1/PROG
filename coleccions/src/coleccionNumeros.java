import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class coleccionNumeros {
    public static void main(String[] args) {
        Collection <Integer> numeros = new ArrayList<>();
        for (int i=0; i<100; i++){
            numeros.add((int) (Math.random()*10+1));
        }
        System.out.println(numeros);
        Collection<Integer> numBorrables =new ArrayList<>();
        numBorrables.add(5);
        numBorrables.add(7);
        numBorrables.removeAll(numBorrables);
        System.out.println(numeros);
        Integer n;
        Iterator<Integer> it = numeros.iterator();
        for (; it.hasNext();){
            n=it.next();
            if (n==3 || n==8) it.remove ();
        }
        System.out.println(numeros);
    }
}
