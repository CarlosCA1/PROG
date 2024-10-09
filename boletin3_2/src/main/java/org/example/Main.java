import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        short num1 = Short.reverseBytes(scanner.nextShort());
        System.out.println("Introduce outro número: ");
        short num2 = Short.reverseBytes(scanner.nextShort());

        if (num1 >= num2) {
            System.out.println(num1 - num2);
        }
        System.out.println(num1 + num2);
        scanner.close();
    }
}