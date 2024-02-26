public class SumarFilaColumnasMatriz {
    // Sumar celdas de 2 matrices y mostrar en un tercera matriz"
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        int sumaFila, sumaColumna;

        // Realizamos la suma y almacenamos en otra matriz
        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            System.out.println("Total fila " + i + ": "+ sumaFila);
            System.out.println("Total columna " + i + ": "+ sumaColumna);
        }
    }
}
