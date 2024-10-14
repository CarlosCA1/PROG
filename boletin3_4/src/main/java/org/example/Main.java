import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de la persona 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Peso de " + nombre1 + "(kg): ");
        double peso1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Nombre de la persona 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Peso de " + nombre2 + "(kg): ");
        double peso2 = scanner.nextDouble();


        if (peso1 > peso2) {
            System.out.println(nombre1 + " pesa " + peso1 + " kg.");
        } else {
            System.out.println(nombre2 + " pesa " + peso2 + " kg.");

            scanner.close();
        }
    }
}
