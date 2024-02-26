import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        // Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números
        // positivos, el promedio de los negativos y contar el número de ceros.

        Scanner scan = new Scanner(System.in);
        int cantCeros = 0;
        int cantPos = 0;
        int cantNeg = 0;
        int sumaPos = 0;
        int sumaNeg = 0;

        int[] arreglo = new int[7];
        // Pedimos nros al usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un nro en el elemento " + (i+1));
            arreglo[i] = scan.nextInt();
        }

        // Sacamos las sumas y cantidad de ceros
        for (int j : arreglo) {
            if (j == 0) {
                cantCeros++;
            } else if (j > 0) {
                sumaPos += j;
                cantPos++;
            } else {
                sumaNeg += j;
                cantNeg++;
            }
        }

        // Mostramos los promedios y la cantidad de ceros
        if (cantPos > 0) {
            System.out.println("El promedio de los nros positivos es: " + ((float)sumaPos/cantPos));
        } else {
            System.out.println("El promedio de los nros negativos es: No se registraron números positivos." );
        }
        if (cantNeg > 0) {
            System.out.println("El promedio de los nros negativos es: " + ((float)sumaNeg/cantNeg));
        } else {
            System.out.println("El promedio de los nros negativos es: No se registraron números negativos.");
        }
        System.out.println("La cantidad de ceros es = " + cantCeros);
    }
}
