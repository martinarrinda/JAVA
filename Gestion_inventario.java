import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Gestion_inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();
        while (true){
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");  
        System.out.println("3. Salir del programa.");
        System.out.print("Seleciona una opcion 1-3: ");
        int opciones = scanner.nextInt();
        scanner.nextLine();
        switch (opciones) {
            case 1:
                agregar_producto(inventario, scanner);
                break;
            case 2:
                mostrar_productos(inventario, scanner);
                break;
            case 3:
                System.out.println("Saliendo...");
                scanner.close();
                break;
            default:
                break;
        }
        
        }
    }
    public static void agregar_producto(Map<String, Integer> inventario, Scanner scanner){
        System.out.println("Introduce el nombre del stock: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el stock del producto: ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        inventario.put(nombre,stock);
        System.out.println("Producto agregado correctamente");
    }

    public static void mostrar_productos(Map<String, Integer> inventario, Scanner scanner){
        if(inventario.isEmpty()){
            System.out.println("Inventario vacio.");
        }
        else{
            for(Map.Entry<String, Integer> producto : inventario.entrySet()){
                System.out.println("Producto: " + producto.getKey() +" Stock: " + producto.getValue());

            }
        }
    }
}
