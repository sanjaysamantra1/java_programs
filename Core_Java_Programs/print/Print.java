import java.io.*;
class Print
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

/*
class PrintStream
{
    public void println(){}    //member function
    ...
}
class System
{
    public static final PrintStream out;   //data member
    ...
}  */
