import java.util.Scanner;

public class ImprimirX {
    // Imprimir una X en una matriz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número mayor a cero para definir el tamaño de la letra X:");
        int n = scan.nextInt();
        // Validamos el nro
        if (n <= 0) {
            System.out.println("Error!!!");
            System.exit(1);
        }

        String[][] matriz = new String[n][n];


        // Dibujamos las diagonales
        int auxCol = matriz.length - 1; // Variable para que la columna decremente desde el último elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
            }
            matriz[i][auxCol] = "X";
            auxCol--;
        }

        // Mostrar matriz
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
