
import java.io.*;
class ChangeCase
{
  public static void main(String args[])throws Exception
  {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	char ch; char ch1;
	System.out.print("enter a character: ");
	ch=(char)br.read();
	if(Character.isUpperCase(ch)==true)
	{
		ch1=Character.toLowerCase(ch);
		System.out.println("character in lowercase is: "+ch1);
		System.out.println("Ascii value is: "+(int)ch1);
	}
	else
	{
		ch1=Character.toUpperCase(ch);
		System.out.println("character in Uppercase is: "+ch1);
		System.out.println("Ascii value is: "+(int)ch1);
	}
  }
}


