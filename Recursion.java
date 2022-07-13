import java.util.Scanner;
public class Recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(n) = n * factorial(n-1)
    // A function is calling itself.
    
    static int factorial(int n){
         if( n==0 || n==1){
            return 1;
         }
         else{
            return n*factorial(n-1);    // used Recursion.
         }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Factorial : " +factorial(x));
    }
}

