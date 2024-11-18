public class boletin_6_10 {

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    // Método principal para probar a función
    public static void main(String[] args) {
        int numero1 = 56;
        int numero2 = 98;
        int resultado = mcd(numero1, numero2);
        System.out.println("O MCD de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}