class MyNewThr1 extends Thread{
    
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Thank you... ");
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Thank you s0 much... ");
            i++;
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        MyNewThr2 t2 = new MyNewThr2();
        t2.start();
    }
}
