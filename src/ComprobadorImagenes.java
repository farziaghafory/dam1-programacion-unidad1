import java.util.Scanner;

public class ComprobadorImagenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the image filename
        System.out.print("Introduce name of the archivo: ");
        String nombreArchivo = sc.nextLine();

        // Check if it starts with "photo_" and ends with ".jpg"
        boolean empiezaCon = nombreArchivo.startsWith("photo_");
        boolean terminaCon = nombreArchivo.endsWith(".jpg");
        
        // Display results
        System.out.println("¿Empieza con 'photo_'? " + empiezaCon);
        System.out.println("¿Termina con '.jpg'? " + terminaCon);

        sc.close();
    }
}
