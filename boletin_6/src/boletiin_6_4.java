public class boletin_6_4 {
    public static void main(String[] args) {
        int dias = 7;
        int horas = 12;
        int minutos = 10;
        areaCubo(dias, horas, minutos);
    }

    static void areaCubo(int num1, int num2, int num3) { //calcular número de segundos
        int dias_en_segundos = num1*20*60*60;
        int horas_en_segundos = num2*60*60;
        int minutos_en_segundos = num3*60;
        System.out.println(num1 + " días son " + dias_en_segundos + " segundos");
        System.out.println(num2 + " horas son " + horas_en_segundos + " segundos");
        System.out.println(num3 + " minutos son " + minutos_en_segundos + " segundos");
    }
}
