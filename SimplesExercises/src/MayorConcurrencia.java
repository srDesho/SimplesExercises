import java.util.Scanner;

public class MayorConcurrencia {
    public static void main(String[] args) {
        // Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
        // Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo
        // y también imprimir la cantidad de veces que aparece en el arreglo.
        // Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        // Como resultado debería imprimir lo siguiente:

        // La mayor ocurrencias es: 3
        // El elemento que mas se repite es: 5
        // En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.

        Scanner scan = new Scanner(System.in);
        int mayorConcu = 0;
        int cantidad = 0;
        int aux = cantidad;
        int[] arreglo = new int[10];
        // Pedimos valores al usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un nro del 1-9 en el elemento " + (i+1) + ": " );
            arreglo[i] = scan.nextInt();
        }

        // Calculamos la concurrencia
        int comp = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (comp == arreglo[j]) {
                    cantidad++;
                }
            }
            if (cantidad > aux) {
                aux = cantidad;
                mayorConcu = comp;
            }
            comp++;
            cantidad = 0;
        }

        System.out.println("La mayor concurrecnia es = " + aux +
                "\nEl nro que más se repite es = " + mayorConcu);

    }
}
