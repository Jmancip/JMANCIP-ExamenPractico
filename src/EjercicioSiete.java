import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;

        System.out.println("** Ejercicio 7  con Do While  **");
        // Bucle do-while para pedir las notas
        do {
            System.out.print("Ingrese la nota y si desea terminar ingrese -1): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                sumaNotas += nota;
                cantidadNotas++;
            }
        } while (nota != -1);

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }

}
