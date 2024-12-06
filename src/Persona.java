public class Persona {
    // Atributos
    String nombre;
    int edad;
    double altura;

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    // Método
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " cm");
    }

    // Método principal donde se crea una instancia de Persona
    public static void main(String[] args) {
        System.out.println("** Ejercicio 10   **");
        Persona persona = new Persona("Julian", 39, 170);
        // Llamar al método para imprimir los datos de la persona
        persona.imprimirDatos();
    }
}

