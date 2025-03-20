public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();

        System.out.println("Velocidade inicial do coche: " + coche.getVelocidade() + " km/h");

        coche.acelerar(50);
        System.out.println("Velocidade despois de acelerar 50 km/h: " + coche.getVelocidade() + " km/h");

        coche.acelerar(30);
        System.out.println("Velocidade despois de acelerar 30 km/h: " + coche.getVelocidade() + " km/h");

        coche.frenar(40);
        System.out.println("Velocidade despois de frenar 40 km/h: " + coche.getVelocidade() + " km/h");

        coche.frenar(60);
        System.out.println("Velocidade despois de frenar 60 km/h: " + coche.getVelocidade() + " km/h");
    }
}
