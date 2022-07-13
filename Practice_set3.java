import java.util.Scanner;
public class Practice_set3{
    public static void main(String[] args) {
        // Question 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Marks of PHYSICS : ");
        // Byte Subject1 = sc.nextByte();
        // System.out.println("Marks of CHEMISTRY : ");
        // Byte Subject2 = sc.nextByte();
        // System.out.println("Marks of MATHS : ");
        // Byte Subject3 = sc.nextByte();



        // float Percentage = (Subject1 + Subject2 + Subject3)/3.0f;
        // System.out.println("Total %age = "+Percentage);
        // System.out.print("Status : ");
        // if(Percentage >= 40 && Subject1 >= 33 && Subject2 >= 33 && Subject3>= 33){
        //     System.out.println("PASS");
        // }
        // else{
        //     System.out.println("FAIL");
        
        // //Question 2 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("What's the income in Lakhs per annum : ");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if (income < 2.5f){
        //     tax = tax + 0;
        // }
        // else if (income > 2.5f && income <= 5.0f){
        //     tax = tax + 0.05f * (income - 2.5f);
        // }
        // else if (income>5.0f && income<=10.0f){
        //     tax = tax + 0.05f * (income - 2.5f);
        //     tax = tax + 0.2f * (income - 5.0f);
        // }
        // else if (income>10.0f){
        //     tax = tax + 0.05f * (income - 2.5f);
        //     tax = tax + 0.2f * (income - 5.0f);
        //     tax = tax + 0.3f * (income - 10.0f);
        // }

        // System.out.println("The total tax paid by the employee is: " +tax);

        // Question 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}