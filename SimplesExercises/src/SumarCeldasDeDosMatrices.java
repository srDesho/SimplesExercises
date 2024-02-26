public class SumarCeldasDeDosMatrices {
    // Sumar celdas de 2 matrices y mostrar en un tercera matriz"
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] b = {{10,20,30} , {40,50,60},{70,80,90}};
        int[][] suma = new int[3][3];

        // Realizamos la suma y almacenamos en otra matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int[] fila : suma) {
            for (int nro : fila) {
                System.out.print(nro + "\t");
            }
            System.out.println();
        }
    }
}
