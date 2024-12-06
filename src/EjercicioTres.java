public class EjercicioTres {
    public static void main(String[] args) {
        // Declaración variables
        double a = 30.2;
        double b = 40.1;
        double c = 5;
        double suma = a + b + c;
        double resta = a - b - c;
        double multiplicar = a * b * c;

        // Impresión de resultados
        System.out.println("Ejercicio 3 Suma Resta Multiplicar Dividir");
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicar);

        // Dividir
        try {
            double dividir = (a + b) / c;
            System.out.println("División (a+b)/c: " + dividir);
        } catch (ArithmeticException e) {
            System.out.println("No se puede Dividir por cero");
        }
    }
}

