/**
 * Calcula el número de aprobados y suspensos de 30 notas, la media de toda la clase y la nota más alta.
 * @version 1.0
 * @author Carlos Costas
 */

public class boletin7_2 {
    public static void main(String[] args) {
        double[] notas;
        notas = new double[30];
        notas[0] = 8;
        notas[1] = 4;
        notas[2] = 5.75;
        notas[3] = 3.5;
        notas[4] = 7.25;
        notas[5] = 5.5;
        notas[6] = 2.35;
        notas[7] = 1.25;
        notas[8] = 9;
        notas[9] = 4.95;
        notas[10] = 7.75;
        notas[11] = 5;
        notas[12] = 4;
        notas[13] = 3.5;
        notas[14] = 4.55;
        notas[15] = 7.75;
        notas[16] = 6;
        notas[17] = 0;
        notas[18] = 0.25;
        notas[19] = 4.5;
        notas[20] = 7;
        notas[21] = 8.25;
        notas[22] = 9.25;
        notas[23] = 5;
        notas[24] = 3.45;
        notas[25] = 2;
        notas[26] = 4;
        notas[27] = 5.25;
        notas[28] = 6;
        notas[29] = 3.5;

        String[] nombres = {"Jaime", "Pedro", "Juan", "María", "Lucas", "Antonio", "Manuela", "Adrián", "Pablo", "Carla", "Pablo", "Paula", "Manuel", "Josefa", "Basilio", "José", "Ana", "Paulo", "Javier", "Silvio", "Raúl", "Miguel", "Isabel", "Pablo", "Carlos", "Gabriel", "Judas", "Samuel", "Daniel", "Fernanda"};

        for (int a = 0; a < notas.length; a++) {
            for (int b = 0; b < nombres.length; b++) {
            System.out.println("La nota de " + nombres[b] + " es " + notas[a]);

            int aprobados = 0;
            int suspensos = 0;

            int minimoAprobado = 5;
            for (int i = 1; i < notas.length; i++) {
                if (notas[i] >= minimoAprobado) {
                    aprobados++;
                } else {
                    suspensos++;

                    System.out.println("Aprobados: " + aprobados);
                    System.out.println("Suspensos: " + suspensos);

                    double suma = 0;
                    double notaMedia = 0;

                    for (int j = 1; j < notas.length; j++) {
                        suma += notas[i];
                        notaMedia = suma / notas.length;
                    }
                    System.out.println("Nota media: " + notaMedia);

                    double maximo = notas[0];
                    for (int k = 1; k < notas.length; k++)
                        if (notas[i] < maximo) {
                            maximo = notas[i];
                        }
                    System.out.println("O valor máximo de notas é: " + maximo);
                }
            }
        }
    }}}
