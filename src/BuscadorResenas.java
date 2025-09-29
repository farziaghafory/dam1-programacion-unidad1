import java.util.Scanner;

public class BuscadorResenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the product review
        System.out.print("Introduce una reseña: ");
        String reseña = sc.nextLine();

        // Find first and last occurrence of 'a'
        int primeraA = reseña.indexOf('a');
        int ultimaA = reseña.lastIndexOf('a');

        // Check if it contains "excelente"
        boolean contieneExcelente = reseña.contains("excelente");
        
        // Display results
        System.out.println("Primera 'a': " + primeraA);
        System.out.println("Última 'a': " + ultimaA);
        System.out.println("¿Contiene 'excelente'? " + contieneExcelente);

        sc.close();
    }
}

