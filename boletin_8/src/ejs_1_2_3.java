public class ejs_1_2_3 {
    public static void main(String[] args) {
        String texto = "Isto é Java!";
        System.out.println(texto.length());
        String texto2 = "James \bGoslin \bcreated \bJava";
        System.out.println(texto2);
        String java = "Java";
        for (int i = 0; i<java.length(); i++) {
            char caracteres = java.charAt(i);
            System.out.println(caracteres);
        }
        String texto3 ="Java dende 0";
        String invertido = "";
        for (int j = texto3.length()-1;j >= 0; j--) {
            invertido += java.charAt(j);
            System.out.println(invertido);
        }
    }
}