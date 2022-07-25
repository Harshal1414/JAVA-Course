import java.util.Scanner;
public class CP_TODOLIST {
    public static void main(String[] args) {
        /*
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
        */
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t;i++){
		    int x = sc.nextInt();  // cost of premium brgr
		    int y = sc.nextInt();  // cost of premium brgr
		    int n = sc.nextInt();  // brgr chef want to buy
		    int r = sc.nextInt();  // rupees chef have
		    
		    int count = 0;
		    if((r/y)>=n){
		        if (r%y==0){
		            System.out.println(n);
		            System.out.println(0);
		        }
		        
		    }
            else{
                System.out.println(-1);
            }
        }
    }
}
