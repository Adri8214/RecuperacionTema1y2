import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero equivalente a x1: ");
        double x1 = entrada.nextInt();

        System.out.println("Introduce el numero equivalente a y1: ");
        double y1 = entrada.nextInt();

        System.out.println("Introduce el numero equivalente a x2: ");
        double x2 = entrada.nextInt();

        System.out.println("Introduce el numero equivalente a y2: ");
        double y2 = entrada.nextInt();

        System.out.println("Distancia = " + distancia(x1, y1, x2, y2));
        
        distancia(x1, y1, x2, y2);
    }

    public static double distancia(double x1, double y1, double x2, double y2 ) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
