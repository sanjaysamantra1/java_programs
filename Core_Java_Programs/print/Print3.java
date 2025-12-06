import java.io.*;
class Print3
{
	public static void main(String[] args)
	{
		System.out.println("welcome");

		PrintStream a=new PrintStream(System.out);
		a.println("hello");

		PrintStream b=System.out;
		b.println("GoodBye");
	}
}


