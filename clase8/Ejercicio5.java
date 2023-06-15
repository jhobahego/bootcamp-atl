package clase8;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        do {
            int opcion = obtenerOpcionDelJugador(entrada);
            if(opcion == 3) break;

            int opcionMaquina = (int)(Math.random() * 3) + 1;
            int maquina = opcionMaquina - 1;

            if ( opcionInvalida(opcion) ) {
                System.out.println("Debes elegir una de las opciones mostradas");
                continue;
            }

            String ganador = calcularResultado(opcion, maquina);

            System.out.println();
            System.out.println(ganador);
        } while (true);

    }

    private static boolean opcionInvalida(int opcion) {
        return opcion != 0 && opcion !=1 && opcion != 2;
    }
    private static int obtenerOpcionDelJugador(Scanner entrada) {
        System.out.println("Elige una opcion");

        System.out.println("0. piedra");
        System.out.println("1. papel");
        System.out.println("2. tijeras");
        System.out.println("3. salir");

        int opcion = entrada.nextInt();
        return opcion;
    }

    static String calcularResultado(int jugador, int maquina) {
        String[] opciones = {"piedra", "papel", "tijeras"};

        String opcionJugador = opciones[jugador];
        String opcionMaquina = opciones[maquina];
        if(opcionJugador.equals(opcionMaquina)) return "Empate";

        if( ( opcionJugador.equals("piedra") && opcionMaquina.equals("tijeras") ) ||
                ( opcionJugador.equals("papel") && opcionMaquina.equals("piedra") ) ||
                ( opcionJugador.equals("tijeras") && opcionMaquina.equals("papel") )) {
            return "Has ganado la maquina tenia: "+opcionMaquina;
        }

        return "Perdiste la maquina tenia: "+opcionMaquina;
    }
}
