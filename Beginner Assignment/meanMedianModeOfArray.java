import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int sum=0;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    sum+=arr[i];
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		
		int len=arr.length;
		
		double mean=sum/len;
		Arrays.sort(arr);
		
		double median=(len%2==0)?((arr[len/2]+arr[(len/2)-1])/2):arr[len/2];
		int max=0;
		int mode=0;
		
		for(int i:map.keySet()){
		    if(map.get(i)>max){
		        max=map.get(i);
		        mode=i;
		    }
		    
		}
		System.out.print("Mean= "+(double)mean+" Median= "+(double)median+" Mode= "+mode);
		
	}
}
