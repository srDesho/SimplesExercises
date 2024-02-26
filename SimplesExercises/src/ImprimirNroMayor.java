import java.util.Scanner;

public class ImprimirNroMayor {
    // Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
    // por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[7];

        // Pedimos números al usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un nro del 11-99 en la posición " + (i+1));
            arreglo[i] = scan.nextInt();
        }

        // Comparamos todos los nros del arreglo
        int mayor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            mayor = arreglo[i] > mayor ? arreglo[i] : mayor;
        }
        System.out.println("El número más alto del arreglo es: " + mayor);
    }
}
