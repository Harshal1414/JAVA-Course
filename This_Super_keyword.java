class EkClass{
    int a;

    EkClass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hun");
    }
}
public class This_Super_keyword {
    public static void main(String[] args) {
        EkClass ek = new EkClass(434);
        DoClass dc = new DoClass(5);
        System.out.println(ek.getA());
    }
}