// Parameterized constructor is used to provide different
// values to the distinct objects
class ConsTest3
{
	int x;
	String y;
	ConsTest3(int a,String b)
	{
		x=a;
		y=b;
	}
	public static void main(String args[])
	{
		ConsTest3 ob1=new ConsTest3(1,"hello");
		ConsTest3 ob2=new ConsTest3(2,"hey");
		System.out.println(ob1.x+" "+ob1.y);
		System.out.println(ob2.x+" "+ob2.y);
	}
}
