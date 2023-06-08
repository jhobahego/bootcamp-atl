package clase6;

import java.util.Scanner;

public class HistoriaInteractiva {
    static StringBuilder historia = new StringBuilder();


    public static void main(String[] args) {
        System.out.println("Hace muchos años en un antiguo reino, vivía un valiente llamado Sir Arthur. ");
        System.out.println("Sir Arthur era conocido por sus azañas y su espada magica, excalibur.");
        System.out.println("Un dia el rey del reino llamo a Sir Arthur para encomendarle un misión especial\n");

        System.out.println("Opcion 1: Sir Arthur acepta la misión de inmediato");
        System.out.println("Opcion 2: Sir Arthur pregunta al rey más detalles sobre la misión");
        System.out.println("Opcion 3: Sir Arthur decide pedir un consejo a su sabio mentor antes de tomar una decisión");

        Scanner entrada = new Scanner(System.in);
        byte opcion = entrada.nextByte();

        if(opcion == 1) {
            System.out.println("Sir Arthur acepta la misión de inmediato y se dirige hacia el oscuro Bosque Prohibido en busca de un antiguo tesoro perdido.");
            System.out.println("En su camino, se encuentra con criaturas mágicas y supera numerosos obstáculos.");
            System.out.println("Finalmente, encuentra el tesoro y regresa triunfante al reino.");
        } else if(opcion == 2){
            System.out.println("Sir Arthur pregunta al rey más detalles sobre la misión. Descubre que la misión implica rescatar a la princesa secuestrada por un malvado hechicero.");
            System.out.println("Sir Arthur se prepara cuidadosamente y se adentra en el castillo del hechicero.");
            System.out.println("Después de una épica batalla, logra derrotar al hechicero y liberar a la princesa.");
        } else if(opcion == 3) {
            System.out.println("Sir Arthur decide pedir consejo a su sabio mentor antes de tomar una decisión.");
            System.out.println("Su mentor le ofrece valiosos consejos y le sugiere que medite sobre lo que realmente desea hacer.");
            System.out.println("Después de reflexionar, Sir Arthur decide aceptar la misión y se embarca en una aventura llena de peligros y desafíos.");
            System.out.println("Con su valentía y habilidad, logra superar todos los obstáculos y completar con éxito la misión.");
        } else {
            System.out.println("Introdusca una opción valida");
        }

    }
}