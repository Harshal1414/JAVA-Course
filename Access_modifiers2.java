class C1{
    public int x = 5;
    protected int y = 52;
    int z = 89;
    private int w = 8327;
    
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
public class Access_modifiers2 {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.w);   // Private file 
    }
}

// Modifier	Class	Package	  Subclass	World
// public	    Y	   Y	      Y	      Y
// protected	Y	   Y	      Y       N
// no modifier	Y	   Y	      N	      N
// private	    Y	   N	      N	      N
