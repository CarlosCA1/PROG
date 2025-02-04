//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena = "Esto es una cadena de caracteres";
        dos_primeros(cadena);
        tres_ultimos(cadena);
        impares(cadena);
        inverso(cadena);
    }
    public static void dos_primeros (String cadena) {
        if (cadena.length() >= 2) {
            String dosPrimeros = cadena.substring(0,2);
            System.out.println(dosPrimeros);
        } else {
            System.out.println("La cadena es demasiado corta.");
        }
    }
    public static void tres_ultimos (String cadena) {
        if (cadena.length() >= 3) {
            String dosUltimos = cadena.substring(cadena.length() - 3);
            System.out.println(dosUltimos);
        }
        else {
            System.out.println("La cadena es demasiado corta.");
        }
    }
    public static void impares (String cadena) {
            for (int i=1; i<cadena.length();i+=2) {
                System.out.print(cadena.charAt(i));
            }
    }
    public static void inverso (String cadena) {
        String invertida= "";
        for (int i = cadena.length()-1; i>=0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println("\n" + cadena + invertida);
    }
}