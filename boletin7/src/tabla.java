public class tabla {
    public static void main(String[] args) {
        int [] [] tabla = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}};
        for (int i=0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
        boolean[][]asientos = {
                {true, true, false, true},
                {false, true, false, false},
                {true, false, true, true},
                {false, false, true, true}
            };
        System.out.println(asientos[2][2]);
    }
}
