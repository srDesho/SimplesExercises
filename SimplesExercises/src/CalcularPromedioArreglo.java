import java.util.Scanner;

public class CalcularPromedioArreglo {
    // Escribe un programa en Java que calcule el promedio de una lista de números ingresada por el usuario
    // y almacenada en un arreglo. El programa debe seguir estos pasos:
    //
    //Solicitar al usuario que ingrese la cantidad de números que desea promediar.
    //Crear un arreglo del tamaño especificado por el usuario para almacenar los números.
    //Pedir al usuario que ingrese cada número de la lista y almacenarlo en el arreglo.
    //Calcular el promedio de los números almacenados en el arreglo.
    //Mostrar el promedio calculado en pantalla.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        double promedio;

        // Pedimos la cantidad de nros al usuario y creamos el arreglo
        System.out.println("Ingrese la cantidad de nros que tendrá el arreglo:");
        int cantidad = scan.nextInt();
        int[] listaNros = new int[cantidad];

        // Agregamos datos al arreglo
        for (int i = 0; i < listaNros.length; i++) {
            System.out.println("ingrese un nro en la posición [" + (i+1) + "] = " );
            listaNros[i] = scan.nextInt();
        }

        // Calculamos la suma total de los nros
        for (int i = 0; i < listaNros.length; i++) {
            suma+=listaNros[i];
        }

        // Promedio
        promedio = (double) suma / listaNros.length;
        System.out.println("la suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
