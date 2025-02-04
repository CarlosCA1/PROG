public class ej5 {

    // Clase para almacenar os tres resultados.
    public static class Resultado {
        private String primeirasLetras;
        private String cadeaCapitalizada;
        private String palabrasConA;

        public Resultado(String primeirasLetras, String cadeaCapitalizada, String palabrasConA) {
            this.primeirasLetras = primeirasLetras;
            this.cadeaCapitalizada = cadeaCapitalizada;
            this.palabrasConA = palabrasConA;
        }

        public String getPrimeirasLetras() {
            return primeirasLetras;
        }

        public String getCadeaCapitalizada() {
            return cadeaCapitalizada;
        }

        public String getPalabrasConA() {
            return palabrasConA;
        }
    }

    /**
     * Procesa a cadea de entrada e devolve:
     * 1. A concatenación da primeira letra de cada palabra.
     * 2. A cadea coa primeira letra de cada palabra en maiúsculas.
     * 3. As palabras que comezan coa letra A (ou 'a').
     *
     * @param cadea a cadea de caracteres a procesar
     * @return un obxecto Resultado coas tres cadeas resultantes
     */
    public static Resultado procesarCadea(String cadea) {
        if (cadea == null || cadea.trim().isEmpty()) {
            return new Resultado("", "", "");
        }


        String[] palabras = cadea.trim().split("\\s+");


        StringBuilder sbPrimeirasLetras = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                sbPrimeirasLetras.append(palabra.charAt(0));
            }
        }
        String primeirasLetras = sbPrimeirasLetras.toString();


        StringBuilder sbCapitalizada = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (!palabra.isEmpty()) {

                String palabraCapitalizada = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1).toLowerCase();
                sbCapitalizada.append(palabraCapitalizada);
                if (i < palabras.length - 1) {
                    sbCapitalizada.append(" ");
                }
            }
        }
        String cadeaCapitalizada = sbCapitalizada.toString();


        StringBuilder sbPalabrasConA = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty() && Character.toLowerCase(palabra.charAt(0)) == 'a') {
                if (sbPalabrasConA.length() > 0) {
                    sbPalabrasConA.append(" ");
                }
                sbPalabrasConA.append(palabra);
            }
        }
        String palabrasConA = sbPalabrasConA.toString();

        return new Resultado(primeirasLetras, cadeaCapitalizada, palabrasConA);
    }


    public static void main(String[] args) {
        // Exemplo 1: "Universal Serial Bus"
        String exemplo1 = "Universal Serial Bus";
        Resultado res1 = procesarCadea(exemplo1);
        System.out.println("Entrada: " + exemplo1);
        System.out.println("Primeira letra de cada palabra: " + res1.getPrimeirasLetras());       // USB
        System.out.println("Cadea coa primeira letra en maiúsculas: " + res1.getCadeaCapitalizada()); // Universal Serial Bus
        System.out.println("Palabras que comezan coa letra A: " + res1.getPalabrasConA());           // (ningunha)

        System.out.println();


        String exemplo2 = "república arxentina";
        Resultado res2 = procesarCadea(exemplo2);
        System.out.println("Entrada: " + exemplo2);
        System.out.println("Primeira letra de cada palabra: " + res2.getPrimeirasLetras());       // ra
        System.out.println("Cadea coa primeira letra en maiúsculas: " + res2.getCadeaCapitalizada()); // República Arxentina
        System.out.println("Palabras que comezan coa letra A: " + res2.getPalabrasConA());           // arxentina

        System.out.println();


        String exemplo3 = "Antes de abrir";
        Resultado res3 = procesarCadea(exemplo3);
        System.out.println("Entrada: " + exemplo3);
        System.out.println("Primeira letra de cada palabra: " + res3.getPrimeirasLetras());       // Ada
        System.out.println("Cadea coa primeira letra en maiúsculas: " + res3.getCadeaCapitalizada()); // Antes De Abrir
        System.out.println("Palabras que comezan coa letra A: " + res3.getPalabrasConA());           // Antes abrir
    }
}

