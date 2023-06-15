package clase7;

import java.util.Scanner;

public class Ejercicio2 {

    /*
        Después de realizar el ejercicio anterior, agregar que
        muestre el número mayor y el número menor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        int numeroMenor = numeros[0];
        int numeroMayor = numeros[0];
        for (int numero: numeros) {
            System.out.println(numero);

            // Segunda parte
            if(numero < numeroMenor) {
                numeroMenor = numero;
            } else if(numero > numeroMayor) {
                numeroMayor = numero;
            }
        }

        System.out.println("El numero menor es: "+ numeroMenor);
        System.out.println("El numero mayor es: "+ numeroMayor);
    }
}
