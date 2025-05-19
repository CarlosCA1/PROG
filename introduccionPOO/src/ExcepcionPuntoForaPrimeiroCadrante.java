public class ExcepcionPuntoForaPrimeiroCadrante extends Exception{
    public String toString(){
        return "Coordenada fóra do primeiro cadrante";
    }
    public String getMessage(){
        return toString();
    }
}
