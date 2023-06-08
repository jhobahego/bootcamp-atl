package clase6;

import java.util.Scanner;

public class Ejercicio6 {
    /*
        Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un numero");
        int num1 = entrada.nextInt();

        System.out.println("Dame un segundo numero");
        int num2 = entrada.nextInt();

        System.out.println("Dame un tercer numero");
        int num3 = entrada.nextInt();

        int numeroMenor = Math.min(Math.min(num1, num2), num3);
        int numeroMayor = Math.max(Math.max(num1, num2), num3);

        System.out.println("Numero mayor: "+numeroMayor +"\nNumero menor: "+numeroMenor);
    }
}
