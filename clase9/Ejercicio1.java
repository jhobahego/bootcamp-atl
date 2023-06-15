package clase9;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] personas = {"jhon bairo", "maria jose", "genara isabel", "victor rafael", "isaac david", "german jose"};

        System.out.println("Ingrese su busqueda");
        String busqueda = entrada.nextLine();

        for (String persona : personas) {
            if(persona.toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println(persona);
            }
        }
    }
}
