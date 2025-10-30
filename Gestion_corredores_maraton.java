import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Gestion_corredores_maraton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> registro = new HashMap<>();
        while (true) {
            System.out.println("1. Agregar un corredor");
            System.out.println("2. Mostrar todos los corredores");
            System.out.println("3. Buscar un corredor específico");
            System.out.println("4. Salir del programa");
            System.out.print("Seleciona una opcion 1-4: ");
            int opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones) {
                case 1:
                    agregar_corredor(registro, scanner);
                    break;
                case 2:
                    mostrar_corredores(registro, scanner);
                    break;
                case 3:
                    buscar_nombre(registro, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }
    public static void agregar_corredor(Map<String, Integer> registro, Scanner scanner) {
        System.out.println("Introduce el nombre del corredor: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce los minutos del PR de " + nombre + " en 42KM: ");
        int minutos = scanner.nextInt();
        System.out.println("Introduce los segundos del PR de " + nombre + " en 42KM: ");
        int segundos = scanner.nextInt();
        scanner.nextLine();
        int tiempoTotal = minutos * 60 + segundos;
        registro.put(nombre, tiempoTotal);
        }
    public static void mostrar_corredores(Map<String, Integer> registro, Scanner scanner){
        if(registro.isEmpty()){
            System.out.println("Registro vacio, ve a la opcion 1 para añadir.");
        }
        else{
            for (Map.Entry<String, Integer> entrada : registro.entrySet()) {
                int tiempo = entrada.getValue(); 
                int minutos = tiempo / 60;       
                int segundos = tiempo % 60;  
                System.out.println("Nombre: " + entrada.getKey() + " | Tiempo: " + minutos + "m " + segundos + "s");
            }       
        }
    }
    public static void buscar_nombre(Map<String, Integer> registro, Scanner scanner) {
    System.out.println("Como se llama el nombre del corredor que quieres buscar?");
    String nombre_corredor = scanner.nextLine();
    if (registro.containsKey(nombre_corredor)) {
        int tiempoTotal = registro.get(nombre_corredor);
        int minutos = tiempoTotal / 60;
        int segundos = tiempoTotal % 60;
        System.out.println("El corredor " + nombre_corredor + " tiene un tiempo de PR de: " + minutos + "m " + segundos + "s"); 
    } 
    else {
        System.out.println("No se encontró un corredor con ese nombre.");
    }
    }
}
