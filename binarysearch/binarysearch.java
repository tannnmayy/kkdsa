public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 65, 654, 6543, 7654, 765456};
        int target = 6543;
        System.out.println(binarysearch(arr, target));
        // return the index 
        // return -1 if it doesnot exist 
    }
        static int binarysearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length -1;


            while(start <= end) {
                //find the middle element
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;

                }

            }
            return -1;  // if no relevent output found
        }
    }
