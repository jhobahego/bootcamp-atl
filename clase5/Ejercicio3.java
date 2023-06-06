package clase5;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Calcula el precio final después de
    aplicar el descuento utilizando la fórmula:
    precioFinal = precioOriginal - (precioOriginal * descuento / 100).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame el precio del producto");
        double precio = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = entrada.nextDouble();

        double precioFinal = precio - (precio * descuento / 100);

        System.out.println("El precio total del producto es: "+precioFinal);
    }
}
