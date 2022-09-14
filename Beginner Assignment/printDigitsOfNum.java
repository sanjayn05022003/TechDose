import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String s=""+n;
		
		StringBuilder sb=new StringBuilder(s);
		StringBuilder ss=sb.reverse();
		String rev=ss.toString();
		
		int revint=Integer.parseInt(rev);
		
		while(revint>0){
		    System.out.print(revint%10+" ");
		    revint/=10;
		}
		
	}
}
