public class Main {
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50);
        consumo1.setPGas(1.57);

        Consumo consumo2 = new Consumo(300, 25, 100, 1.5);

        System.out.println("Consumo medio de consumo2 (litros/100 km): " + consumo2.consumoMedio());

        consumo2.setLitros(30);

        System.out.println("Velocidade media de consumo2: " + consumo2.getTempo() + " horas");

        System.out.println("Consumo medio en euros por 100 km: " + consumo2.consumoEuros() + " €");
    }
}
