import java.util.*;

public class DynamicArrays_ArrayList {
    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[]arr){
        int maxVal = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        /* 
        ArrayList <Integer> list = new ArrayList<>(10);
        
        list.add(23);
        list.add(23);
        list.add(233);
        list.add(323);
        list.add(256);
        list.add(23234);
        System.out.println(list);
        */
        // Swapping values in an array
        int[]arr = {1,2,3,4,5};
        swap(arr, 2,4);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
    }
}
