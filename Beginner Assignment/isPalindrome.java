import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(s);
		StringBuilder sb1=sb.reverse();
		String rev=sb1.toString();
		
		if(rev.equals(s)){
		    System.out.print("Palindrome");
		}
		else{
		    System.out.print("Not a Palindrome");
		}
	}
}
