import java.util.Scanner;

public class MatrizTranspuestaAOtraMatriz {
    public static void main(String[] args) {
        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];

        // Pedimos nros al usuario para la 1er matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Transponemos la matriz a otra matriz
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        // Mostramos la matriz con forEach
        for (int[] fila : b) {
            for (int nro : fila) {
                System.out.print(nro + "\t");
            }
            System.out.println();
        }
    }
}
