class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myname, int myid){
        name = myname;
        id = myid;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("Beast of game", 20);
        // harry.setName("Harshal");
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
