import java.util.Scanner;
public class CP_SmallFactorials {
    static int factorial(int n){
        if( n==0 || n==1){
           return 1;
        }
        else{
           return n*factorial(n-1);    // used Recursion.
        }
   }
   public static void main (String[] args)
   {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int e = sc.nextInt();
            int[] pr = new int[e];
            for(int j=0;j<e;j++){
                pr[j]=sc.nextInt();
                int x = factorial(pr[j]);
                System.out.println();
            }
        }
    }
}






