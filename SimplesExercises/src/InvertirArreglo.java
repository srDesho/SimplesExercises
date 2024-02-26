import java.util.Scanner;

public class InvertirArreglo {
    public static void main(String[] args) {
        // Invertir el arreglo

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[10];
        // Pedimos nros al usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un nro la posición " + (i+1));
            arreglo[i] = scan.nextInt();
        }

        // Mostramos el arreglo
        System.out.println("Arreglo ingresado por usuario");
        for (int nro : arreglo) {
            System.out.print(nro + ", ");
        }

        // Ordenamos el arreglo
        int aux;
        int j = arreglo.length - 1;
        for (int i = 0; i < arreglo.length/2; i++) {
            aux = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = aux;
            j--;
        }
        // Mostramos el arreglo
        System.out.println();
        System.out.println("Arreglo invertido");
        for (int nro : arreglo) {
            System.out.print(nro + ", ");
        }
    }
}

