//say the question is print numbers from 1 to 5 

import java.util.Scanner;

public class loops {
    public static void main(String[]args){

      /*  for (int num=1; num <= 4; num +=1){
            System.out.println(num);
        }
*/ 

        //PRINT NUMBERS FROM 1-N (N IS USER INPUT)

        Scanner in = new Scanner(System.in);
        System.out.println("please enter an integer");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("hello world");
            
        }
    }
}
