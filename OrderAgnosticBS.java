public class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find wheather the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // Find the middle element
            // int mid = (start + end)/2;
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if(isAsc){
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
    
    public static void main(String[] args) {
        int [] arr = {2,4,6,9,12,14,16,18,22,24,26,28,56};
        int target = 16;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
}
