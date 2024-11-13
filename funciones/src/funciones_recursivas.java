public class funciones_recursivas {
    public static int factorial (int n) {
        if (n==0 || n==1) {
            return 1;
        }
            return n*factorial(n-1);
        }
        public static void main(String[] args) {
            int m = 3;
            System.out.println("El factorial de " + m + " es " + factorial (m));
        }
}


