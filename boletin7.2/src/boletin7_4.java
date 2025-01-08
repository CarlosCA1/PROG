import java.util.Scanner;

public class boletin7_4 {
    public static void main(String[] args) {
        String[][] hundirLaFlota = {{"B", "~", "~", "B"},
                {"~", "B", "~", "B"},
                {"B", "~", "B", "~"},
                {"~", "B", "~", "B"}
        };
        for (int i = 0; i < hundirLaFlota.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < hundirLaFlota[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduzca la fila: ");
                i = scanner.nextInt();
                System.out.print("Introduzca la columna: ");
                j = scanner.nextInt();
                if (hundirLaFlota[i][j] == "B") {
                    hundirLaFlota[i][j] = "X";
                } else {
                    hundirLaFlota[i][j] = "0";
                }
                for (int k = 0; k < hundirLaFlota.length; k++) {
                    System.out.println(" ");
                    for (int l = 0; l < hundirLaFlota[k].length; l++) {
                        System.out.print(hundirLaFlota[k][l]);
                    }
            }
        }
    }

    }
}
