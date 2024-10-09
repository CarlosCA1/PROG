import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce o peso de Pedro: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Introduce o peso de David: ");
        double peso2 = scanner.nextDouble();

        if (peso1>peso2) {
            System.out.println("Idade: 27, lugar de residencia: Vigo");
            System.out.println(peso1-peso2);
        }
        if (peso2>peso1) {
            System.out.println("Idade: 25, lugar de residencia: Pontevedra");
            System.out.println(peso2-peso1);
        }
    }
}