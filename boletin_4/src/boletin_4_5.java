import java.util.Scanner;

public class boletin_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el número del DNI: ");
        int numerodni = scanner.nextInt();
        int letra = numerodni % 22;
        switch (letra) {
            case 0:
                System.out.println("La letra de su DNI es T");
                break;
            case 1:
                System.out.println("La letra de su DNI es R");
                break;
            case 2:
                System.out.println("La letra de su DNI es W");
                break;
            case 3:
                System.out.println("La letra de su DNI es A");
                break;
            case 4:
                System.out.println("La letra de su DNI es G");
                break;
            case 5:
                System.out.println("La letra de su DNI es M");
                break;
            case 6:
                System.out.println("La letra de su DNI es Y");
                break;
            case 7:
                System.out.println("La letra de su DNI es F");
                break;
            case 8:
                System.out.println("La letra de su DNI es P");
                break;
            case 9:
                System.out.println("La letra de su DNI es D");
                break;
            case 10:
                System.out.println("La letra de su DNI es X");
                break;
            case 11:
                System.out.println("La letra de su DNI es B");
                break;
            case 12:
                System.out.println("La letra de su DNI es N");
                break;
            case 13:
                System.out.println("La letra de su DNI es J");
                break;
            case 14:
                System.out.println("La letra de su DNI es Z");
                break;
            case 15:
                System.out.println("La letra de su DNI es S");
                break;
            case 16:
                System.out.println("La letra de su DNI es Q");
                break;
            case 17:
                System.out.println("La letra de su DNI es V");
                break;
            case 18:
                System.out.println("La letra de su DNI es H");
                break;
            case 19:
                System.out.println("La letra de su DNI es L");
                break;
            case 20:
                System.out.println("La letra de su DNI es C");
                break;
            case 21:
                System.out.println("La letra de su DNI es K");
                break;
            case 22:
                System.out.println("La letra de su DNI es E");
        }

    }
}