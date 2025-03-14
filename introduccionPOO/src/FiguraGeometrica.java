public abstract class FiguraGeometrica extends PuntoBase {
    public FiguraGeometrica(){
        super();
    }

    public FiguraGeometrica(double x, double y){
        super(x,y);
    }

    public double calcularPerimetro(){
        return 0.0;
    }

    public abstract double calcularArea();
}
