import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Temperatura (ºC): ");
            double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                double kelvin = celsius + 273.15;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura en Kelvin: " + kelvin);
        scanner.close();
    }
}