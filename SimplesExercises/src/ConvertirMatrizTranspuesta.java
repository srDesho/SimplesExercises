public class ConvertirMatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,3,4,5},
            {2,1,1,6},
            {3,0,1,7},
            {4,5,6,5}
        };
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        // Mostramos la matriz con 2 foreach
        for (int[] fil : matriz) {
            for (int col : fil) {
                System.out.print( col + ",");
            }
            System.out.println();
        }
    }
}
