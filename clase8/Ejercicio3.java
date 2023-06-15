package clase8;

import java.util.Scanner;

public class Ejercicio3 {

    /*
        Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña, por ejemplo,
        puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tu nombre: ");
        String nombre = sc.nextLine();

        String contra = generarContra(nombre);
        System.out.print("Su contraseña es: " +contra);
    }

    static String generarContra(String nombre) {
        long random = (long) (Math.random() * 100000000);

        return nombre + random;
    }
}
