import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double x1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y1=sc.nextDouble();
		double y2=sc.nextDouble();
		double z1=sc.nextDouble();
		double z2=sc.nextDouble();
		
		double dis1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		double dis2=Math.sqrt((y1-y2)*(y1-y2))+((z1-z2)*(z1-z2)));
	  double dis3=Math.sqrt((x1-x2)*(x1-x2))+((z1-z2)*(z1-z2)));
		
		double side=(dis1+dis2+dis3)/2;
		
		double area=Math.sqrt(side*(side-dis1)*(side-dis2)*(side-dis3));
		
		System.out.print(area);
		
	}
}
