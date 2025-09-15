import java.util.Scanner;
public class Par_o_inpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");

        } else{
            System.out.println("El numero " + numero + " es inpar");
        } 
        scanner.close();


    }
}
