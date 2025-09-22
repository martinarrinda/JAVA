import java.util.Scanner;
public class Lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador_user  = 0;
        String user = "admin";
        boolean usuario = false;
        while (contador_user < 3 ){
            System.out.println("Bienvenido, introduce tu nombre de usuario: ");
            String usuario_input = scanner.nextLine();
            if (user.equals(usuario_input)){
                System.out.println("Usuario correcto");
                usuario = true;
                break;
            }
            contador_user +=1;
        }

        if (!usuario){
                System.out.println("Usuario incorrecto. Saliendo...");
                scanner.close();
                return;
            }
        
        boolean contraseña = false;
        String contraseña_verdadera = "1234seguro";
        int contador_contraseña  = 0;
        while (contador_contraseña < 3 ){
            System.out.println("Ahora introduce tu contraseña: ");
            String contraseña_input = scanner.nextLine();
            if (contraseña_verdadera.equals(contraseña_input)){
                System.out.println("Contraseña correcta");
                contraseña = true;
                break;
            }
            contador_contraseña +=1;
        }

        if (!contraseña){
                System.out.println("Contraseña incorrecta. Saliendo...");
                scanner.close();
                return;
            }
    String contraseña_actual = null;

        while (true) {
            System.out.println("1. Cambiar contraseña.");
            System.out.println("2. Verificar seguridad de la contraseña.");
            System.out.println("3. Salir.");
            System.out.print("Selecciona una opción (1-3): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                System.out.print("Introduce tu nueva contraseña: ");
                contraseña_actual = scanner.nextLine();
                System.out.println("Contraseña cambiada exitosamente.");
            } 
            else if (opcion == 2) {
                if (contraseña_actual == null) {
                    System.out.println("No hay contraseña para verificar. Primero cambiala.");
                    continue;
                }

                boolean insegura = false;
                System.out.println("Verificando seguridad de la contraseña...");

                if (contraseña_actual.length() >= 8) {
                    System.out.println("Contraseña segura: tiene 8 o mas caracteres.");
                } else {
                    System.out.println("Contraseña insegura: menos de 8 caracteres.");
                    insegura = true;
                }

                if (contraseña_actual.matches(".*[A-Z].*")) {
                    System.out.println("La contraseña tiene mayusculas.");
                } else {
                    System.out.println("La contraseña no tiene mayusculas.");
                    insegura = true;
                }

                if (contraseña_actual.matches(".*[a-z].*")) {
                    System.out.println("La contraseña tiene minusculas.");
                } else {
                    System.out.println("La contraseña no tiene minusculas.");
                    insegura = true;
                }

                if (contraseña_actual.matches(".*[0-9].*")) {
                    System.out.println("La contraseña tiene numeros.");
                } else {
                    System.out.println("La contraseña no tiene numeros.");
                    insegura = true;
                }

                if (!insegura) {
                    System.out.println("La contraseña es segura.");
                } else {
                    System.out.println("La contraseña es insegura.");
                }

            } 
            else if (opcion == 3) {
                System.out.println("Saliendo...");
                scanner.close();
                break;
            } 
        }
    }
}
