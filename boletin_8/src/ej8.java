public class ej8 {
    public static void main(String[] args) {
        String cadea1 = "Java";
        String cadea2 = "JavaScript";


        boolean sonIguais = cadea1.equals(cadea2);
        System.out.println("¿Son iguais con equals()? " + sonIguais);


        int resultadoComparacion = cadea1.compareTo(cadea2);
        if (resultadoComparacion == 0) {
            System.out.println("As cadeas son iguais lexicograficamente.");
        } else if (resultadoComparacion < 0) {
            System.out.println("\"" + cadea1 + "\" aparece antes que \"" + cadea2 + "\" no alfabeto.");
        } else {
            System.out.println("\"" + cadea1 + "\" aparece despois que \"" + cadea2 + "\" no alfabeto.");
        }
    }
}

