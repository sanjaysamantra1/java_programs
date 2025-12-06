// Default constructor provides the default values 
// to the object like 0, null etc. depending on the type.

class ConsTest2
{ 
	int i;
	String s;
	ConsTest2()
	{
		System.out.println("Zero arg constructor called "+i+" "+s);
	}
	public static void main(String args[])
	{
		ConsTest2 ob1=new ConsTest2();
		ConsTest2 ob2=new ConsTest2();
	}
}
