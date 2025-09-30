import java.util.Scanner;

public class CuentaAtrasLanzamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ask for the Age
        System.out.print("Introduce your real age: ");
        int anioActual = sc.nextInt();
        
        //Introduce year of 
        System.out.print("Introduce year of lanzamiento: ");
        int anioLanzamiento = sc.nextInt();

        //Opration
        int aniosPendientes = anioLanzamiento - anioActual;
        aniosPendientes = Math.max(0, aniosPendientes);


        System.out.printf("Faltan %d  años para el lanzamiento.",aniosPendientes);

        sc.close();
    }
}
