public class pract3 {
    public static void main(String[] args) {
        int hora1 = 4;
        int minuto1 = 2;
        int hora2 = 3;
        int minuto2 = 10;
        diferenciaMin(hora1, minuto1, hora2, minuto2);
    }
    public static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
        int hora1AMinutos = hora1*60;
        int hora2AMinutos = hora2*60;
        int diferencia = (hora1AMinutos + minuto1) - (hora2AMinutos-minuto2);
        System.out.println("La diferencia en minutos entre los dos instantes de tiempo es de: " + diferencia + " minutos.");
        return diferencia;
    }
}
