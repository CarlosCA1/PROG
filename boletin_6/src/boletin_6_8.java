public class boletin_6_8 {

    public static long potencia(int m, int n) {
        if (n == 0) { // Caso base: calquera número elevado a 0 é 1
            return 1;
        }
        return m * potencia(m, n - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        int base = 2;  // Base (m)
        int expoente = 5; // Expoente (n)
        long resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
}
