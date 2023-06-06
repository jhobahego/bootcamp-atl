package clase5;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------numero aleatorio generado-------\n");
        short numero = (short) (Math.random() * 100);

        System.out.println("Intenta adivinar el numero entre 1 y 100");
        short respuesta = entrada.nextShort();

        if(respuesta == numero) {
            System.out.println("Numero acertado felicidades");
        } else {
            System.out.println("Mala suerte, el numero era: " + numero + " la proxima será");
        }
    }
}
