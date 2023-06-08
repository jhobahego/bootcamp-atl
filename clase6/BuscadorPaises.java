package clase6;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String url = "https://www.google.com/maps/search/";

        System.out.println("---- Bienvenido al buscador de paises ----\n");

        System.out.println("Dime el nombre de tu pais");
        String pais = entrada.nextLine();

        System.out.print("Aqui se encuentra tu pais: " +url+pais);
    }
}
