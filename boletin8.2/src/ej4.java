import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ej4 {

    /**
     * Recibe unha cadea que representa un número enteiro longo e devolve unha cadea co número
     * formatado con separacións de miles. Por exemplo: "1234567890" -> "1.234.567.890"
     *
     * @param numStr a cadea co número a formatear
     * @return a cadea co número formateado ou unha mensaxe de erro se a entrada non é válida
     */
    public static String formatarNumero(String numStr) {
        try {
            long num = Long.parseLong(numStr);


            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setGroupingSeparator('.');


            DecimalFormat formatter = new DecimalFormat("#,###", symbols);
            formatter.setGroupingSize(3);
            formatter.setGroupingUsed(true);

            return formatter.format(num);
        } catch (NumberFormatException e) {
            return "Erro: entrada non válida";
        }
    }

    public static void main(String[] args) {
        String numero = "1234567890";
        System.out.println(formatarNumero(numero)); // Saída: 1.234.567.890
    }
}
