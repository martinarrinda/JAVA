import java.util.Scanner;
public class Mayor_o_menor {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuce tu edad: ");
        int numero = scanner.nextInt();
        if (numero >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");

        }
        scanner.close();
        }
    }

