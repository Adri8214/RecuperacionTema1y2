import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        numero = entrada.nextInt();

        for (int i = 1; i <=numero ; i++) {
            if(numero %2 == 0){
                System.out.println(numero % 2);
            }
        }
    }
}
