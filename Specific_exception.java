import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Specific_exception {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 43;
        marks[2] = 89;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Index ");
        int i = sc.nextInt();

        System.out.println("Enter the number you want to devide the value with ");
        int j = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[i]);
            System.out.println("The value of array-value/number is: " + marks[i]/j);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
