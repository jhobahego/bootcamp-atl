package clase8;

import java.util.Scanner;

public class Ejercicio2 {

    /*
        Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("----- Calcula el area de tu triangulo -----\n");

        int area = calcularAreaDelTriangulo();
        System.out.println("El area de tu triangulo es: " +area);
    }

    static int calcularAreaDelTriangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el valor de la base: ");
        int base = sc.nextInt();

        System.out.print("Dame el valor de la altura: ");
        int altura = sc.nextInt();

        return (base * altura) / 2;
    }
}
