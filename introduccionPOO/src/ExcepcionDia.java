public class ExcepcionDia extends Exception{
    public String toString(){
        return "Día no válido.";
    }
    public String getMessage(){
        return toString();
    }
}