import java.io.*;

class SpecialCharacter
{
  public static void main(String args[])throws Exception
  {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s;
    System.out.print("Enter a string: ");
	s=br.readLine();
	int c=0;
	char t;

	for(int i=0;i<s.length();i++)
	{
		t=s.charAt(i);
		if(t>=48 && t<=57)

		 else if(t>=97 && t<=122)
		 else if(t>=65 && t<=90)
		 else if(t==32)
		else
		  c++;
	}
 System.out.println("number of special characters="+c);
}
}



