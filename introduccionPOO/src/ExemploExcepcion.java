public class ExemploExcepcion {
    public static void main (String args[]){
        int a,b,c;
        a=0;
        b=0;
        try {
            c = a / b;
        } catch (ArithmeticException |IllegalArgumentException erro){
            System.out.println("Parece que b é 0, téntao de novo");
            System.out.println(erro.getMessage());
        } /* catch (Exception erro2){
            System.out.println(erro2.getMessage());
        } */finally {
            System.out.println("Sempre se executa o finally");
        }
    }
}
