package clase5;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame el total la cuenta del restaurante");
        double cuenta = entrada.nextDouble();

        System.out.println("¿Que porcentaje de propina quiere dejar?");
        double propina = entrada.nextDouble();

        double montoPropina = cuenta * (propina / 100);

        System.out.println("Usted desea dejar una propina de: "+montoPropina);
    }
}
