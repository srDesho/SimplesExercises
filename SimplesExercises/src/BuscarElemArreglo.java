public class BuscarElemArreglo {
    // Buscar elemento en un arreglo utilizando etiquetas y break;
    public static void main(String[] args) {
        int[][] arregloEnteros = {
                {123, 897, 687, 2456},
                {789, 3157, 21, 40},
                {7894, 235, 322, 47777}
        };
        int elementoBuscar = 4777;
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < arregloEnteros.length; i++) {
            for (j = 0; j < arregloEnteros[i].length; j++) {
                if (arregloEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado) {
            System.out.println("Elemento " + elementoBuscar + " encontrado en la posición " + i + ", " + j);
        } else {
            System.out.println(elementoBuscar + " No se encontró en la matriz.");
        }
    }
}
