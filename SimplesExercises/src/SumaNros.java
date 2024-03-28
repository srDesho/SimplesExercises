import java.util.Scanner;

public class SumaNros {
    public static void main(String[] args) {
        // Escribe un programa en Java que solicite al usuario un número
        // entero positivo e imprima la suma de todos los números naturales menores o iguales que ese número.
        Scanner scan = new Scanner(System.in);
        int entero;
        System.out.println("Ingrese el nro entero");
        entero = scan.nextInt();

        int total = 0;
        for (int i = 0; i <= entero; i++) {
            total += i;
        }

        System.out.println("La suma total es: " + total);

    }
}
