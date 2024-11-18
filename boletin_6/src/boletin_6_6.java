public class boletin_6_6 {

    public static int sumaDivisoresPropios(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean sonAmigos(int a, int b) {
        int sumaA = sumaDivisoresPropios(a);
        int sumaB = sumaDivisoresPropios(b);
        return sumaA == b && sumaB == a;
    }

    public static void main(String[] args) {
        int numero1 = 220; // Primeiro número
        int numero2 = 284; // Segundo número

        if (sonAmigos(numero1, numero2)) {
            System.out.println(numero1 + " e " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " e " + numero2 + " non son números amigos.");
        }
    }
}
