import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("Introduce el primer numero: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");;
        System.err.println("Selecciona una opcion 1-4: ");
        int operacion = scanner.nextInt();
        scanner.nextLine();
        switch(operacion){
            case 1:
                System.out.println("El resultado es: " + sumar(a,b));
                break;
            case 2:
                System.out.println("El resultado es: " + resta(a,b));
                break;
            case 3:
                System.out.println("El resultado es: " + multi(a,b));
                break;
            case 4:
                System.out.println("El resultado es: " + division(a,b));
                break;
        }
        System.out.println("Quieres salir? si/no");
        String salir = scanner.nextLine();
        if (salir.equalsIgnoreCase("Si")){
            scanner.close();
            break;
        }
    }
    }
    public static int sumar(int a, int b){
        return(a+b);
    }
    public static int resta(int a, int b){
        return(a-b);
    }
    public static int multi(int a, int b){
        return(a*b);
    }
    public static double division(int a, int b){
        return(a/b);
    }   
}
