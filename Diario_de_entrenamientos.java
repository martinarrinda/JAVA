import java.util.Scanner;
import java.util.ArrayList;

public class Diario_de_entrenamientos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Tipo = new ArrayList<>();
        ArrayList<Integer> Duracion = new ArrayList<>();
        ArrayList<Integer> Calorias = new ArrayList<>();

        while (true) {
            System.out.println("Que tipo de ejercicio has echo hoy? ");
            String ejercicio = scanner.nextLine();
            Tipo.add(ejercicio);

            System.out.println("Cuantos minutos a durado el entrenamiento? ");
            Integer minutos = scanner.nextInt();
            Duracion.add(minutos);

            System.out.println("Cuantos calorias has quemado? ");
            Integer kcal = scanner.nextInt();
            Calorias.add(kcal);

            System.out.println("Quieres ver las estadisiticas semanales?");
            scanner.nextLine(); 
            String pregunta = scanner.nextLine();

            if (pregunta.equalsIgnoreCase("Si")) {
                while (true) {
                    System.out.println("1. Ver todas las sesiones registradas.");
                    System.out.println("2. Mostrar el total de minutos entrenados en la semana.");
                    System.out.println("3. Mostrar el total de calorías quemadas.");
                    System.out.println("4. Volver al menu principal");
                    System.out.print("Elige una opcion 1-4: ");
                    int opciones = scanner.nextInt();
                    scanner.nextLine();

                    if (opciones == 1) {
                        if (ejercicio.isEmpty()) {
                            System.out.println("No tienes ningun ejercicio registrado.");
                        } 
                        else {
                            for (String todos_ejercicios : Tipo) {
                                System.out.println(todos_ejercicios);
                            }
                        }
                    }

                    if (opciones == 2) {
                        if (Duracion.isEmpty()) {
                            System.out.println("No tienes ningun ejercicio registrado.");
                        } 
                        else {
                            int total_entrenado = 0;
                            for (Integer minutos_registrados : Duracion) {
                               total_entrenado += minutos_registrados;
                            }
                            System.out.println("Esta semana has entrenado un total de " + total_entrenado + " minutos.");
                        }
                    }

                    if (opciones == 3){
                        if (Calorias.isEmpty()) {
                            System.out.println("No tienes ningun ejercicio registrado.");
                        } 
                        else {
                            int total_quemado= 0;
                            for (Integer kcal_quemadas : Calorias) {
                                total_quemado += kcal_quemadas;
                            }
                            System.out.println("Esta semana has quemado un total de " + total_quemado + " calorias.");
                        }
                    }
                    if (opciones == 4){
                        System.out.println("Saliendo al menu principal...");
                        break;
                    }
                }
            }
            System.out.println("Quieres salir del programa?");
            String salir = scanner.nextLine();
            if (salir.equalsIgnoreCase("Si")){
                scanner.close();
                return;
            }
        }
        
    }
}
