import java.util.Scanner;

public class AlmacenLibros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inventario = 120; // starting books

        // Ask for books received
        System.out.print("Introduce el nomber of books recibidos: ");
        int recibidos = sc.nextInt();

        // Ask for books loaned
        System.out.print("Introduce el nomber of books prestados: ");
        int prestados = sc.nextInt();

        // Update inventory using += and -=
        inventario += recibidos;
        inventario -= prestados;

        // Display final inventory
        System.out.printf("Inventario final: %d libros%n", inventario);

        sc.close();
    }
}
