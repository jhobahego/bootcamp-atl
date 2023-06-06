package Clase5;

import java.util.Scanner;

public class Ejercico1 {
    public static void main(String[] args) {

//        1) Calculadora de edad de perros:
//        Pídele al usuario que ingrese la edad de su perro.
//        Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad de su perro: ");
        int edadPerro = entrada.nextInt();

        edadPerro *=7;

        System.out.println("La edad del perro equivalente en humanos es : "+edadPerro);

    }
}
