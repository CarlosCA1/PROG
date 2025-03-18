public class PrazaGaraxe extends Inmueble {
    private boolean tenAdegaOuTrasteiro;
    private int númeroPaza;
    private double ancho;
    private double longo;

    public PrazaGaraxe(String rúa, int número, String localidade, double prezo, boolean vendido, boolean tenAdegaOuTrasteiro, int númeroPaza, double ancho, double longo) {
        super(rúa, número, localidade, prezo, vendido);
        this.tenAdegaOuTrasteiro = tenAdegaOuTrasteiro;
        this.númeroPaza = númeroPaza;
        this.ancho = ancho;
        this.longo = longo;
    }

    @Override
    public String obterDatos() {
        return "Praza de Garaxe:\n" +
                "Rúa: " + rúa + "\n" +
                "Número: " + número + "\n" +
                "Localidade: " + localidade + "\n" +
                "Número de praza: " + númeroPaza + "\n" +
                "Ancho: " + ancho + " metros\n" +
                "Longo: " + longo + " metros\n" +
                "Ten adega ou trasteiro: " + (tenAdegaOuTrasteiro ? "Sí" : "Non") + "\n" +
                "Prezo: " + prezo + " €";
    }

    @Override
    protected double obterPorcentaxeGanancia() {
        return 0.03;
    }
}
