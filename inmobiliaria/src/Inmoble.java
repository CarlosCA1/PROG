public abstract class Inmoble {
    private String rua;
    private int numero;
    private String localidade;
    private double prezo;
    private boolean aluguer;

    public Inmoble(String rua, int numero, String localidade, double prezo, boolean aluguer) {
        this.rua = rua;
        setNumero(numero);
        this.localidade = localidade;
        setPrezo(prezo);
        this.aluguer = aluguer;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = Math.abs(numero);
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = Math.abs(prezo);
    }

    public boolean isAluguer() {
        return aluguer;
    }

    public void setAluguer(boolean aluguer) {
        this.aluguer = aluguer;
    }

    public String toString() {
        String estado;
        if (aluguer) estado = "aluguer";
            else estado = "venda";
            String mensaxe = "O inmoble que está en estado de " + estado + " da rúa" + rua + ", número " + numero + ", localidade " + localidade + " e prezo " + prezo + " foi vendido/alugado.";
            return mensaxe;
        }

        public abstract double calcularGanancia ();
    }

