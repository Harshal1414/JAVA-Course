interface Bicycle{
    int a = 21;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface car{
    void spaceCapacity(int n);
    void wheels(int m);
}
class ElectricCycle implements Bicycle, car{  // here, we can implement more than 1 interface in the same class
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up");
    }
    public void spaceCapacity(int n){
        System.out.println(n+" Peoples");
    }
    public void wheels(int m){
        System.out.println(m+" Wheels");
    }
}
public class Interface {
    public static void main(String[] args) {
        ElectricCycle cy = new ElectricCycle();
        cy.applyBrake(7);
        // you can create properties in Interfaces.
        System.out.println(cy.a);
        // you cannot modify the properties as they are final
        // cy.a = 7238;  (not possible)
        System.out.println(cy.a);
        cy.wheels(6);
    }
}
