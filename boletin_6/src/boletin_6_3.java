public class boletin_6_3 {

    public static void calcularCubo(int opcion, double lado) {
        if (opcion == 1) {
            // Calcular e mostrar a área do cubo
            double area = 6 * lado * lado;
            System.out.println("A área do cubo é: " + area);
        } else if (opcion == 2) {
            // Calcular e mostrar o volume do cubo
            double volume = lado * lado * lado;
            System.out.println("O volume do cubo é: " + volume);
        } else {
            // Mensaxe de erro se a opción non é válida
            System.out.println("Opción non válida. Debe ser 1 (área) ou 2 (volume).");
        }
    }

    public static void main(String[] args) {
        double lado = 3.0; // Exemplo: lonxitude do lado do cubo
        calcularCubo(1, lado); // Chamar á función para calcular a área
        calcularCubo(2, lado); // Chamar á función para calcular o volume
        calcularCubo(3, lado); // Proba con unha opción non válida
    }
}