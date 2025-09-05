import java.util.Arrays;

public class value {
    
    public static void main(String[] args) {
        //creating an array
        int[] arr = {1,2,3,4,54,43};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99;
        nums[3] = 99;   // if we make a change in the object via this reference variabl, the same object will be changed


    }
}

