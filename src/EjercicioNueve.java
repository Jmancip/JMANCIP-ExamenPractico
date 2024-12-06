import java.util.ArrayList;
import java.util.List;

public class EjercicioNueve {

    public static void main(String[] args) {
        System.out.println("** Ejercicio 9 Arreglo  **");
        // Arreglo con los datos de nombres y edades
        String[] datos = {"antony", "32", "fredy", "45", "maria", "23"};

        // Crear las listas para almacenar los nombres y las edades
        List<String> nombres = new ArrayList<>();
        List<String> edades = new ArrayList<>();

        // Recorrer el arreglo con foreach
        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0) {
                // Los elementos en posiciones pares son nombres
                nombres.add(datos[i]);
            } else {
                // Los elementos en posiciones impares son edades
                edades.add(datos[i]);
            }
        }

        // Imprimir las listas de nombres y edades
        System.out.println("Nombres: " + nombres);
        System.out.println("Edades: " + edades);
    }

}
