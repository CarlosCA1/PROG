public class ejs1_y_2 {
    public static String[] palabraNsecuencias(String palabra, int nCaracteres) {
        int sec = palabra.length() - nCaracteres + 1;
        String[] secuencias = new String[sec];
        for (int i = 0; i < sec; i++) {
            secuencias[i] = palabra.substring(i, i + nCaracteres);
        }
        return secuencias;
    }

    public static String formateaHtml(String texto) {
        // Buscar la posición del salto de línea
        int posSaltoLinea = texto.indexOf('\n');

        // Construir el código HTML con las etiquetas correspondientes
        String codigoHtml = "<html>\n";

        // Agregar la sección <h1> con el primer texto
        codigoHtml = codigoHtml + "<h1>" + texto.substring(0, posSaltoLinea) + "</h1>\n";

        // Agregar la sección <p> con el segundo texto
        codigoHtml = codigoHtml + "<p>" + texto.substring(posSaltoLinea + 1) + "</p>\n";

        // Cerrar la etiqueta <html>
        codigoHtml = codigoHtml + "</html>\n";

        return codigoHtml;
    }

    public static void main(String[] args) {
        String[] secFrigorifico;
        secFrigorifico = palabraNsecuencias("Frigorífico", 4);

        // Imprimir las secuencias generadas
        for (int i = 0; i < secFrigorifico.length; i++) {
            System.out.println(secFrigorifico[i]);
        }

        // Texto de ejemplo para formatear en HTML
        String contidoPagina = """
                Esto es un String
                abcdefg""";

        // Llamar al método formateaHtml y mostrar el resultado
        System.out.println(formateaHtml(contidoPagina));
    }
}
