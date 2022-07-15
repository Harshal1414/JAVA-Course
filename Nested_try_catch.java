import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int [5];
        marks [0] = 23;
        marks [1] = 98;
        marks [2] = 78;
        marks [3] = 86;
        marks [4] = 46;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter the value of Index : ");
            int i = sc.nextInt();
            try {
                System.out.println("Welcome to the nest..");
                try{
                    System.out.println(marks[i]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this Prograam");
    }
}
