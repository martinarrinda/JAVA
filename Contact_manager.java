import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Contact_manager {
    public static void main(String[] args) {
        Map<String, String> contactos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Agregar un nuevo contacto");
            System.out.println("2. Mostrar todos los contactos");
            System.out.println("3. Buscar un contacto por DNI");
            System.out.println("4. Eliminar un contacto por DNI.");
            System.out.println("5. Mostrar cuántos contactos hay");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion 1-6: ");
            int opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones) {
                case 1:
                    agregar(scanner, contactos);
                    break;
                case 2:
                    leer(contactos);
                    break;
                case 3:
                    Buscar(contactos, scanner);
                    break;
                case 4:
                    eliminar(contactos, scanner);
                    break;
                case 5:
                    lineas(contactos, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    break;
            }

        }
    }
    public static void agregar(Scanner scanner,  Map<String, String> contactos){
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el DNI: ");
        String dni = scanner.nextLine();
        contactos.put(dni,nombre);
        }
    public static void leer(Map<String, String> contactos){
        for(Map.Entry<String, String> entry: contactos.entrySet()){
            System.out.println("DNI: " + entry.getKey() + "," + " NOMBRE: " + entry.getValue());
        }
        }

    public static void Buscar(Map<String , String> contactos, Scanner scanner){
        System.out.println("Que DNI quieres buscar: ");
        String buscar_dni = scanner.nextLine();
        if(contactos.containsKey(buscar_dni)){
            System.out.println("DNI: " + buscar_dni  + ", Nombre: " + contactos.get(buscar_dni));
        }
        else{
            System.out.println("Contacto no encontrado.");
        }
    }
    public static void lineas(Map<String , String> contactos, Scanner scanner){
        int numero_lineas = contactos.size();
        System.out.println("Total de contactos: " + numero_lineas);
    }
    public static void eliminar(Map<String , String> contactos, Scanner scanner){
        System.out.println("Que DNI quieres eliminar: ");
        String elimnar_dni = scanner.nextLine();
        if(contactos.containsKey(elimnar_dni)){
            contactos.remove(elimnar_dni);
            System.out.println("Conatcto eliminado");
        }
        else{
            System.out.println("Contacto no encontrado.");
        }
    }
    
    }

