class Cylinder{
    private int Radius;
    private int Height;

    public void setRadius(int r){
        Radius = r;
    }
    public int getRadius(){
        return Radius;
    }
    public void setHeight(int h){
        Height = h;
    }
    public int getHeight(){
        return Height;
    }
    public double surfaceArea(){
        return 2*Math.PI*Radius*Radius + 2*3.14*Radius*Height;
    }
    public Cylinder(int rd, int ht){
        Radius = rd;
        Height = ht;
    }
}
public class Practice_set8 {
    public static void main(String[] args) {
        Cylinder LPG = new Cylinder(9,12);
        LPG.setRadius(3);
        LPG.setHeight(3);
        System.out.println(LPG.getRadius());
        System.out.println(LPG.getHeight());
        System.out.println(LPG.surfaceArea());
    }
}