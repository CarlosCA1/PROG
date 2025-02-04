public class ej9 {


    /**
     * Recibe unha cadea e un carácter, e devolve unha nova cadea formada
     * exclusivamente polo carácter dado, tendo a mesma lonxitude que a cadea orixinal.
     *
     * @param input a cadea orixinal
     * @param novoCaracter o carácter co que se completará a nova cadea
     * @return unha cadea formada só polo carácter 'novoCaracter'
     */
    public static String generarCadeaConCaracter(String input, char novoCaracter) {
        if (input == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(novoCaracter);
        }
        return result.toString();
    }


    /**
     * Recibe unha cadea e un carácter, e devolve unha nova cadea na que aparezan
     * guións e o carácter dado nas posicións onde este coincide na cadea orixinal.
     * Por exemplo, se se recibe "subcadena" e o carácter 'a', devolverá "-u-a---a-".
     *
     * @param input a cadea orixinal
     * @param c o carácter a buscar na cadea
     * @return unha cadea que marca con 'c' as posicións onde aparece e con '-' as que non
     */
    public static String marcarPosicions(String input, char c) {
        if (input == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                result.append(c);
            } else {
                result.append('-');
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String cadeaOrxinal = "subcadena";
        char novoCaracter = 'x';
        String cadeaNova = generarCadeaConCaracter(cadeaOrxinal, novoCaracter);
        System.out.println("Cadea orixinal: " + cadeaOrxinal);
        System.out.println("Nova cadea só con '" + novoCaracter + "': " + cadeaNova);

        String cadeaBuscar = "subcadena";
        char caracterBuscar = 'a';
        String cadeaMarcada = marcarPosicions(cadeaBuscar, caracterBuscar);
        System.out.println("\nCadea orixinal: " + cadeaBuscar);
        System.out.println("Posicións do carácter '" + caracterBuscar + "': " + cadeaMarcada);
    }
}

