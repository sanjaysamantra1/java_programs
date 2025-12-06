import java.io.*;

class  SurName
{
	public static void main(String[] args) throws Exception
	{
		String s="sanjay kumar samantra";
		
	   int last= s.lastIndexOf(' ');
	   int first=s.indexOf(' ');
	   String sur=s.substring(last+1);
	   String middle= s.substring(first+1, last);
	   String firstname= s.substring(0, first);
	   System.out.println(sur+" "+firstname+" "+middle);
	}
}
