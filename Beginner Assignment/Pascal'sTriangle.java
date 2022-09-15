import java.util.*;
public class Main
{
    public static int fact(int n){
        if(n==0) return 1;
        else{
            return n*fact(n-1);
        }
    }
    public static int nCr(int n,int r){
        int number=fact(n)/(fact(r)*fact(n-r));
        return number;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
		    for(int j=0;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++){
		        System.out.printf("%3d",nCr(i,j));
		    }
		    System.out.println();
		}
	}
}
