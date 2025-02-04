import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String contraseña = sc.nextLine();
        System.out.println(validarContraseña(contraseña));
    }
    public static boolean validarContraseña (String contraseña) {
        boolean validez= false; char caracter;
        if (contraseña.length() >= 8) {
            for (int i=0; i<contraseña.length(); i++) {
                caracter = contraseña.charAt(i);
                if (Character.isUpperCase (caracter) || Character.isLowerCase(caracter) || Character.isDigit(caracter))
                        validez = true;
            }
        }
        return validez;
    }}
