public class boletin_6_7 {

    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Caso base: factorial de 0 ou 1 é 1
            return 1;
        }
        return n * factorial(n - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        int numero = 5; // Exemplo: Número para calcular o factorial
        long resultado = factorial(numero);
        System.out.println("O factorial de " + numero + " é: " + resultado);
    }
}