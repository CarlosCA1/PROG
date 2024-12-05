import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        if (numero==1) {
            System.out.print("Introduzca el dinero (en euros): ");
            double dinero = scanner.nextDouble();
            double cambio = dinero -1;

        if (dinero>1)
            System.out.println("Cambio: " + cambio);
        }

        if (numero==2) {
            System.out.print("Introduzca el dinero (en euros): ");
        double dinero = scanner.nextDouble();
        double cambio = dinero -1;

        if (dinero>1)
            System.out.println("Cambio: " + cambio);
        }

        if (numero==3) {
            System.out.print("Introduzca el dinero (en euros): ");
        double dinero = scanner.nextDouble();
        double cambio = dinero -1;

        if (dinero>1)
            System.out.println("Cambio: " + cambio);
        }
        if (numero==1) {
            System.out.println("Recibe café");
        }
        if (numero==2) {
            System.out.println("Recibe chocolate");
        }
        if (numero==3) {
            System.out.println("Recibe té");
        }
    }
}