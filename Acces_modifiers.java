class MyEmployee{
    private int id;
    private String name;

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
public class Acces_modifiers {
    public static void main(String[] args) {
        MyEmployee harsh = new MyEmployee();
        // harsh.id = 786768;
        // harsh.name = "Harsh Patel";  --> Throws an Error due to private acces modifier.
        harsh.setName("Harsh Patel");
        System.out.println(harsh.getName());
        harsh.setId(78676);
        System.out.println(harsh.getId());
    }
}
