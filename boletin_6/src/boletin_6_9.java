public class boletin_6_9 {

    public static int fibonacci(int n) {
        if (n == 0) { // Caso base: Fibonacci(0) = 0
            return 0;
        } else if (n == 1) { // Caso base: Fibonacci(1) = 1
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Chamada recursiva
    }

    public static void main(String[] args) {
        int termo = 10; // Exemplo: calcular o 10º termo da serie de Fibonacci
        int resultado = fibonacci(termo);
        System.out.println("O termo " + termo + " da serie de Fibonacci é: " + resultado);
    }
}
