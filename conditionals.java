import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        if (age > 18){
            System.out.println("You can Drive!");
        }
        else if (age < 7){
            System.out.println("Thoda bada hoja bhai.");
        }
        else{
            System.out.println("Sorry, You cannot Drive!");
        }
    }
}
