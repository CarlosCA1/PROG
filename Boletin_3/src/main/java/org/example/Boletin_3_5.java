import java.util.Scanner;
public class Boletin_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce outro número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introduce outro número: ");
        double num3 = scanner.nextDouble();

        if (num1>num2) {
            if (num1>num3)
                System.out.println("O maior é " + num1);
        }

        if (num2>num1) {
            if (num2>num3)
                System.out.println("O maior é " + num2);
        }

        if (num3>num2) {
            if (num3>num1)
                System.out.println("O maior é " + num3);
        }
        scanner.close();
    }
}