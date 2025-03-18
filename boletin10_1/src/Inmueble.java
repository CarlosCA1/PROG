public abstract class Inmueble {
    protected String rúa;
    protected int número;
    protected String localidade;
    protected double prezo;
    protected boolean vendido; // true se é vendido, false se é alugado

    public Inmueble(String rúa, int número, String localidade, double prezo, boolean vendido) {
        this.rúa = rúa;
        this.número = número;
        this.localidade = localidade;
        this.prezo = prezo;
        this.vendido = vendido;
    }

    public abstract String obterDatos();

    public double calcularGanancia() {
        if (vendido) {
            return prezo * obterPorcentaxeGanancia();
        } else {
            return prezo;
        }
    }

    protected abstract double obterPorcentaxeGanancia();
}
