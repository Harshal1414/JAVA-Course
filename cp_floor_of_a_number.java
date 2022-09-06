public class cp_floor_of_a_number {
    /* return the index of smallest no. >= target */
    static int binarySearch1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int [] arr = { 3,4,5,6,7,8,9,12,13,17,19,22,26,28};
        int target = 21;
        int ans = binarySearch1(arr, target);
        System.out.println(ans);
    }
}
