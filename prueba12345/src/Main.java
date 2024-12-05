import java.util.Scanner;

/**
 * El programa solicita notas e imprime la media de las mismas. Para pararlo, introduce -1.
 * @version 1.0
 * @author Carlos Costas
 */

public class notasmedia {
    public static void main(String[] args)
    int nota, suma, numero, media;
    suma=0;
    numero=0;
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce una nota: ");
    nota = sc.nextInt("Introduce otra nota: ");
    while(nota!=-1)

    {
        suma = suma + nota;
        numero++;
        System.out.println();
        nota = sc.nextInt();
    }
    media=suma/numero;
    System.out.println("Media: ");
}
}

        }
}