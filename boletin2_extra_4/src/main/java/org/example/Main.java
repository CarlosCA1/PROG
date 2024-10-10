import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Cantidad entera en euros: ");
            int cantidad_euros = scanner.nextInt();
                int billetes100 = (cantidad_euros / 100);
                int billetes20 = cantidad_euros / 20;
                int billetes5 = cantidad_euros / 5;
                int monedas1 = cantidad_euros;
        System.out.println("Billetes de 100 euros: " + billetes100);
        System.out.println("Billetes de 20 euros: " + billetes20);
        System.out.println("Billetes de 5 euros: " + billetes5);
        System.out.println("Monedas de 1 euro: " + monedas1);

        scanner.close();
    }
}