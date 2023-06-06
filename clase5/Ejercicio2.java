package Clase5;

import java.util.Scanner;

public class Ejercicio2 {
//    2) Conversor de millas a kilómetros:
//    Pídele al usuario que ingrese una distancia en millas.
//    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
//    Muestra la distancia en kilómetros al usuario.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una distancia en millas: ");
        double millas = entrada.nextDouble();

        millas *= 1.60934;

        System.out.println("Esa milla en KM  es: "+millas);

    }
}
