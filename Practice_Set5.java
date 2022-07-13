public class Practice_Set5 {
    public static void main(String[] args) {
        // Practice Problem 1 :

        /*
        float[] Marks = {78.3f, 23.9f, 65.4f, 87.2f, 56.2f};
        float sum = 0;
        for(float element : Marks){
            sum = sum + element;
        }
        System.out.println("the sum of the elements of the given array is : " +sum);

        // Practice Problem 2 :

        float[] Marks = {78.3f, 23.9f, 65.4f, 87.2f, 56.2f};
        float num = 65.234f;
        boolean isInArray = false;
        for(float element : Marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("It is present in the array");
        }
        else{
            System.out.println("It is not present in the array");
        }

        // Practice Problem 3 :

        float[] Marks = {78.3f, 23.9f, 65.4f, 87.2f, 56.2f};
        float sum = 0;
        for(float element : Marks){
            sum = element + sum;
        }
        System.out.println(sum/Marks.length);

        // Practice Problem 4 :

        int [][] mat1 = {{5, 6, 7},{7, 9, 54}};
        int [][] mat2 = {{12, 32, 5},{32, 43, 2}};
        int [][] result = {{0, 0, 0},{0, 0, 0}};

        for(int i = 0; i<mat1.length; i++){        // Row number of times
            for(int j=0; j<mat1[i].length; j++){   // Column number of times
                System.out.printf("Setting value of i = %d and j = %d \n" ,i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
        for(int i = 0; i<mat1.length; i++){        // Row number of times
            for(int j=0; j<mat1[i].length; j++){   // Column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

        // Practice Problem 5 :

        int[] arr = {1,2,3,4,5,6,7};
        int n = Math.floorDiv(arr.length, 2);
        int l = arr.length;
        int temp;
        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // |3| |4| |temp|
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element : arr){
            System.out.print(element +" ");
        }

        // Practice Problem 6 :

        int[] arr = {1,-567,-3,9566,5,6,7};
        int max = Integer.MIN_VALUE;
        for(int e : arr){
            if (e>max){
                max = e; 
            }
        }
        System.out.println("The value of the maximum element is :" +max);

        // Practice problem 7 :
        
        boolean isSorted = true;
        int[] arr = {1,2,3,4,5,6,7};
        for(int i = 0; i<arr.length-1; i++){
            if ( arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is Sorted.");
        }
        else{
            System.out.println("The array is not Sorted.");
        }
        */
    }   
}
