import java.util.Scanner;
import java.util.ArrayList;
public class Cajero_automatico_virtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dinero = new ArrayList<>();
        System.out.println("Bienvenido usario, elige tu PIN: ");
        String pin_creado = scanner.nextLine();
        int contador = 0;
        while (contador < 3) {
            System.out.println("Introduzca su PIN para iniciar sesion: ");
            String iniciar_sesion = scanner.nextLine();
            if (pin_creado.equals(iniciar_sesion)){
                System.out.println("Sesion iniciada correctamente.");
                break;
            }
            contador +=1;
        }
        while (true){
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion 1-4: ");
            int opcion = scanner.nextInt();
            if(opcion ==1){
                if (!dinero.isEmpty()){
                    System.out.println("Tienes " + dinero.get(0) +" euros en tu cuenta.");
                }
                else{
                    System.out.println("Saldo insuficiente.");
                }
            }
            if (opcion==2){
                System.out.println("Cuantos euros quieres depositar en tu cuenta? ");
                int deposito = scanner.nextInt();
                if (dinero.isEmpty()){
                     dinero.add(deposito);
                }
                else{
                    int saldo_actual = dinero.get(0);
                    dinero.set(0, deposito + saldo_actual);
                }
                System.out.println(deposito + " euros depositados en tu cuenta.");
            }
            if (opcion == 3){
                System.out.println("Cuantos euros quieres retirar de tu cuenta? ");
                int retirar = scanner.nextInt();
                if (dinero.isEmpty()){
                    System.out.println("Saldo insuficiente");;
                }
                else {int saldo = dinero.get(0);
                dinero.set(0, saldo - retirar);
                System.out.println(retirar + " euros retirados de tu cuenta.");
                }

            }
            if (opcion == 4) {
                    System.out.println("Saliendo...");
                    break;
                } 
                 
        }
    scanner.close();
    }
}
