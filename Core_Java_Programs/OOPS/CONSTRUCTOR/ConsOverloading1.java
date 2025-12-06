
public class ConsOverloading1
{
	ConsOverloading1()
	{
		System.out.println("This is 0-arg cons");
	}
	ConsOverloading1(int x)
	{
		System.out.println("This is 1-arg cons");
	}
	ConsOverloading1(int x,int y)
	{
		System.out.println("This is 2-arg cons");
	}
	public static void main(String[] args)
	{
		ConsOverloading1 ob1=new ConsOverloading1();
		ConsOverloading1 ob2=new ConsOverloading1(1,7);
		ConsOverloading1 ob3=new ConsOverloading1(4);
	}

}
