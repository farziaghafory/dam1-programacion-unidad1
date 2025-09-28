import java.util.Scanner;

public class LeetName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the nickname
        System.out.print("Introduce tu nickname: ");
        String nickname = sc.nextLine();

        // Convert to leet
        String leet = nickname.replace("a", "4")
        .replace("e", "3")
        .replace("i", "1")
        .replace("o", "0")
        .replace("u", "_");

        // Display result
        System.out.println("Versión leet: " + leet);

        sc.close();
    }
}
