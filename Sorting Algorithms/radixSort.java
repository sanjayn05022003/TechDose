import java.util.*;
public class Main
{
    public static void radixSort(int[] arr,int n,int place,int max){
        
        int[] ret=new int[n];
        int[] count=new int[max+1];
        
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            ret[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        
        for(int i=0;i<n;i++){
            arr[i]=ret[i];
        }
    }
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
		
		int place;
		for(place=1;max/place>0;place*=10){
		    radixSort(arr,n,place,max);
		}
	    
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	
	}
}
