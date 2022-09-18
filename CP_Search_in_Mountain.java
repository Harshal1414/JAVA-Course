// https://leetcode.com/problems/find-in-mountain-array/
public class CP_Search_in_Mountain {
    public static void main(String[] args) {
        
    }
    public int search(int[] arr, int target){
        
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to Search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        
        while(start <= end){
            int mid = start +(end-start)/2;
            res = mid;
            if(arr[mid] >= arr[mid + 1]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target,int start, int end){

        // find wheather the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            // Find the middle element
            // int mid = (start + end)/2;
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if (target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid-1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
