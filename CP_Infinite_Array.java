// when you have to find a target element in an infinitely long array, i.e. don't know the size of the array 
// ques from gfg.
// Binary Search used

public class CP_Infinite_Array {
    public static void main(String[] args) {
        
    }
    static int ans(int[] arr, int target){
        // First find the Range
        // First start with the box of size two.
        int start = 0; 
        int end = 1;

        // Condition for the target to lie in the range:

        while(target > arr[end]){
            int newStart = end + 1;
            // end = previous end + size of box * 2;
            int newEnd = 
        }
    }
    static int binarySearch(int[]arr, int target, int start, int end){
        
        while(start <= end){
            // Find the middle element
            // int mid = (start + end)/2;
            int mid = start + ((end-start)/2);  // also written as : ((end - start)>>1);
            if (target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // Ans here
                return mid;
            }
        }
        return -1;
    }
}
