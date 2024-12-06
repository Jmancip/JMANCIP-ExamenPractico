public class Main {
    public static void main(String[] args) {
        System.out.println(" 1 Ejercicio concatena 3 variables de tipo String  ");
        // Declaración de variables
        String miNombre = "antony";
        int miEdad = 15;
        String profesion = "Ingeniero de sistemas";

        // Conversión del nombre a mayúsculas
        miNombre = miNombre.toUpperCase();

        // Concatenación y salida en consola
        System.out.println(miNombre + " tiene " + miEdad + " años y su profesión es " + profesion + ".");
    }
}
