import java.util.ArrayList;
import java.util.List;

public class EjercicioOcho {
    public static void main(String[] args) {

        System.out.println("** Ejercicio 8 Separar el String  **");
        String nombres = "antony|fredy|julian|marcos";

        String[] nombresArray = nombres.split("\\|");

        // lista para almacenar nombres
        List<String> nombresList = new ArrayList<>();

        for (String nombre : nombresArray) {
            nombresList.add(nombre);
        }
        System.out.println("La lista de nombres es: " + nombresList);
    }

}
