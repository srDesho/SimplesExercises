import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {
        // Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        // Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo,
        // el antepenúltimo, el tercero, y así sucesivamente.

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[10];
        // Pedimos nros al usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un nro la posición " + (i+1));
            arreglo[i] = scan.nextInt();
        }

        // Mostramos el arreglo ordenado
        int aux = arreglo.length -1;
        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[aux]);
            System.out.println(arreglo[i]);
            aux--;
        }

    }
}
