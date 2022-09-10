import java.util.*;
public class Main
{
    public static boolean isprime(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.print(isprime(a));
	}
}
