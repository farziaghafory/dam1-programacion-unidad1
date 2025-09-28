import java.util.Scanner;

public class CalculadoraImpuestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for base price
        System.out.print("Introduce el precio base: ");
        double precioBase = sc.nextDouble();

        // Calculate taxes
        double impuestoReducido = (precioBase / 100) * 4;
        double impuestoGeneral = (precioBase / 100) * 10;
        double impuestoEspecial = (precioBase / 100) * 21;

        // Display results formatted to 2 decimals
        System.out.printf("Impuesto 4%%: %.2f%n", impuestoReducido);
        System.out.printf("Impuesto 10%%: %.2f%n", impuestoGeneral);
        System.out.printf("Impuesto 21%%: %.2f%n", impuestoEspecial);

        sc.close();
    }
}
