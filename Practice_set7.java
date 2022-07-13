class Employee5{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void calll(){
        System.out.println("Calling...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
public class Practice_set7 {
    public static void main(String[] args) {
        // Practice Problem 1 :
        /* 
        Employee harry = new Employee();
        harry.salary = 345345;
        // harry.setName("CodeWithHarry");
        // System.out.println(harry.getName());
        System.out.println(harry.getSalary());

        // Practice Problem 2 :

        Cellphone iphone = new Cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.calll();
        
        // Practice Problem 3 :

        Square sq = new Square();
        sq.side = 7;
        System.out.println( sq.area());
        System.out.println( sq.perimeter());
        
        // Practice Problem 4 :

        Rectangle rc = new Rectangle();
        rc.length = 5;
        rc.width = 6;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
        */
    }
}
