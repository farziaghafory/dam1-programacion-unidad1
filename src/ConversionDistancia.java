import java.util.Scanner;

public class ConversionDistancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for distance in kilometers as text
        System.out.print("Introduce la distancia en kilómetros: ");
        String input = sc.nextLine();

        // Convert to double
        double km = Double.parseDouble(input);

        // Convert to meters
        double metros = km * 1000;

        // Display results formatted
        System.out.printf("Distancia en kilómetros: %.2f%n", km);
        System.out.printf("Distancia en metros: %.2f%n", metros);

        sc.close();
    }
}

