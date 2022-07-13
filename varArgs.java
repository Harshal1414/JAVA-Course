public class varArgs {
    
    // static int sum(int x, int ...arr){    // Atleast one integer is required now
    static int sum(int ...arr){
        // Available as int[] arr;
        // int result = x; 
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 6 and 3 is " + sum(6,3));
        System.out.println("The sum of 78, 98, 723 is " +sum(78,98,723));
        System.out.println("The sum of 6, 9, 8, 5 is " + sum(6,9,8,5));
    }
}
