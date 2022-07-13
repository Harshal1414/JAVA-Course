abstract class Pen{
    abstract void write();
    abstract void refill();
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writting");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping from one tree to another tree");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating Something...");
    }
    public void sleep(){
        System.out.println("Sleeping...z");
    }
}
public class Practice_set10 {
    public static void main(String[] args) {
        // Problem 1 and 2
        FountainPen fv = new FountainPen();
        fv.changeNib();

        // Problem 3
        human har = new human();
        har.eat();
        har.sleep();

        // Problem 5
        Monkey mn = new human();
        mn.jump();
    }
}
