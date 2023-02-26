import java.util.*;

public class Multidimentional_array {
    public static void main(String[] args) {
        /* 
        // MUltidimentional arrays are array of arrays.
        // Each element is individually an array!
        // Array in previous file was a 1D array.
        int [] marks;   // 1D Array
        int[][] flats;   // 2D Array
        flats = new int[2][3];  // Assume it as 2 rows and 3 columns.  // Here length is 2.
        
        flats [0][0] = 101;
        flats [0][1] = 101;
        flats [0][2] = 102;
        flats [1][0] = 200;
        flats [1][1] = 201;
        flats [1][2] = 202;

        // System.out.println(flats[0][2]);
        for(int i=0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){   // 2 loops for 2D Array, 3 loops for 3D array and so on.
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
        // Similarly for 3D or 4D etc.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        // Taking input

        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // Giving output

        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        // or
        System.out.println("now Using toString method");
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        
        int [][] arr ={
            {1,2,3},   // 0th index
            {4,5},   // 1st index
            {6,7,8,9}   // 2nd index  -- arr2D[2]= {6,7,8,9}
        };
        for (int row=0; row<arr.length; row++){
            for( int col=0; col<arr[row].length; col++){
                System.out.print(arr[row] [col] + " ");
            }
            System.out.println();
        }
        */
    }
}
