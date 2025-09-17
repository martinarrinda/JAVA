import java.util.Scanner;
public class Juego_adivinar_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_aleatorio = (int) (Math.random() * 100);
        while(true){
            System.out.println("Adivina el numero generado del 0-100: ");
            int numero_usuario = scanner.nextInt();
            if (numero_aleatorio > numero_usuario){
                System.out.println("Tu numero es mas bajo que el de la maquina. Sigue intentandolo.");
            }
            else if(numero_aleatorio < numero_usuario){
                System.out.println("Tu numero es mas alto que el de la maquina. Sigue intentandolo.");
            }
            else if(numero_aleatorio == numero_usuario){
                System.out.println("Has aceratdo el numero!");
                scanner.close();
                break;
            }

        }
    }
}
