import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Example usage of sum3
        int ans = sum3(20, 40);
        System.out.println("sum3 is: " + ans);

        // Example usage of sum2
        int ans2 = sum2();
        System.out.println("sum2 is: " + ans2);

        // Example usage of sum
        sum();
    }

    // Method to sum two given numbers
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Method to take input from user and return the sum
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

    // Method to take input from user and directly print the sum
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}

    