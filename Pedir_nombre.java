import java.util.Scanner;
public class Pedir_nombre {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner (System.in) ;

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + "!");

        scanner.close();

    }
}
