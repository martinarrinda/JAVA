import java.util.Scanner;
public class Cuenta_bancaria {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double dinero = 0;
        while (true) {
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opcion 1-4:");
        int opcion = scanner.nextInt();
        if (opcion == 1){
            System.out.println("Cuanto dinero quieres depositar? ");
            int depositar  = scanner.nextInt();
            dinero = (dinero + depositar);
    
        } 
        else if (opcion == 2){
            System.out.println("Cuanto dinero quieres retirar? ");
            int retirar  = scanner.nextInt();
            dinero = (dinero - retirar);
        }
        else if (opcion ==3) {
            System.out.println("Tienes " + dinero+ " euros en tu cuenta bancaria");
            
        }
        else if (opcion == 4) {
            scanner.close();
        }
    }
}
}
