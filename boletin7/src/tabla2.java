public class tabla2 {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
        /*boolean[][]asientos;
        asientos = new boolean [4][4];
        asientos [0][0] = true;
        asientos [0][1] = true;
        asientos [0][2] = true;
        asientos [0][3] = false;
        asientos [1][0] = false;
        asientos [1][1] = true;
        asientos [1][2] = true;
        asientos [1][3] = false;*/
            boolean[][]asientos = {
                    {true, true, false, true},
                    {false, true, true, false},
                    {false, true, false, false},
                    {false, false, false, false}
            };
            for (int fila=0; fila < asientos.length; fila++) {
                for (int columna = 0; columna < asientos[0].length; columna++) {
                    System.out.print(asientos[fila][columna]);
                }
            }
        }
    }
}
