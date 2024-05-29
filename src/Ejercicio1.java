import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int precio;
        double iva;
        int numeroAmigos;

        System.out.println("Precio del regalo: ");
        precio = entrada.nextInt();

        System.out.println("IVA aplicado: ");
        iva = entrada.nextDouble();
        if(iva >=1 && iva <= 99){
            System.out.println(iva);
        }



       precioFinal(precio, iva);

        System.out.println("Una vez sumado el IVA el precio aplicado es : " +precioFinal(precio, iva));

        System.out.println("Numero de amigos que van a participar en la compra del regalo: ");
        numeroAmigos = entrada.nextInt();

        precioTotal(numeroAmigos, precioFinal(precio, iva));
        System.out.println("cada amigo tiene que pagar: " +precioTotal(numeroAmigos, precioFinal(precio, iva)));

    }

    private static double precioTotal(int numeroAmigos, double precioFinal) {
        return precioFinal / numeroAmigos;
    }

    public static double precioFinal(int precio, double iva) {
        double calcularIVA = (precio * iva) / 100;
        return calcularIVA + precio;
    }

}
