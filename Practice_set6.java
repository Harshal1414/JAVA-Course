public class Practice_set6 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n,i,n*i);
        }
    }

    static void pattern1(int n){   // n is number of rows.
        for(int i=0; i<=n;i++){
            for( int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int sumRec(int n){
        // Base condition
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }

    static void pattern2(int n){   // n is number of rows.
        for(int i=n; i>=0;i--){
            for( int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        
        // Practice Problem 1 :
        // multiplication(7); 

        // Practice Problem 2 :
        // pattern1(12);

        // Practice Problem 3 :
        // int c = sumRec(6);
        // System.out.println(c);

        // Practice problem 4 :
        // pattern2(5);

        // Practice Problem 5 :  // Fibonacci Series
        // int x = 8;
        // int result = fib(x);
        // System.out.println(result);
    }
}
