import java.util.Scanner;

public class EsPerfecto {
    // Escribe un programa en Java que solicite al usuario un número entero positivo e imprima si dicho número
    // es un número perfecto o no. Un número perfecto es aquel cuya suma de sus divisores (excluyendo el
    // propio número) es igual al propio número.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nroEntero;
        int sumaDivisores = 0;

        System.out.println("Digite el nro entero: ");
        nroEntero = scan.nextInt();

        int i = 1;
        while ( i < nroEntero) {
            if (nroEntero % i == 0)
                sumaDivisores += i;
            i++;
        }

        if (sumaDivisores == nroEntero) {
            System.out.println("Es perfecto.");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
