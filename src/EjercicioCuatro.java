public class EjercicioCuatro {
    public static void main(String[] args) {
        int suma = sumarNumerosPares();
        System.out.println("Ejercicio 4 Bucle for");
        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }

    // Método para sumar los números pares del 1 al 100
    public static int sumarNumerosPares() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Verifica si el número es par
                suma += i;
            }
        }
        return suma;
    }
}
