// when you have to find a target element in an infinitely long array, i.e. don't know the size of the array 
// ques from gfg.
// Binary Search used

import java.util.Scanner;
public class CP_Infinite_Array {
    private static int temp;
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,9,10,13,17,19,21,24,28,29,32,37,56,78,90,432};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // First find the Range
        // First start with the box of size two.
        int start = 0; 
        int end = 1;

        // Condition for the target to lie in the range:

        while(target > arr[end]){
            int temp = end + 1;  // This is the new Start.
            // end = previous end + size of box * 2;
            // Size of Box = (end - start + 1);
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
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
