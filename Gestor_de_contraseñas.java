import java.util.Scanner;
public class Gestor_de_contraseñas {
    public static void main(String[] args) {
        String guardar_contraseña = null;
        String nueva_contraseña = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("==== GESTOR DE CONTRASEÑAS ====");
            System.out.println("1. Crear una nueva contraseña");
            System.out.println("2. Verificar una contraseña");
            System.out.println("3. Salir");
            System.err.println("Selecciona una opcion 1-3: ");
            int opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones) {
                case 1:
                    System.out.println("Introduce la contraseña: ");
                    guardar_contraseña = scanner.nextLine();
                    System.out.println("Contraseña guardada");
                    if(esegura(guardar_contraseña)){
                        System.out.println("Contraseña segura");
                    }
                    else{
                        System.out.println("Contraseña insegura");
                    }
                    break;
                case 2:
                    System.out.println("Introduce la contraseña: ");
                    nueva_contraseña = scanner.nextLine();
                    if(coincide(guardar_contraseña, nueva_contraseña)){
                        System.out.println("Contraseña correcta");
                    }
                    else{
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    break;
            }
        }
        
    }
    public static boolean esegura (String guardar_contraseña){
        return guardar_contraseña.length() >= 8
        && guardar_contraseña.matches(".*[A-Z].*")   
        && guardar_contraseña.matches(".*[0-9].*");  
    }
    public static boolean coincide(String guardar_contraseña, String nueva_contraseña){
        return nueva_contraseña.trim().equals(guardar_contraseña);
    }
}
