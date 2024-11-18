public class boletin_6_5 {
    public static void main(String[] args) {
        int a = 12*60;
        int b = 50;
        int c = 3*60;
        int d = 36;
        diferenciaMin(a,b,c,d);
    }

    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
        int minutosInstante1 = hora1 + minuto1;
        int minutosInstante2 = hora2 + minuto2;
        int minutosTotales = minutosInstante1 - minutosInstante2;
        System.out.println("La diferencia entre los dos instantes es de " + minutosTotales + " minutos");
        return (minutosInstante1 - minutosInstante2);
    }
}