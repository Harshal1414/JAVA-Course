interface camera{
    void takeSnap();
    void recorsVideo();
    default void recordingIn4k(){
        System.out.println("Recording in 4k... ");
    }
}
interface WiFi{
    String [] getNetworks();
    void connetToNetwork(String Network);

}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println(("Calling "+phoneNumber));
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements WiFi, camera {
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
public class Interfaces_examples {
    public static void main(String[] args) {
        MySmartPhone mc = new MySmartPhone();
        mc.recordingIn4k();
        String[] ar = mc.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
    }
}
