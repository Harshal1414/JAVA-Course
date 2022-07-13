import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String name = new String("HARRY");
        //String name = "HARSHAL";
        //System.out.print("The name is: ");
        //System.out.println(name);
        //int a = 56;
        //float b = 0.78f;
        //System.out.printf("the age is %d and bone strength is %.2f ", a,b);
        Scanner sc = new Scanner(System.in);
        //String st = sc.next();      // This only prints the First word of the line.
        String st = sc.nextLine();    // Whole sentence will be printed.
        System.out.println(st);
    }
}
// We use:
//     %d = Int, Double
//     %f = Float
//     %c = Char
//     %s = String