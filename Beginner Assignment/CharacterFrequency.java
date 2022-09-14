import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
		    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		for(char ch:map.keySet()){
		    System.out.println(ch+" "+map.get(ch));
		}
	}
}
