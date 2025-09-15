import java.util.Scanner;
public class Numero_mayor_o_menor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int primer_numero  = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int segundo_numero  = scanner.nextInt();
        if (primer_numero > segundo_numero){
            System.out.println(primer_numero + " Es mas grande que " + segundo_numero);
        }
        else{
            System.out.println(segundo_numero + " Es mas grande que " + primer_numero);

        }
        scanner.close();

    }
}
