public class ej8 {


    /**
     * Convierte unha cadea que representa un número binario (composta de '0' e '1')
     * ao seu valor decimal correspondente.
     *
     * @param binario a cadea binaria a converter
     * @return o valor decimal correspondente
     * @throws IllegalArgumentException se a cadea contén caracteres que non sexan '0' ou '1'
     */
    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            char c = binario.charAt(longitud - 1 - i);
            if (c == '1') {
                decimal += (1 << i);
            } else if (c != '0') {
                throw new IllegalArgumentException("A cadea contén caracteres non binarios: " + c);
            }
        }
        return decimal;
    }


    public static void main(String[] args) {
        String binario1 = "1010";
        System.out.println("O valor decimal de \"" + binario1 + "\" é: " + binarioADecimal(binario1));

        String binario2 = "1111";
        System.out.println("O valor decimal de \"" + binario2 + "\" é: " + binarioADecimal(binario2));

        String binario3 = "100100";
        System.out.println("O valor decimal de \"" + binario3 + "\" é: " + binarioADecimal(binario3));
    }
}
