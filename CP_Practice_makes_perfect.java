import java.util.Scanner;
public class CP_Practice_makes_perfect {
    public static void main(String[] args) {
        
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[4];
        int count = 0;

        for(int i=0; i<4;i++){
            p[i]= sc.nextInt();
            if(p[i]>=10){
                count++;
            }
        }
        System.out.println(count);
    }
    */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x<y){
                System.out.println("FIRST");
            }
            else if (x==y){
                System.out.println("ANY");
            }
            else{
                System.out.println("SECOND");
            }
        }
    }
}
