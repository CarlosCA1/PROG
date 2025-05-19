public class CuadradoBis extends FiguraGeometrica{
    private double lado;

    public CuadradoBis (double l){
        super();
        setLado (l);
    }
    public CuadradoBis (double x, double y, double l) throws ExcepcionPuntoForaPrimeiroCadrante{
        super(x,y);
        setLado(l);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado<0) this.lado = Math.abs(lado);
        else {
            this.lado = lado;
        }
    }

    public double calcularPerimetro(){
        return lado+lado;
    }

    public double calcularArea (){
        return lado*lado;
    }

    public String aCadena (){
        return "El cuadrado de lado= "+lado+", X= "+getX()+" y= "+getY();
    }
}
