public class pract4 {
    public static void main(String[] args) {
    int num1 = 220;
    int num2 = 284;
    amigos (num1, num2);
    }
    public static void amigos (int num1, int num2) {
        int sumaDivisores1 = 0;
        for (int i = 1; i <= num1; i++){
            if (num1 % i == 0) {
                sumaDivisores1 += i;
            }
        }
        int sumaDivisores2 = 0;
        for (int j = 1; j <= num1; j++){
            if (num2 % j == 0) {
                sumaDivisores2 += j;
            }
        }
        if (sumaDivisores2 != sumaDivisores1) {
            System.out.println("No son amigos");
        }
        else {
            System.out.println("Son amigos");
        }
    }
}
