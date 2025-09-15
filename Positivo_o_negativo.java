import java.util.Scanner;
public class Positivo_o_negativo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();
        if (numero ==0 ){
            System.out.println("El numero es 0");
        }
        else if(numero < 0 ){
            System.out.println("El numero es negativo");
        }
        else if (numero > 0 ) {
            System.out.println("El numero es positivo");
        }
        scanner.close();
    }
}
