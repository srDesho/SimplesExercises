import java.util.Scanner;

public class EsPalindromo {
    // Escribe un programa en Java que determine si una cadena es un palíndromo. Un palíndromo es una palabra,
    // frase, número o cualquier otra secuencia de caracteres que se lee igual hacia adelante que hacia atrás.
    // Por ejemplo, "radar", "oso" y "12321" son palíndromos. El programa debe tomar una cadena como entrada
    // y mostrar un mensaje indicando si es un palíndromo o no.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dato;
        System.out.println("Ingrese una palabra, frase o número, para verificar si son palíndromos.");
        dato = scan.nextLine();
        // Eliminar espacios y convertir la cadena a minúsculas para ignorar mayúsculas y minúsculas
        dato.replaceAll("\\s+", "").toLowerCase();
        
        // Verificamos
        String invertido = "";
        for (int i =  dato.length() - 1; i >= 0; i--) {
            invertido += dato.charAt(i);
        }

        if (dato.equals(invertido)) {
            System.out.println("Es Palíndromo.");
        } else {
            System.out.println("No es Palíndromo.");
        }
    }
}
