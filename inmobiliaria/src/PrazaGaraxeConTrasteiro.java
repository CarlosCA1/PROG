public class PrazaGaraxeConTrasteiro extends PrazaGaraxe{
    private double superficie;
    public PrazaGaraxeConTrasteiro (String rua, int numero, String localidade, double prezo, boolean aluguer, double ancho, double longo, int numero_praza, double superficie){
        super(rua, numero, localidade, prezo, aluguer, ancho, longo, numero_praza);
        setSuperficie(superficie);
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }
}
