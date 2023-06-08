package clase6;

import java.util.Scanner;

public class LlamadaWhatsapp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String url = "https://api.whatsapp.com/send?phone=";

        System.out.println("---- Bienvenido al centro de llamadas por Whatsapp ----\n");

        System.out.println("Dame un numero para llamar");
        long numero = entrada.nextLong();

        System.out.print("Para llamar al numero "+ numero + " pulsa aqui -> " +url+numero);
    }
}
