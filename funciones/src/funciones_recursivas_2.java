public class funciones_recursivas_2 {
    public static int fibonacci (int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
                return 1;
            }
        return fibonacci (n-1) + fibonacci (n-2);
    }
    public static void main(String[] args) {
        int m = 20;
        System.out.println("El número de Fibonacci en la posición " + m + " es " + fibonacci (m));
    }
}