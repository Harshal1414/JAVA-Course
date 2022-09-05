public class Binary_Search {

    // It takes the middle element of the sorted array, and then search the target element on either side.

    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
    public static void main(String[] args) {
        int [] arr = {2,4,6,9,12,14,16,18,22,24,26,28,56};
        int target = 24;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}