import java.util.*;
public class Associativity_of_operators {
    public static void main(String[] args) {
        //int a = 6*5-87/5;
        // System.out.println(a);
        // int b = 60/5-45*5;
        // System.out.println(b);
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        int nums, ans;
        int count = 0;
        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            if (n%2==0){
                ans = n*(n/2);
                System.out.println(ans);
            }
            else{
                ans = (n*(n/2)) + (n/2);
            }
            System.out.println(ans);
        }
    }
}
// Evaluated on the basis of their precedence and associativity!