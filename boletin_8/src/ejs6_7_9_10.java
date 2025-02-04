public class ejs6_7_9_10 {
    public static void main(String[] args) {
        String ej7 = "javeros";
        String ej7_mayusculas = ej7.toUpperCase();
        System.out.println(ej7_mayusculas);
        String java = "Java";
        String javascript = "JavaScript";
        if (java.equals(javascript)) {
            System.out.println("Sí");
        }else{
            System.out.println("No");
        }
        String ej9 = "Jeve jeve jeve";
        String replace = ej9.replace('e', 'a');
        System.out.println(replace);
        String ej10 = "ABCD";
        for (int i = 0; i < ej10.length(); i++) {
            char c = ej10.charAt(i);
            int asciiValue = c;
            System.out.print(asciiValue + " ");
        }
        String ej6 = "www.javadende0.com";
        String [] partes = ej6.split("");
        for (String parte : partes) {
            System.out.print(parte);
        }
    }
}