import java.util.Scanner;
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Ejercicio 6  con While  **");
        System.out.print("**    Ingrese el número de la tabla que desee multiplicar:  ");
        int numero = scanner.nextInt();
        // Inicializar el contador
        int contador = 1;

        // Bucle while para imprimir las 20 primeras multiplicaciones
        while (contador <= 20) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++; // Incrementar el contador
        }

        scanner.close();
    }

}
