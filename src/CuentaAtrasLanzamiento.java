import java.util.Scanner;

public class CuentaAtrasLanzamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ask for the Age
        System.out.print("Introduce your real age: ");
        int añoActual = sc.nextInt();
        
        //Introduce year of 
        System.out.print("Introduce year of lanzamiento: ");
        int añoLanzamiento = sc.nextInt();

        //Opration
        int añosFaltan = añoLanzamiento - añoActual;
        System.out.println("Faltan " + añosFaltan + " años para el lanzamiento.");

        sc.close();
    }
}
