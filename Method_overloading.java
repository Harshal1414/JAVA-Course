public class Method_overloading {
    static void foo(){
        System.out.println("Good Morning, Harshal");
    }

    static void foo(int a){
        System.out.println("Good Morning, "+a+" Harshal");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning, "+a+" Harshal");
        System.out.println("Good Morning, "+b+" Harshal");
    }

    static void change (int a){
        a = 67;
    }

    static void change2 (int[] arr){
        arr[0] = 47;
    }

    static void tellThought(){
        System.out.println("Good morning!!! May today bring you the joys of yesterday's hopes!");
    }

    public static void main(String[] args) {
        // tellThought();

        // Case 1: Changing the integer.
        // int x = 78;
        // change(x);
        // System.out.println("The value of x after running change is : "+x);   // It is not Possible.

        // // Case 2: Changing the array.
        // int[] Marks = {67, 89, 98, 65, 59};
        // change2(Marks);
        // System.out.println("The value of x after running change is : "+Marks[0]);  // It is possible.
        foo();
        foo(9239283);
        foo(67, 89);
        // a and b are parameters, 
        // And values assigned to parameters are Arguments.
        // Arguments are actual.
    }
}
