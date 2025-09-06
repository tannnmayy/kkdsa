import java.util.Arrays;
import java.util.Scanner;


public class twodim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // [3 rows] [3 coloums]

       // int [] [] arr = new int[3][];

       // int [][] arr2d= {
      //      {1 , 2 , 3},     //0th index
       //     {4 , 5},      //1st index
       //     {6 , 7 , 8 , 9}   //2nd index
       // };


       //Creating a 3x3 array 
        int [][] arr = new int[3][3];
        System.out.println("number of rows" + arr.length); //number of rows
        
        

        //input values
        System.out.println("enter 9 integers:");

         for (int row = 0; row < arr.length; row++) {
            // for every coloum in every row 
            for (int col=0; col< arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));

        in.close();
    }
    
}
