import java.util.Scanner;
public class Registro_de_contraseñas_seguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Ingresa una constraseña: ");
            String contraseña = scanner.next();
            boolean esValida = true;
            if (contraseña.length()< 8 ) {
                System.out.println("Tu contraseña no tiene mas de  8 caracteres.");
                esValida = false;
            } 
            if (!contraseña.matches(".*[A-Z].*")){
                System.out.println("Tu contraseña no tiene ni una mayuscula");
                esValida = false;
            }
            if (!contraseña.matches(".*[0-9].*")){
                System.out.println("Tu contraseña no tiene ni un numero.");
                esValida = false;
            }
            
            if (!contraseña.matches(".*[!@#$%^&*()].*")){
                System.out.println("Tu contraseña no tiene ningun caracter especial.");
                esValida = false;
            }
            
            if (esValida){
                System.out.println("Tu contraseña es segura.");
                break;
            }
        }
    scanner.close(); 
    }
}


