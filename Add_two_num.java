import java.util.*;
public class Add_two_num{
    public static void main(String[] args){
        /*
        int num1 = 6;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("The sum of these numbers is: " +sum);
        */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            for (int j = 2; i <= n / 2; ++i) {
                if (n % i==0){
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}