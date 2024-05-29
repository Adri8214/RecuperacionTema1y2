import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio;


do {

    Random random = new Random();

  numeroAleatorio = random.nextInt();

    if (numeroAleatorio >= -20 && numeroAleatorio <= 20) {
        System.out.println(numeroAleatorio);
    } else if (numeroAleatorio % 3 == 0) {
        System.out.println(numeroAleatorio);
    }
}while (numeroAleatorio > 15);
    }
}
