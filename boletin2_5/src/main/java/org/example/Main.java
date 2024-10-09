import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio millas mariñas-metros:");
        double cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce a distancia en millas:");
        double millas = entradaTeclado.nextDouble();
        double metros = millas * cambio;
        System.out.println("" + millas + "millas son " + metros + "metros.");
        entradaTeclado.close();
    }
}