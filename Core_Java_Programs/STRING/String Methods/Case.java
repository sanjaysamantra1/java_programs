import java.io.*;
class Case
{
  public static void main(String args[])throws Exception
  {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	char ch;
    System.out.print("Enter a character: ");
	ch=(char)br.read();

	if(Character.isLetter(ch))
	 {
		System.out.println("It is a character");
		if(Character.isUpperCase(ch)==true)
		{
		  System.out.println("character is in uppercase");
		}
		//if(Character.isLowerCase(ch)==true)
		else
		{
		  System.out.println("character is in lowercase");
		}
	 }
	else if(Character.isDigit(ch))
	  {
		System.out.println("It is a digit");
	  }
    else
		System.out.println("It is a specialcharacter");
  }
}


