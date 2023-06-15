package clase7;

import java.util.Scanner;

public class Ejercicio3 {

    /*
        Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y
        se divide por 5, ya que el usuario agregó 5 números.
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

        int sumador = 0;
        for (int numero: numeros) {
            System.out.println(numero);

            // Segunda parte
            if(numero < numeroMenor) {
                numeroMenor = numero;
            } else if(numero > numeroMayor) {
                numeroMayor = numero;
            }

            // Tercera parte
            sumador += numero;
        }

        System.out.println("El numero menor es: "+ numeroMenor);
        System.out.println("El numero mayor es: "+ numeroMayor);

        int promedio = sumador / numeros.length;
        System.out.println("El promedio entre estos numeros es: " +promedio);
    }
}
