package clase6;

import java.util.Scanner;

public class Ejercicio8 {

    static String papel = "papel";
    static String piedra = "piedra";
    static String tijera = "tijera";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opcion");

        System.out.println("1. piedra");
        System.out.println("2. papel");
        System.out.println("3. tijeras");

        int opcion = entrada.nextInt();

        int opcionMaquina = (int)(Math.random() * 3) + 1;

        if(opcion > 3 || opcion < 1) {
            System.out.println("Debe ser una opcion de las mostradas");
        }

        // Mostrando la opcion escogida por la maquina
        System.out.println(opcionMaquina == 1 ? "La maquina eligio piedra":
                opcionMaquina == 2 ? "La maquina eligio papel" : "La maquina eligio tijeras");

        if( (opcionMaquina == 1 && opcion == 3) ||
                (opcionMaquina == 2 && opcion == 1) || (opcionMaquina == 3 && opcion == 2) ) {
            System.out.println("Has perdido!");
        } else if( (opcion == 1 && opcionMaquina == 3) ||
                (opcion == 2 && opcionMaquina == 1 ) || (opcion == 3 && opcionMaquina == 2) ) {
            System.out.println("Has ganado felicidades");
        }
        if(opcion == opcionMaquina){
            System.out.println("empate intenta nuevamente!");
        }

    }
}
