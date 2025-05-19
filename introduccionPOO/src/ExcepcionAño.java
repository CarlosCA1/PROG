public class ExcepcionAño extends Exception{
    public String toString(){
        return "Año no válido.";
    }
    public String getMessage(){
        return toString();
    }
}