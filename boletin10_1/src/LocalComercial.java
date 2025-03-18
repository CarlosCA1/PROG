public class LocalComercial extends Inmueble {
    private boolean acondicionado;
    private boolean fachadaARúa;
    private boolean entradaMercadorías;
    private String portal;
    private int piso;
    private double metrosCadrados;
    private String observacións;

    public LocalComercial(String rúa, int número, String localidade, double prezo, boolean vendido, boolean acondicionado, boolean fachadaARúa, boolean entradaMercadorías, String portal, int piso, double metrosCadrados, String observacións) {
        super(rúa, número, localidade, prezo, vendido);
        this.acondicionado = acondicionado;
        this.fachadaARúa = fachadaARúa;
        this.entradaMercadorías = entradaMercadorías;
        this.portal = portal;
        this.piso = piso;
        this.metrosCadrados = metrosCadrados;
        this.observacións = observacións;
    }

    @Override
    public String obterDatos() {
        return "Local Comercial:\n" +
                "Rúa: " + rúa + "\n" +
                "Número: " + número + "\n" +
                "Localidade: " + localidade + "\n" +
                "Portal: " + portal + "\n" +
                "Piso: " + piso + "\n" +
                "Metros cadrados: " + metrosCadrados + "\n" +
                "Acondicionado: " + (acondicionado ? "Sí" : "Non") + "\n" +
                "Fachada a rúa: " + (fachadaARúa ? "Sí" : "Non") + "\n" +
                "Posibilidade de entrada para mercadorías: " + (entradaMercadorías ? "Sí" : "Non") + "\n" +
                "Observacións: " + observacións + "\n" +
                "Prezo: " + prezo + " €";
    }

    @Override
    protected double obterPorcentaxeGanancia() {
        return 0.02;
    }
}
