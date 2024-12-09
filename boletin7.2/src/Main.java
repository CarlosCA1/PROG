import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String [][] casillas = {{"entrada", "tesoro", "trampa"},
            {"pasillo", "alfombra", "habitáculo"},
            {"piscina", "hoyo", "escaleras"}
            };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la fila: ");
        int i = scanner.nextInt();
        System.out.print("Introduzca la columna: ");
        int j = scanner.nextInt();
        System.out.println(casillas [i] [j]);
        if (casillas [i][j] == "tesoro"){
            System.out.println("Enhorabuena. Has encontrado el tesoro");
        }
        }
    }
