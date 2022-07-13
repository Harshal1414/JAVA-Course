import java.util.Scanner;
public class practice_ques1 {
    public static void main(String[] args) {
        System.out.println("PERCENTAGE");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in Phsysics = ");
        int a = sc.nextInt();
        System.out.println("Marks in English = ");
        int b = sc.nextInt();
        System.out.println("Marks in Chemistry = ");
        int c = sc.nextInt();
        System.out.println("Marks in Computer = ");
        int d = sc.nextInt();
        System.out.println("Marks in athematics = ");
        int e = sc.nextInt();
        int percent = (a + b + c + d + e)/5;
        System.out.println("Percentage = " +percent);
    }
}
