import java.util.*;
public class Main
{
    public static int binarySearch(int[] arr, int low, int high, int target){
        
        int mid=(low+high)/2;
        if(low<high){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                high=mid-1;
            }
            else if(arr[mid]>target){
                low=mid+1;
            }
            binarySearch(arr,low,high,target);
        }
        return -1;
    }
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int target=sc.nextInt();
		
	    int result=binarySearch(arr,0,n-1,target);
	    if(result!=-1){
	        System.out.print("Position of the searched element is "+result);
	    }
	    else{
	        System.out.print("No element found");
	    }
	}
}
