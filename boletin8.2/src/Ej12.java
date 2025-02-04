public class Ej12 {
    public static void main(String[] args) {
        String texto = "Esto es un texto";
        analizarTexto(texto);
        }
        public static void analizarTexto (String texto) {
            int contarCaracteres = texto.length();
            System.out.println("El texto tiene " + contarCaracteres + " caracteres");
            String palabras[] = texto.split(" ");
            int contadorLetras = 0;
            String palabraMasLarga ="";
            for (int i=0; i<texto.length();i++)   {
                String texto1 = String.valueOf(texto.charAt(i));
                if(texto1!=" ");
                contadorLetras++;
            }
            for(int i=0; i<palabras.length; i++){
                if(palabras[i].length()> palabraMasLarga.length()){
                    palabraMasLarga = palabras[i];
                }
            }
            System.out.println(contadorLetras);
            System.out.println(palabraMasLarga);
        }
    }
