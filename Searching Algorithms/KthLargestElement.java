import java.util.*;
public class Main
{
    public static int partition(int[] arr, int low, int high){

        int pivot=arr[high];
        int index=low;
        
        for (int i=low;i<=high;i++) {

            if (arr[i]<pivot) {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
  
 
        int temp=arr[high];
        arr[high]=arr[index];
        arr[index]=temp;
  
        return index;
    
    }
    public static int KthLargest(int[] arr, int low, int high, int k){
        
        int p=partition(arr,low,high);
        
        if(p==k){
            return p;
        }
        else if(p<k-1){
            return KthLargest(arr,p+1,high,k);
        }
        else{
            return KthLargest(arr,low,p-1,k);
        }
        
    }
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
	    int result=KthLargest(arr,0,n-1,k);
	    
	    System.out.print(result);
	}
}
