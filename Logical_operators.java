public class Logical_operators {
    public static void main(String[] args) {
        System.out.println("For Logical AND -");

        Boolean a = true;
        Boolean b = true;
        Boolean c = true;

        if (a && b && c){
            System.out.println("Y");   // If all TRUE.
        }
        else{
            System.out.println("N");   // Atleast one FALSE.
        }
        
        System.out.println("For Logical OR -");

        Boolean m = false;
        Boolean n = false;
        Boolean o = false;

        if (m || n || o){
            System.out.println("Y");   // Atleast one TRUE.
        }
        else{
            System.out.println("N");   // If all FALSE
        }
        
        System.out.println("For Logical NOT -");   // Returns opposite.(True becomes False, and False becomes TRUE.)
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
