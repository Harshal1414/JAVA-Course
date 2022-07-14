class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("I am a Thread");
            i++;
        }
    }
}
public class Thread_Construtor {
    public static void main(String[] args) {
        MyThr t = new MyThr ("Harshall");
        t.start();
        System.out.println("The ID of Thread t is "+t.getId());
        System.out.println("The name of Thread t is "+t.getName());
    }
}
