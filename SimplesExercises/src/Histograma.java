import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        // Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
        // El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        // Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
        // en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
        // incluso si no están presente en el arreglo.
        // Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

        // 1: ***
        // 2:
        // 3: *
        // 4: *****
        // 5: *
        // 6: **
        Scanner scan = new Scanner(System.in);
        int[] nros = new int[12];
        // pedimos nros al usuarios
        for (int i = 0; i < nros.length; i++) {
            System.out.println("Ingrese el elemento " + (i+1) + " sólo nros enteros del 1-6");
            nros[i] = scan.nextInt();
        }

        // Comparamos los elementos para saber las frecuencias de cada nro.
        int comp = 1; // variable que compara los nros repetidos del 1 al 6
        for (int i = 0; i < 6; i++) {
            String frecuencia = "";
            for (int j = 0; j < nros.length; j++) {
                if (nros[j] == comp) {
                    frecuencia = frecuencia.concat("*");
                }
            }
            System.out.println(comp + ": " + frecuencia);
            comp++;
        }
    }
}
