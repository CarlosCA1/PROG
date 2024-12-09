import java.util.Scanner;

public class boletin7_3 {
    public static void main(String[] args) {
        String[][] menu = {{"Primer plato:"},
                {"Arroz", "Pasta", "Hamburguesa"},
                {"Segundo plato:"},
                {"Pizza", "Secreto", "Salmón"},
                {"Postre:"},
                {"Tarta de la abuela", "Bizcocho", "Flan"}
        };
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[i].length; j++) {
                String menuCompleto = menu[i][j];
                pedido(menuCompleto);
            }
        }
    }

    public static void pedido(String menuCompleto) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el primer plato (empezando con mayúsculas): ");
        String primerPlato = scanner.nextLine();
        System.out.print("Introduzca el segundo plato (empezando con mayúsculas): ");
        String segundoPlato = scanner.nextLine();
        System.out.print("Introduzca el postre (empezando con mayúsculas): ");
        String postre = scanner.nextLine();

        String[][] pedidoCliente = {{"Primer plato: "},
                {primerPlato},
                {"Segundo plato: "},
                {segundoPlato},
                {"Postre: "},
                {postre}
        };
        for (int k = 0; k < pedidoCliente.length; k++) {
            for (int l = 0; l < pedidoCliente[k].length; l++) {
                System.out.println(pedidoCliente[k][l]);
            }
        }
    }
}
