public class ej2 {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        char reemplazo = '*';

        String resultado = reemplazarEspacios(cadena, reemplazo);

        System.out.println(resultado);
    }

    public static String reemplazarEspacios(String cadena, char reemplazo) {
        StringBuilder resultado = new StringBuilder(cadena);

        int index = cadena.indexOf(' ');

        while (index != -1) {
            resultado.setCharAt(index, reemplazo);
            index = cadena.indexOf(' ', index + 1);
        }
        return resultado.toString();
    }
}
