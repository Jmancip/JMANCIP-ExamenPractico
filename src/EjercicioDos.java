import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 2 programa con switch");
        System.out.println("Ingresa un número para saber a que tipo de cuenta corresponde:");
        System.out.println("1: Cuenta Corriente");
        System.out.println("2: Cuenta de Ahorro");
        System.out.println("3: Cuenta Nómina");
        System.out.println("***************************************************************");

        int tipoCuenta = scanner.nextInt();

        // Uso de switch
        switch (tipoCuenta) {
            case 1:
                System.out.println("Selecciono opción 1: Cuenta Corriente.");
                break;
            case 2:
                System.out.println("Seleccionado opción 2: Cuenta de Ahorro.");
                break;
            case 3:
                System.out.println("Seleccionado opción 3: Cuenta Nómina.");
                break;
            default:
                System.out.println("Número inválido.");
        }
    }
}
