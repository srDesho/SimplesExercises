public class MayorYMenor {
    // Escribe un programa que encuentre el número más grande y el número más pequeño en un arreglo de enteros.
    public static void main(String[] args) {
        int min, max;
        int[] enteros = {20,1,48,456,21,3,12,78,98,41};

        min = enteros[0];
        max = enteros[0];

        for (int i = 0; i < enteros.length - 1 ; i++) {
            if(enteros[i+1] < min) {
                min = enteros[i+1];
            }
            if (enteros[i+1] > max){
                max = enteros[i+1];
            }
        }

        System.out.println("El nro más pequeño es: " + min);
        System.out.println("El nro más grande es: " + max);
    }
}
