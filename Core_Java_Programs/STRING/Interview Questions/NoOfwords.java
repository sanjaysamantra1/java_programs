import java.util.*;

class NoOfwords
{
 public static void main (String args[])
 {
	int bs=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	String str=s.nextLine();

	for(int i=0;i<str.length();i++)
	{
	  if(str.charAt(i)==' ')
	   bs++;
	}
	System.out.println("no of blank spaces= "+bs);
	System.out.println("no of words= "+(bs+1));
  }
}