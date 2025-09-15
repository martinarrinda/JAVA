import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        float nota = scanner.nextFloat();
        if (nota > 5){
            System.out.println("Has aprobado");
        }
        else{
            System.out.println("Has suspendido");
        }
        scanner.close();
    }
}
