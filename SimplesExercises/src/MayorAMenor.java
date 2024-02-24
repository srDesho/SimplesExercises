import java.util.Scanner;

public class MayorAMenor {
    public static void main(String[] args) {
        // El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        // Podría ser utilizando operador ternario.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        Integer num1 = scan.nextInt();
        System.out.println("Digite el segundo número: ");
        Integer num2 = scan.nextInt();

        String resultado = num1 > num2 ? num1.toString().concat(", ").concat(num2.toString()) : num2.toString().concat(", ").concat(num1.toString());
        System.out.println("Ordenado mayor a menor = " + resultado);
    }
}