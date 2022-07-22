import java.util.*;
public class CP_Buylamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();  // total lamps
            int k = sc.nextInt();  // total red lamps
            int x = sc.nextInt();  // Red lamps
            int y = sc.nextInt();  // Blue lamps
            int m = n-k;  // total blue lamps
            int tot = (k*x)+(m*y);
            System.out.println(tot);
        }
    }
}
