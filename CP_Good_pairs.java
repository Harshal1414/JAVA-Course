import java.util.*;
public class CP_Good_pairs {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int count = 0;
		    int temp = 0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i = 1;i<n;i++){
		        if(arr[i]==arr[i-1])
		        {
		            temp++;
		        }
		        else{
		            if(temp==1){
		                count++;
		            }
		            else if(temp>1)
		            {
		                count = count+count+temp+((temp*(temp-1))/2);
		            }
		            temp = 0;
		        }
		    }
		    if(temp == 0){
		        System.out.println(count);
		    }
		    else if(temp == 1){
		        System.out.println(count+1);
		    }
		    else{
		        System.out.println(count+temp+((temp*(temp-1))/2));
		    }
		}
	}
}
