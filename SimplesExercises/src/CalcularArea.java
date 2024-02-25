import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        // Pedir el radio de un círculo y calcular su área.
        // utilizar la formula:
        // area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scan.nextDouble();
        final double PI = 3.1418;
        System.out.println("El área es = " + PI * Math.pow(radio, 2));
    }

}
