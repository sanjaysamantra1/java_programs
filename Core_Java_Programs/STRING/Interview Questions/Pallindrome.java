import java.util.*;

public class Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string::");
		String str=s.next();

		if(isPallindrome(str)==true)
		  System.out.println("pallindrome");
		else
		  System.out.println("not pallindrome");
	}
	public static boolean isPallindrome(String s)
	{
		if(s==null)
		  return false;
		else{
		 StringBuilder sb=new StringBuilder(s);
		 sb.reverse();
		   return sb.toString().equals(s);
		}
	}
}