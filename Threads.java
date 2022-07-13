class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("My cooking Thread1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("My Chatting Thread2 is running");
            System.out.println("I am loving");
            i++;
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        m1.start();
        MyThread2 m2 = new MyThread2();
        m2.start();
    }
}
