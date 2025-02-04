public class ej11 {

    /**
     * Este método recorre a cadea dada e conta:
     * - As letras (usando Character.isLetter)
     * - Os díxitos (usando Character.isDigit)
     * - Os espazos en branco (usando Character.isWhitespace)
     *
     * Despois, imprime os resultados.
     *
     * @param cadea A cadea de entrada.
     */
    public static void contarCaracteres(String cadea) {
        int letras = 0;
        int digitos = 0;
        int espazos = 0;

        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else if (Character.isWhitespace(c)) {
                espazos++;
            }
        }

        System.out.println("Número de letras: " + letras);
        System.out.println("Número de díxitos: " + digitos);
        System.out.println("Número de espazos en branco: " + espazos);
    }

    public static void main(String[] args) {
        String cadea = "Ola, son alumno de DAM1, e son programador desde o 2024";
        System.out.println("Cadea: " + cadea);
        System.out.println("--------------------------------");
        contarCaracteres(cadea);
    }
}

