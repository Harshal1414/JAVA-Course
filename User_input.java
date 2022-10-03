import java.util.Scanner;
public class User_input {

    public static void main(String[] args){
        // System.out.println("Taking User input!");
        // Scanner hg = new Scanner(System.in);
        // System.out.println("Enter First Number = ");
        // int a = hg.nextInt();
        // System.out.println("Enter Second Number = ");
        // int b = hg.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of these numbers is " +sum);
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int x = sc.nextInt();
		    int page = x/25;
		    System.out.println(page);
        }
    }
}