import java.util.Scanner;

public class SerieFibonacci {
    // Escribe un programa en Java que imprima los primeros "n" números de la serie de Fibonacci.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 <--- Éstos son los n 15 primeros.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primerEle = 0;
        int ultimoEle = 1;
        int aux = 0;
        System.out.println("Ingrese la cantidad de n números de elementos que desee mostrar de la serie fibo.");
        int n = scan.nextInt();
        int i = 0;

        System.out.print(primerEle + ", ");
        System.out.print(ultimoEle + ", ");
        while (i<n-2) {
            aux = ultimoEle;
            ultimoEle = primerEle + ultimoEle;
            System.out.print(ultimoEle + ", ");
            primerEle = aux;
            i++;
            
        }

    }
}
