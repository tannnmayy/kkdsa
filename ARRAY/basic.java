public class basic {
    public static void main(String[] args) {
        
    // syntax
    //datatype[] variable_name = new datatype[size]
    // store 5 roll numbers:

    int[] rollno = new int[5];
    //or directly write it as 
    int[] rollno2 = {23, 45, 65, 654, 54};


    
    int[] ros;           //declaration of array. ros is getting defined in the stack 
    ros = new int[5];    // initiliasation: actually here the object is being created in the heap memory 
    System.out.println(ros[1]);


    String[] arr = new String[4];
    System.out.println(arr[0]);

    


    }
}

