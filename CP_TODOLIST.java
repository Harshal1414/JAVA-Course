import java.util.Scanner;
public class CP_TODOLIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] pr = new int[n];
            int count = 0;
            for (int j=0;j<n;j++){
                pr[j]=sc.nextInt();
                if (pr[j]>=1000){
                    count++;
                }
            }System.out.println(count);
        }
    }
}
