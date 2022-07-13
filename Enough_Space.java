import java.util.Scanner;
public class Enough_Space {
    public static void main (String[] args)
	{
		/*
        int N;
		int X;
		int Y;
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Free Space in the computer : ");
            N = sc.nextInt();
            System.out.println("No. of X files : ");
            X = sc.nextInt();
            System.out.println("No. of Y files : ");
            Y = sc.nextInt();
		
            if((X + 2*Y)<=N){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        */
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0;i<T; i++){
		    // System.out.print("Total no. of pages in the book : ");
		    int N = sc.nextInt();
		    // System.out.print("No. of words on each page : ");
		    int M = sc.nextInt();
		    
		    int X = N*M;
		    System.out.println("total no. of words in the book : "+X);
		}
	}
}


