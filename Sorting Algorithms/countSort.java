import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int max=0;
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		
		int[] count=new int[max+1];
		for(int i=0;i<n;i++){
		    count[arr[i]]++;
		}
		
		for(int i=1;i<=max;i++){
		    count[i]=count[i]+count[i-1];
		}
		
		int[] res=new int[n];
		for(int i=n-1;i>=0;i--){
		    res[count[arr[i]]-1]=arr[i];
		    count[arr[i]]--;
		}
		
		for(int i=0;i<n;i++){
		    arr[i]=res[i];
		}
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
