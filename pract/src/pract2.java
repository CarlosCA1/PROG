

public class pract2 {
    public static void main(String[] args) {
        int cantDias = 3;
        int cantHoras = 12;
        int cantMinutos = 29;
        calcularSegundos(cantDias, cantHoras, cantMinutos);
    }

    public static void calcularSegundos(int cantDias, int cantHoras, int cantMinutos) {
        int diasASegundos = cantDias * 60 * 60 * 24;
        int horasASegundos = cantHoras * 60 * 60;
        int minutosASegundos = cantMinutos * 60;
        System.out.println("Días en segundos: " + diasASegundos);
        System.out.println("Horas en segundos: " + horasASegundos);
        System.out.println("Minutos a segundos: " + minutosASegundos);
    }
}
