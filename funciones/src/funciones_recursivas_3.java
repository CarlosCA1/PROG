public class funciones_recursivas_3 {
    public static void main(String[] args) {
        int n1 = 0;
        System.out.println(n1);
        int n2 = 1;
        System.out.println(n2);

        int ns = 0;
        int elementos = 10;
        int j = 0;

        recursiva ("hola");

        for (int i = 0; i < elementos; i++) {

            ns = fibonacci(n1, n2);
            n1 = n2;
            n2 = ns;
        }
    }

    static void recursiva(String msg) {
        System.out.println(msg);
    if (msg.length()<10) recursiva(msg + ".");
}

        static int fibonacci (int a, int b){
        int suma = a + b;
            System.out.println(suma);
            return suma;
        }
}