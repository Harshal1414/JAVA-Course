import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        // HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        // myHashSet.add(4);
        // myHashSet.add(6);
        // myHashSet.add(7);
        // myHashSet.add(12);
        // System.out.println(myHashSet);

        int[] arr = takeInput();
        print(arr);
        
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int [] arr){
        int limit = arr.length;
        for (int i = 0; i< limit; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
