package clase6;

import java.util.Scanner;

public class Ejercicio5 {
    /*
        Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cargué un numero");
        int numero1 = entrada.nextInt();

        System.out.println("Cargué un segundo numero");
        int numero2 = entrada.nextInt();

        System.out.println("Cargué un tercer numero");
        int numero3 = entrada.nextInt();

        int promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El numero promedio de estos numero es: "+promedio);
    }
}
