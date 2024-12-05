/**
 * Imprime un número del 0 al 99 por letra.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        int numero = 45;
        int decenas, unidades;
        String decCadena, uniCadena;
        decenas = numero / 10;
        unidades = numero % 10;
        switch (decenas) {
            case 0: decCadena = ""; break;
            case 1: decCadena = "Diez"; break;
            case 2: decCadena = "Veinte"; break;
            case 3: decCadena = "Treinta"; break;
            case 4: decCadena = "Cuarenta"; break;
            case 5: decCadena = "Cincuenta"; break;
            case 6: decCadena = "Sesenta"; break;
            case 7: decCadena = "Setenta"; break;
            case 8: decCadena = "Ochenta"; break;
            case 9: decCadena = "Noventa"; break;
        }

        switch (unidades) {
            case 0: uniCadena = ""; break;
            case 1: uniCadena = "Uno"; break;
            case 2: uniCadena = "Dos"; break;
            case 3: uniCadena = "Tres"; break;
            case 4: uniCadena = "Cuatro"; break;
            case 5: uniCadena = "cinco"; break;
            case 6: uniCadena = "seis"; break;
            case 7: uniCadena = "siete"; break;
            case 8: uniCadena = "ocho"; break;
            case 9: uniCadena = "nueve"; break;
        }
    }
}