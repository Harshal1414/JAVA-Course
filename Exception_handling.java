public class Exception_handling {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to devide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
