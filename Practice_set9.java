class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am Circle parameterised contructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle{
    public int height;
    Cylinder2(int r, int h){
        super(r);
        this.height = h;
        System.out.println("I am Cylinder parameterised Constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Practice_set9 {
    public static void main(String[] args) {
        // Problem 1
        // Circle obj1 = new Circle(5);
        Cylinder2 obj = new Cylinder2(12,4);
        System.out.println(obj.volume());
    }
}
