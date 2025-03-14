public class PrazaGaraxe extends Inmoble {
    private double ancho;
    private double longo;
    private int numero_praza;

    public PrazaGaraxe(String rua, int numero, String localidade, double prezo, boolean aluguer, double ancho, double longo, int numero_praza) {
        super(rua, numero, localidade, prezo, aluguer);
        setAncho(ancho);
        setLongo(longo);
        setNumero_praza(numero_praza);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = Math.abs(ancho);
    }

    public double getLongo() {
        return longo;
    }

    public void setLongo(double longo) {
        this.longo = Math.abs(longo);
    }

    public int getNumero_praza() {
        return numero_praza;
    }

    public void setNumero_praza(int numero_praza) {
        this.numero_praza = Math.abs(numero_praza);
    }

    public double calcularGanancia(){
        if (isAluguer()) return getPrezo();
        else return getPrezo() * 3 / 100;
    }
}

