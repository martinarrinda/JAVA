import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Gestor_de_estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nombres = new HashSet<>();
        while (true){
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("3. Mostrar todos");
        System.out.println("4. Buscar estudiante");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opcion 1-5: ");
        int opciones = scanner.nextInt();
        scanner.nextLine();
        switch (opciones) {
            case 1:
                Agregar_estudiantes(nombres, scanner);
                break;
            case 2:
                eliminar_estudiante(nombres, scanner);
                break;
            case 3:
                mostrar(nombres);
                break;
            case 4:
                buscar(nombres, scanner);
                break;
            case 5:
                System.out.println("Saliendo...");
                scanner.close();
                break;
            default:
                break;
        }
    }

    }
    public static void Agregar_estudiantes (Set<String> nombres, Scanner scanner){
        System.out.println("Como se llama el estudiante? ");
        String estudiante = scanner.nextLine();
        nombres.add(estudiante); 
        System.out.println("Estudiante agregado");
    }

    public static void eliminar_estudiante(Set<String> nombres, Scanner scanner){
        System.out.println("Como se llama el estudiante que quieres eliminar? ");
        String eliminar = scanner.nextLine();
        if(nombres.contains(eliminar)){
            nombres.remove(eliminar);
            System.out.println("Estudiante eliminado.");
        }
        else{
            System.out.println("Estudiante no encontrado");
        }
    }

    public static void mostrar (Set<String> nombres){
        if (nombres.isEmpty()) {
        System.out.println("No hay estudiantes en la lista.");
        } 
        else {
        System.out.println("Lista de estudiantes:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
        }
    }

    public static void buscar(Set<String> nombres, Scanner scanner){
        System.out.println("A que estudiante quires buscar?");
        String buscar_estudiante = scanner.nextLine();
        if(nombres.contains(buscar_estudiante)){
            System.out.println("Estudiante encontrado en la lista");
        }
        else{
            System.out.println("Estudiante no encontrado.");
        }
    }
    
}


