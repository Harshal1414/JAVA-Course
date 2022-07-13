abstract class Parent1{
    public Parent1(){
        System.out.println("Mai Parent 1 ka constructor hun");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child1 extends Parent1{
    @Override
    public void greet(){
        System.out.println("Goood Morrrning");
    } 
} 

public class Abstract{
    public static void main(String[] args) {
        // Parent1 pc = new Parent1();  // we cannot create an object of an abstract class
        Child1 ch = new Child1(); 
    }
}

/*
 * Shape --> Abstract class
 * 
 * methods --> area, perimeter, volume
 * subclass --> circle, rectangle, cylinder
 * 
 * then all the subclasses must have all the abstract methods or 
 * the class must be declared "abstract"
 */