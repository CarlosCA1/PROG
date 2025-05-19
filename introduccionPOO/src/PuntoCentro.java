public class PuntoCentro extends PuntoBase{
    public PuntoCentro(){
        super();
    }
    public PuntoCentro(double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante{
        super(x,y);
    }

    public String aCadena (){
        return "El punto centro tiene como coordenadas x = "+getX()+" e y= " + getY();
    }
}
