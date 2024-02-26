import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ComprobarOrdenArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nros = new int[7];
        int n;
         // Pedimos datos al usuario
        for (int i = 0; i < nros.length; i++) {
            System.out.println("Ingrese el elemento " + (i+1) + ": ");
            n = scan.nextInt();
            nros[i] = n;
        }
        // mostrarArreglo(nros);

        // Comprobar si está ordenado
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < nros.length-1; i++) {
            // Comprobar si está ordenado ascendentemente
            if (nros[i] < nros[i+1]){
                ascendente = true;
            } else if (nros[i] > nros[i+1]) {
                descendente = true;
            }
        }
        if (ascendente && descendente) {
            System.out.println("Arreglo = Desordenado.");
        } else if (ascendente) {
            System.out.println("Arreglo = Ascendente.");
        } else if (descendente) {
            System.out.println("Arreglo = Descendente.");
        } else {
            System.out.println("Arreglo = Todos son iguales");
        }
    }
    // Iteramos el arreglo
    public static void mostrarArreglo(int[] nros){
        System.out.print("nros = {");
        for (int nro : nros) {
            System.out.print(nro + ", ");
        }
        System.out.println("}");
    }
}
