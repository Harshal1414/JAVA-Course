import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();


        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 24:
                System.out.println("You are going to join a JOB!");
                break;
            case 60:
                System.out.println("You are retired!");
                break;
            default:
                System.out.println("ENJOY bro ENJOY!");

        System.out.println("THANKS, for using my java code.");
        }
    }
}