import java.util.Scanner;
public class Ejercicio_metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Cuales elnombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Introduce la primera nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Introduce la primera nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("El promedio de " + nombre + " es: " + promedio(nota1, nota2, nota3));
        System.out.println("Estado: " + estado(nota1, nota2, nota3));
        scanner.close();

        
    }
    public static int promedio (int nota1,int nota2, int nota3) {
        return((nota1+nota2+nota3)/3);
        }
    public static String estado (int nota1, int nota2, int nota3){
        if (promedio(nota1, nota2, nota3) >= 5){
            return "Aprobado";
        }
        else {
            return "Suspendido";
        }
    }
}
