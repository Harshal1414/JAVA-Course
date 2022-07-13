public class Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z=(x+y)*5;
        }
        x=67;  // This will not affect anything in the main method.
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        // Method invocation using object creation
        // Methods obj = new Methods();
        // c = obj.logic(a,b);
        // Note: If static is not used above then object is used, otherwise not.
        c = logic(a, b);
        System.out.println(c);
    }
}