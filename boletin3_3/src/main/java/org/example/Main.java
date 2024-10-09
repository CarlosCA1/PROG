import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = scanner.nextDouble();
        if (num1>0) {
            System.out.println("+");
        }

        if (num1==0) {
            System.out.println("0");
        }

        if (num1<0) {
            System.out.println("-");
        }

        scanner.close();
    }
}