import java.util.Scanner;

public class boletin_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        double numero = scanner.nextDouble();
        double negativo = -numero;
        double absoluto = (numero>negativo) ? numero : negativo;
        System.out.println("El valor absoluto es " + absoluto);
    }
}
