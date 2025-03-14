public abstract class PuntoBase {
    private double x;
    private double y;

    public PuntoBase(){
        x=0;
        y=0;
    }
    public PuntoBase(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x<0) this.x = 0;
        else this.x=x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y<0) this.y = 0;
        else this.y=y;
    }

    public abstract String aCadena();
}
