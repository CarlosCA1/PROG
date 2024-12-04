//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String horarioCurso (String dia, int hora) {
        System.out.println(horarioCurso("lunes", 5));
        String[][] horario = {
                {"BD", "BD", "BD", "BD", "REC", "PROG", "PROG", "PROG"},
                {"BD", "BD", "BD", "SASP", "REC", "SI", "SI", "IPE"},
                {"PROG", "PROG", "PROG", "LM", "REC", "LM", "COD", "COD"},
                {"ING", "ING", "SI", "SI", "REC", "PROG", "PROG", "PROG"},
                {"COD", "LM", "LM", "SI", "REC", "SI", "IPE", "IPE"}
        };
        int numDia;
        switch (dia) {
            case "lunes" -> numDia = 0;
            case "martes" -> numDia = 1;
            case "miércoles" -> numDia = 2;
            case "jueves" -> numDia = 3;
            case "viernes" -> numDia = 4;
            default -> numDia = -1;
        }
        if (numDia < 0 || numDia >= 5) {
            return "Introduce un día entre lunes y viernes";
        } else if (hora <= 0 || hora > 8) {
            return "Introduce una hora entre 1 y 8";
        } else
            return horario[numDia][hora];
    }
}