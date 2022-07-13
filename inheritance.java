class Base{   // Superclass
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting X ");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a construstor.");
    }
}
class Derived extends Base{  // "extends" is used for inheritence.   // Subclass
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am setting Y");
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {

        // Creating an object of Base class
        Base b = new Base();
        b.setX(34);
        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setX(56);
        System.out.println(d.getX());
    }
}
