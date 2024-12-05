
public class Main {
    public static void main(String[] args) {
        int [] edades;
        edades = new int[5];
        int [] outrasIdades;
        outrasIdades=edades;
        edades[0] = 31;
        edades[1] = 23;
        edades[2] = 56;
        edades[3] = 12;
        edades[4] = 32;
        outrasIdades[3]= 59;
        System.out.println(edades[3]);
        edades= new int[7];
        edades[0] = -3;
        edades[1] = -5;
        edades[2] = -7;
        edades[3] = 100;
        edades[4] = -23;
        edades[5] = 4;
        edades[6] = 6;
        outrasIdades = edades;
        String [] nomes ={"Manuel", "Jose", "Rosa", "Ana"};
        System.out.println(nomes[3]);
        int minimo = outrasIdades [0];
        for (int i = 1; i < edades.length; i++)
            if (minimo > edades[i]) minimo=edades[i];
        System.out.println("O valor mínimo de edades é: " + minimo);
        minimo = edades [0];
        for (int edad: outrasIdades) {
            if (minimo > edad) minimo = edad;
            System.out.println("O valor mínimo de edades é: " + minimo);
        }
    }
}