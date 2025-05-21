import java.util.*;

public class boletin13_3 {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(10) + 1);
        }

        System.out.println("Antes da eliminación con iterador: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n == 5 || n == 7) {
                it.remove();  // importante usar remove() do iterador!
            }
        }

        System.out.println("Despois da eliminación con iterador: " + numeros);
    }
}


