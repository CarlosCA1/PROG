public class ej5 {
    public static void main(String[] args) {
        String cadea = "java java java";
        int vogais = 0;
        int consoantes = 0;

        cadea = cadea.toLowerCase();

        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);

            // Verificamos se é unha vogal
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            }
            else if (Character.isLetter(c)) {
                consoantes++;
            }
        }

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
    }
}

