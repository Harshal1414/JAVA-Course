interface camera1{
    void takeSnap();
    void recorsVideo();
    default void recordingIn4k(){
        System.out.println("Recording in 4k... ");
    }
}
interface WiFi1{
    String [] getNetworks();
    void connetToNetwork(String Network);

}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println(("Calling "+phoneNumber));
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements WiFi1, camera1 {
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recorsVideo(){
        System.out.println("Recording Video");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networklist = {"Harshal", "Ravi", "Harshit", "Harsh"};
        return networklist;
    }
    public void connetToNetwork(String Network){
        System.out.println("Connecting to "+Network);
    }
    
}
public class Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        camera1 ca = new MySmartPhone1();
        // ca.getNetworks();  --> Not Allowed
        ca.takeSnap();
        
    }
}
