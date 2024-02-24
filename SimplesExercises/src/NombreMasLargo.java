import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        // Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
        // Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
        // o amigos usando la clase JOptionPane y método showInputDialog().

        // Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
        // (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        // Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
        // y con el indice cero accedemos al nombre de la persona.
        // Restricción no usar loops en el desarrollo de la tarea.
        // Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."

        String nombreApellido1 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona 1: ");
        String nombreApellido2 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona 2: ");
        String nombreApellido3 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona 3: ");

        // Método split() para dividir los nombres del apellido
        String[] nombreSplit1 = nombreApellido1.split( " ");
        String[] nombreSplit2 = nombreApellido2.split(" ");
        String[] nombreSplit3 = nombreApellido3.split(" ");
        int nombre1 = nombreSplit1[0].length();
        System.out.println(nombreApellido1 + " = " + nombre1);
        int nombre2 = nombreSplit2[0].length();
        System.out.println(nombreApellido2 + " = " + nombre2);
        int nombre3 = nombreSplit3[0].length();
        System.out.println(nombreApellido3 + " = " + nombre3);

        // Revisamos quién tiene el nombre más largo.
        if (nombre1 > nombre2 && nombre1 > nombre3) {
            System.out.println(nombreApellido1 + " tiene el nombre mas largo.");
        } else if (nombre2 > nombre1 && nombre2 > nombre3) {
            System.out.println(nombreApellido2 + " tiene el nombre mas largo.");
        } else {
            System.out.println(nombreApellido3 + " tiene el nombre mas largo.");
        }

    }
}
