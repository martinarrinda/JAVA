import java.util.Scanner;
import java.util.ArrayList;
public class Gestor_de_tareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        while (true) {
            System.out.println("1. Añadir tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar tareas");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion 1-4: ");
            int opciones = scanner.nextInt();
            if (opciones == 1) {
                 System.out.println("Escribe la tarea:");
                 scanner.nextLine();
                 String nueva_tarea = scanner.nextLine();
                 tareas.add(nueva_tarea);
                 System.out.println("Tarea añadida");
            }
            else if(opciones==2){
                for(String tarea: tareas){
                    System.out.println(tarea);
                }
            }
            else if (opciones==3){
                System.out.println("Que tareas has completado? ");
                int que_tareas = scanner.nextInt();
                tareas.remove(que_tareas-1);
                System.out.println("Tarea eliminada");

            }
            else if(opciones==4){
                System.out.println("Saliendo...");
                scanner.close();
                break;
            }
        }

    }   
   
}
