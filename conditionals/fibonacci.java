import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int p = 0;   //say p stand for previous 
        int i = 1;   //say i stands for first number
        int count = 2;

        while (count <= n ) {
            int temp = i;
            i = i = p;
            p = temp;
            count++;

        }
    }
}