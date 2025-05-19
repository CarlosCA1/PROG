import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnteirosPares {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Introduce número: ");
            n = sc.nextInt();
            if (n > 0) lista.add(n);
        } while (n != -1);

        System.out.println("Lista completa: " + lista);

        for (int i = 0; i < lista.size(); i += 2) {
            System.out.println(lista.get(i) * 100);
        }

        sc.close();
    }
}
