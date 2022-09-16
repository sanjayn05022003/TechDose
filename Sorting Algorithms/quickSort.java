import java.util.*;
public class Main
{
    public static int partition(int[] arr,int low,int high){
        int i=low,j=high;
        
        int pivot=arr[i];
        
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        
        return j;
        
    }
    public static void quickSort(int[] arr,int low,int high){
        
        if(low<high){
            int m=partition(arr,low,high);
            
            quickSort(arr,low,m);
            quickSort(arr,m+1,high);
        }
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n+1];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		arr[n]=Integer.MAX_VALUE;
		
		quickSort(arr,0,n);
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
