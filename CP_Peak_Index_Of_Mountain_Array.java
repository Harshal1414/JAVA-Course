// Mountain array = Firstly increasing then decreasing 
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class CP_Peak_Index_Of_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,72,8,4,2,1};
        System.out.println(peakIndexInMountainArray(arr));
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
}
