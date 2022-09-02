import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        
        // There are three main ways to create an array in Java.

        // 1. Declaration and memory allocation.
        //int [] Marks = new int[5];

        // 2. Declaration and then memory allocation.
        // Initialiazation.
        // int[] Marks;
        // Marks = new int[5];
        // Marks [0] = 78;
        // Marks [1] = 98;
        // Marks [2] = 91;
        // Marks [3] = 67;
        // Marks [4] = 89;
        // Marks [5] = 99;   // Throws an ERROR.

        // 3. Declaration, memory allocation and initialization together.
        int[] Marks = {98, 87, 76, 65, 54, 43, 32, 21};
        // System.out.println(Marks[7]);   // Returns the value at index 7.
        // System.out.println(Marks.length);   // Returns the length of the array.

        // Using for loop.
        System.out.println("Printing using for loop");
        for ( int i = 0; i<Marks.length;i++){
            System.out.println(Marks[i]);
        }

        // Displaying the array using for each loop.

        System.out.println("Printing using for each loop");
        for(int element : Marks){
            System.out.println(element);
        }
        
        // Displaying the array using toString method
        
        int [] nums = {3,4,5,6,7,9};
        System.out.println(Arrays.toString(nums));
        */
        int [] nums = {3,4,5,6,7,9};
        System.out.println(Arrays.toString(nums));
    }
}
