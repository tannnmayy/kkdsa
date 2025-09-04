import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        System.out.println("Hey, how are you?");
        Scanner input = new Scanner(System.in);

        // Example usage:
        String reply = input.nextLine();
        System.out.println("You said: " + reply);

        input.close(); // good practice
    }
}
