public abstract class PuntoBase {
    private double x;
    private double y;

    public PuntoBase(){
        x=0;
        y=0;
    }
    public PuntoBase(double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante{
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws ExcepcionPuntoForaPrimeiroCadrante {
        if (x>=0.0) this.x = x;
        else throw new ExcepcionPuntoForaPrimeiroCadrante();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) throws ExcepcionPuntoForaPrimeiroCadrante{
        if (y>=0) this.y = y;
        else throw new ExcepcionPuntoForaPrimeiroCadrante();
    }

    public abstract String aCadena();
}
