import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número (999 para salir): ");
            num = sc.nextInt();
            if (num == 999) break;
            suma = suma + num;
        }
        System.out.println("La suma es: " + suma);
        sc.close();
    }
}