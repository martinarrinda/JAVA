import java.util.Scanner;
public class Calculador_ritmos_carrera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== CALCULADORA DE RITMO ====");
            System.out.println("1. Calcular ritmo por kilómetro (min/km)");
            System.out.println("2. Salir");
            System.out.print("Elije una opcion 1-2: ");
            int opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones) {
                case 1:
                    System.out.println("Introduce tu distancia recorrida (en km): ");
                    int distancia = scanner.nextInt();
                    System.out.println("Tiempo total de la carrera (minutos): ");
                    int minutos = scanner.nextInt();
                    System.out.println("Tiempo total de la carrera (segundos): ");
                    int segundos = scanner.nextInt();
                    System.out.println("Tu ritmo en la distancia de " + distancia + " es de " + calcular_ritmo(distancia, minutos, segundos) + ".");
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    break;
            }

        }

        
    }
    public static String calcular_ritmo(int distancia, int minutos, int segundos){
        int Timepo_total_segundos = minutos * 60 + segundos;
        double ritmo_segundos_por_km = (double)Timepo_total_segundos/distancia;
        int ritmo_minutos = (int) (ritmo_segundos_por_km / 60);
        int ritmo_segundos = (int) (ritmo_segundos_por_km % 60);
        return ritmo_minutos + ":" + ritmo_segundos + " min/km";
    }
}
