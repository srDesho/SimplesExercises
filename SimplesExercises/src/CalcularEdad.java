import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        // Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a
        // una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        // Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
        // también se pueden apoyar de google que hay varios ejemplos.

        Scanner scan = new Scanner(System.in);
        // Creamos el formato con SimpleDateFormat
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Pedimos la fecha tipo String al usuario
            System.out.println("Ingrese su fecha de nacimiento con Formato dd-MM-yyyy (día-mes-año)");
            String fechaNac = scan.nextLine();
            Date fechaActual = new Date();
            // Convertimos la fecha de nacimiento en tipo Date
            Date fechaNacDate = formato.parse(fechaNac);
            // Convertimos las fechas en milisegundos
            long fechaNacMilis = fechaNacDate.getTime();
            long fechaActualMilis = fechaActual.getTime();
            // Mostramos el resultado que devuelve calcular direncia de años
            System.out.println("Su edad es: " + calcularDiferenciaAnios(fechaActualMilis, fechaNacMilis));
        } catch (ParseException e) {
            System.out.println("Formato de fecha mal escrita.");
        }
    }
    // Función para calcular años
    public static int calcularDiferenciaAnios(long fechaActualMilis, long fechaNacMilis) {
        // Calcular la diferencia en milisegundos
        long diferenciaMilisegundos = fechaActualMilis - fechaNacMilis;

        // Convertir la diferencia en milisegundos a años
        // 1 año = 365.25 días (considerando años bisiestos)
        double milisegundosPorAnio = 365.25 * 24 * 60 * 60 * 1000;

        return (int) (diferenciaMilisegundos / milisegundosPorAnio);
    }
}
