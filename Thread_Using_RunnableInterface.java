class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("Thread 1 using Runnable interface");
            System.out.println("I am loving");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){int i = 0;
        while(i<30){
            System.out.println("Thread 2 using Runnable interface");
            System.out.println("I am loving");
            i++;
        }
    }
}
public class Thread_Using_RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
