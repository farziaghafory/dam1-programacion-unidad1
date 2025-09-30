import java.util.Scanner;

public class BateriaMovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bateria = 100; // battery starts at 100%

        // Ask user
        System.out.print("Videos reproducidos: ");
        int videos = sc.nextInt();

        System.out.print("Cargas rápidas realizadas: ");
        int cargas = sc.nextInt();

        // Calculate
        bateria += cargas * 25 - videos * 15;

        // battery stays between 0 and 100

        bateria = Math.min(100, bateria);
        bateria = Math.max(0, bateria);

        // Show result
        System.out.println("Batería final: " + bateria);

        sc.close();
    }
}
