//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 103;
        int b = 0;
        int aprox = 0;
        do {
            b++;
        } while (aprox == b * b);
        int si = b - 1;
        int no = b - 2;
        int resto = (b-2)*(b-2);
        if (aprox == n) {
            System.out.println("La raíz es " + si);
        }
        if (aprox > n)
            System.out.println("La raíz es " + no);
            System.out.println("El resto es " + resto);
    }
    }