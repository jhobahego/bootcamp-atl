package clase6;

import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String url = "https://twitter.com/search?q=";

        System.out.println("---- Bienvenido al buscador de tweets ----\n");

        System.out.println("Dime, ¿de que quieres buscar tweets?");
        String tweet = entrada.nextLine();

        System.out.print("Encuentra tweets acerca de "+ tweet + " aqui: " +url+tweet);
    }
}
