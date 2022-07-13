class Phone{
    public void name(){
        System.out.println("My name is JAVA in class 1");
    }
    public void greet(){
        System.out.println("Good Morning!");
    }
}
class SmartPhone extends Phone{
    public void name(){
        System.out.println("My name is JAVA in class 2");
    }
    public void abc(){
        System.out.println("Aapka swagat h");
    }
}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smph = new SmartPhone();
        // obj.name();

        Phone objc = new SmartPhone();  // Possible
        // SmartPhone objc2 = new Phone();  // Not Possible
        objc.name();
    }
}
