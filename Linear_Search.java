import java.util.Arrays;

public class Linear_Search {
    /* 
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for( int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;   // This line will execute if none of the return statements
                     // have executed, hence the target not found.
    }
    
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for( int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    // Return the minimum value in the array
    static int min(int[]arr){
        int ans = arr[0];
        for( int i = 0; i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    */
    static int[] search(int[][]arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        /* 
        int[]nums = {23,45,1,2,3,8,19,34,78,-12,-78,34};
        int target = 34;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
        String name = "Harshal";
        char target = 'h';
        boolean ans = search(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
        
        int[]nums = {23,45,1,2,3,8,19,34,78,-12,-78,34};
        System.out.println(min(nums));
        */
        int[][]arr = {
            {23,4,56,4},
            {67,567,34,43},
            {5,3,78},
            {23,6}
        };
        int target = 78;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
