//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] pila;
        int cabeza = -1;
        pila = new int[5];
        cabeza = apilar (pila, cabeza, 5);
        cabeza = apilar (pila, cabeza, 6);
        cabeza = apilar (pila, cabeza, 10);
        cabeza = apilar (pila, cabeza, 15);
        cabeza = apilar (pila, cabeza, 20);
        cabeza = apilar (pila, cabeza, 30);
        mostrarPila(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        mostrarPila(pila, cabeza);
        cabeza = apilar(pila, cabeza, 9);
        cabeza = apilar(pila, cabeza, 13);
        mostrarPila(pila, cabeza);

    }
    public static int apilar (int [] pila, int cab, int num){
        if (cab<pila.length-1){
            pila[cab+1]=num;
            cab++;
            System.out.println("Número " + num + " apilado.");
        }
        else{
            System.out.println("La pila está desbordada, no se almacena el número.");
        }
        return cab;
    }
        public static void mostrarPila (int[]pila, int cab){
        if (cab>=0) {
            for (int i =cab; i >= 0; i--){
                System.out.println("El número de la pila es: "+ pila[i]);
            }
        }
        else {
            System.out.println("Pila vacía");
        }
        }
        public static int desapilar (int[]pila, int cab){
        if (cab>=0) {;
            System.out.println("El número de la pila es " + pila[cab]);
            cab--;
            }
            else {
                System.out.println("Pila vacía");
            }
            return cab;
        }
        }