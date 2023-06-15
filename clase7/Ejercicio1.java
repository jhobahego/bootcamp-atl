package clase7;

import java.util.Scanner;

public class Ejercicio1 {

    /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        for (int numero: numeros) {
            System.out.println(numero);
        }
    }

}
