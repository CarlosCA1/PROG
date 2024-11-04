public class Main {
    public static void main(String[] args) {
                int suma = 0;
                for (int i = 0; i < 10; i++) {
                    if (i%2!=0) continue;
                    suma = suma + i;
                }
                System.out.println("La suma de los pares es: " + suma);
            }
        }
