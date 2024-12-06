import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 5 Aplicar descuentos ");
        System.out.print("Ingrese el total de su compra $: ");
        double compra = scanner.nextDouble();
        double descuento = 0;

        // Logica para descuento
        if (compra >= 1000) {
            descuento = compra * 0.20; // Descuento del 20%
        } else if (compra >= 500) {
            descuento = compra * 0.10; // Descuento del 10%
        } else {
            descuento = 0; // Sin descuento
        }
        // Total con descuento
        double total = compra - descuento;
        System.out.println("La compra Total es de : $ " + compra);
        System.out.println("Su descuento por la compra es : $ " + descuento);
        System.out.println("Total a pagar es : $ " + total);
        scanner.close();
    }
}
