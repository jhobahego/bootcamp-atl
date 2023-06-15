package clase8;

import java.util.Scanner;

public class Ejercicio1 {

    /*
        Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("----- Calcula el area de tu cuadrado -----\n");

        int area = calcularArea();
        System.out.println("El area del cuadrado es: " +area);
    }

    private static int calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la longitud de un lado: ");
        int lado = sc.nextInt();
        return lado * lado;
    }
}
