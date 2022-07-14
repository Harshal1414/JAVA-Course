class PrSet1 extends Thread{
    public void run(){
        int i = 0;
        while(i<25){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("PSThread runnning...");
            i++;
        }
    }
}
class PrSet2 extends Thread{
    public void run(){
        int i = 0;
        while(i<25){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Goood MOoOrning...");
            i++;
        }
    }
}
public class Practice_set11 {
    public static void main(String[] args) {
        PrSet1 p1 = new PrSet1();
        p1.start();
        p1.setPriority(6);
        System.out.println(p1.getPriority());
        System.out.println(p1.getState());

        PrSet2 p2 = new PrSet2();
        p2.start();
        p2.setPriority(9);
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
    }
}
