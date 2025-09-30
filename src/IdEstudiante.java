import java.util.Scanner;

public class IdEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el ciclo: ");
        String ciclo = sc.nextLine();

        System.out.print("Introduce el año de matrícula: ");
        String anio = sc.nextLine();

        // Generate ID
        String id = nombre.substring(0, Math.min(2, nombre.length())) +
                ciclo.substring(0, Math.min(3, ciclo.length())) + anio;

        // Display ID
        System.out.println("Tu ID es: " + id);

        sc.close();
    }
}
