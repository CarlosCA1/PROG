public class ExcepcionMes extends Exception{
    public String toString(){
        return "Mes no válido.";
    }
    public String getMessage(){
        return toString();
    }
}
