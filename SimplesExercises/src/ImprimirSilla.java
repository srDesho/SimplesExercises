import java.util.Scanner;

public class ImprimirSilla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número mayor a cero para definir el tamaño de la silla:");
        int n = scan.nextInt();

        // Validamos el nro
        if (n <= 0 ){
            System.out.println("ERROR");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];
        // Dibujamos la siila
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || i == n/2  || (j == matriz.length -1) && i > n/2) {
                    matriz[i][j] = 1;
                }
            }
        }

        // Mostrar matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
