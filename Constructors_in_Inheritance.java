class Base1{   // Superclass
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor with value of x as : "+x);;
    }
}
class Derived1 extends Base1{  // "extends" is used for inheritence.   // Subclass
    Derived1(){
        // super(0);
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overloaded Derived class constructor with value of y as : " +y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am ChildOfDerived constructor ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded Childofderived constructor with value of z as : "+z);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1(23, 64);
        ChildOfDerived cd = new ChildOfDerived(32,67,23);
    }
}
