public class ej6 {


    /**
     * Devolve só as letras consonantes da cadea.
     * Se a cadea contén "algoritmos" ou "logaritmos", devolve "lgrtms".
     *
     * @param input a cadea de entrada
     * @return unha cadea só con consonantes
     */
    public static String getConsonants(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) == -1) {  // non é vogal
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }


    /**
     * Devolve, para cada palabra da cadea, só as letras vogais,
     * mantendo a separación entre palabras.
     * Por exemplo, "sen consonantes" devolve "e ooae".
     *
     * @param input a cadea de entrada
     * @return unha cadea formada só polas vogais (por palabra)
     */
    public static String getVowels(String input) {
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder vowelsInWord = new StringBuilder();
            for (char ch : words[i].toCharArray()) {
                if (Character.isLetter(ch)) {
                    char lower = Character.toLowerCase(ch);
                    if ("aeiou".indexOf(lower) != -1) {
                        vowelsInWord.append(ch);
                    }
                }
            }
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(vowelsInWord);
        }
        return sb.toString();
    }


    /**
     * Substitúe cada vogal pola súa "seguinte" segundo o criterio deste exercicio:
     * a/A -> e/E
     * e/E -> o/O
     * i/I -> o/O
     * o/O -> u/U
     * u/U -> u/U
     * Por exemplo, "vestiario" devolta "vostoerou".
     *
     * @param input a cadea de entrada
     * @return a cadea resultante coa substitución de vogais
     */
    public static String replaceVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                boolean isUpper = Character.isUpperCase(ch);
                char lower = Character.toLowerCase(ch);
                char replaced;
                switch(lower) {
                    case 'a':
                        replaced = 'e';
                        break;
                    case 'e':
                        replaced = 'o';
                        break;
                    case 'i':
                        replaced = 'o';
                        break;
                    case 'o':
                        replaced = 'u';
                        break;
                    case 'u':
                        replaced = 'u';
                        break;
                    default:
                        replaced = ch;
                        break;
                }
                if (isUpper) {
                    replaced = Character.toUpperCase(replaced);
                }
                sb.append(replaced);
            } else {
                // Mantém os caracteres que non son letras (como espazos ou puntuación)
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    /**
     * Indica se a cadea é un palíndromo.
     * Elimina os espazos e compara ignorando o case.
     * Por exemplo, "anita lava la tina" é un palíndromo.
     *
     * @param input a cadea de entrada
     * @return true se é palíndromo, false en caso contrario
     */
    public static boolean isPalindrome(String input) {
        // Eliminar espazos e converter a minúsculas
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        int n = cleaned.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "algoritmos";
        String s2 = "logaritmos";
        System.out.println("Consonantes de \"" + s1 + "\": " + getConsonants(s1)); // lgrtms
        System.out.println("Consonantes de \"" + s2 + "\": " + getConsonants(s2)); // lgrtms

        String s3 = "sen consonantes";
        System.out.println("Vogais por palabra en \"" + s3 + "\": " + getVowels(s3)); // e ooae


        String s4 = "vestiario";
        System.out.println("Substitución de vogais en \"" + s4 + "\": " + replaceVowels(s4)); // vostoerou

        String s5 = "anita lava la tina";
        System.out.println("\"" + s5 + "\" é palíndromo? " + isPalindrome(s5)); // true

        String s6 = "Esta cadea non é palíndromo";
        System.out.println("\"" + s6 + "\" é palíndromo? " + isPalindrome(s6)); // false
    }
}
