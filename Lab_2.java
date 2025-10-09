import java.util.Scanner;
import java.util.ArrayList;
public class Lab_2 {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Mostrar contactos");
            System.out.println("2. Añadir contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Vaciar agenda");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion 1-6: ");
            int opciones =  scanner.nextInt();
            if (opciones == 1) {
                if(agenda.isEmpty()){
                    System.out.println("Todavia no tienes nigun contacto añadido. Ve a la opcion 2 para hacerlo.");
                }
                else{
                System.out.println("Mostrando agenda...");
                for(String contacto : agenda)
                System.out.println(contacto);
                }
            }
            else if(opciones == 2){
                scanner.nextLine();
                System.out.println("Como es el nombre completo de tu contacto? ");
                String nombre = scanner.nextLine();  
                boolean existe = false;
                for(String contacto : agenda){
                    if(contacto.startsWith(nombre + ".")){
                        System.out.println("Contacto existente");
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    continue; 
                }
                System.out.println("Cual es el telefono de tu contacto? ");
                int telefono = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Cual es el email de tu contacto? ");
                String email = scanner.nextLine();
                System.out.println("Cual es la direccion del contacto (solo el nombre de la calle)? ");
                String direccion = scanner.nextLine();
                agenda.add(nombre +"." + " Tlfno: " + Integer.toString(telefono) + "." + " Email: " + email + "."+ " Dirección: " + direccion+ ".");
            }
            else if (opciones == 3){
                scanner.nextLine(); 
                System.out.println("Cual es el nombre del contacto que quieres modificar?");
                String modificar = scanner.nextLine();
                String contactoEncontrado = null;
                for (String contacto : agenda) {
                    if (contacto.startsWith(modificar + ".")) {
                        contactoEncontrado = contacto;
                        break;
                    }
                }
                if (contactoEncontrado == null) {
                    System.out.println("No se encontro ningún contacto con ese nombre");
                    continue; 
                }
                System.out.println("Cual es el nuevo nombre?");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Cual es el nuevo teléfono?");
                String nuevoTelefono = scanner.nextLine();
                System.out.println("Cual es el nuevo email?");
                String nuevoEmail = scanner.nextLine();
                System.out.println("Cual es la nueva direccion?");
                String nuevaDireccion = scanner.nextLine();
                String nuevoContacto = nuevoNombre + "." + " Tlfno: " + nuevoTelefono + "." +
                                    " Email: " + nuevoEmail + "." +
                                    " Dirección: " + nuevaDireccion + ".";
                agenda.remove(contactoEncontrado);
                agenda.add(nuevoContacto);
                System.out.println("Contacto modificado correctamente.");
            }
            else if (opciones == 4){
                scanner.nextLine(); 
                System.out.println("¿Qué contacto quieres eliminar?");
                String eliminar = scanner.nextLine();
                String contactoEncontrado = null;
                for (String contacto : agenda) {
                    if (contacto.startsWith(eliminar + ".")) { 
                        contactoEncontrado = contacto;
                        break;
                        }
                }
                if (contactoEncontrado == null) {
                    System.out.println("No se encontro el contacto.");
                } 
                else {
                    agenda.remove(contactoEncontrado); 
                    System.out.println("Contacto eliminado correctamente.");
                }
            }
            else if(opciones == 5){
                System.out.println("Agenda vaciada");
                agenda.clear();
            }

            else if(opciones == 6){
                System.out.println("Fin del programa.");
                break;
            }
        }
    scanner.close();    
    }
}